> 传智播客-铁男

> 录制时间：2014.11.11
## 1.复习

	今天内容
		1.tomcat内置连接池管理.(了解)
		2.元数据
		3.dbutils工具(重点)
		4.案例
	-------------------------------------------------
	复习:
		1.事务		
		2.连接池


## 2.tomcat管理内置连接池

![](http://1)

修改：path="/"

![](http://2)

![](http://3)

## 3.元数据介绍

> 问题:元数据是什么，有什么作用?	

元数据(metaData)  指数据库中 库、表、列的定义信息 

DataBaseMetaData ParameterMetaData ResultSetMetaData

## 4.DataBaseMetaData介绍

![](http://4)

## 5.ParameterMetaData介绍

	2.ParameterMetaData 参数元数据
		参数元数据主要用于获取:sql语句中占位符的相关信息.
		
		问题:怎样获取ParameterMetaData?
			在PreparedStatement中有一个方法getParameterMetaData可以获取.
			
		问题:怎样使用?
			int count = pmd.getParameterCount(); // 获取参数 个数
			System.out.println(count);
			
			String type1 = pmd.getParameterTypeName(1);//获取参数的类型
			System.out.println(type1);
			
			注意：在获取参数类型时会产生异常
				java.sql.SQLException: Parameter metadata not available for the given statement
			解决方案:
				在url后添加参数
				jdbc:mysql:///day18?generateSimpleParameterMetadata=true
			添加这个参数后，我们在获取，它的结果也是varchar,原因:是mysql驱动的支持问题。	


## 6.ResultSetMetaData介绍

	3.ResultSetMetaData 结果集元数据
		
		问题:怎样获取结果集元数据?
			可以通过ResultSet的getMetaData()方法获取.
			
		问题:怎样使用?
			System.out.println(rsmd.getColumnCount());//获取结果集中列数量
	
			System.out.println(rsmd.getColumnName(2));//获取结果集中指定列的名称.
			
			System.out.println(rsmd.getColumnTypeName(3));//获取结果集中指定列的类型。


## 7.dbutils工具介绍

	问题:dbutils是什么，有什么作用?
		它就是一个简单的jdbc封装工具.
		使用dbutils可以简化操作.
		要使用dbutils需要导入jar包. 
		


![](http://5)


## 8.dbutils核心介绍

![](http://6)

	dbutils核心
		1.QueryRunner类
			它是用于执行sql语句的类。
			1.query 用于执行select 
			2.update 用于执行update delete insert
			3.batch 批处理
		2.ResultSetHandler接口
			用于定义结果集的封装				
			它提供九个实现类，可以进行不同的封装。
		3.DbUtils类
			它提供关于关闭资源以及事务rollback,commit操作。

## 9.QueryRunner详解

![](http://7)

![](http://8)

![](http://9)



	Dbutlis详解
		1.QueryRunner
			1.QueryRunner怎样获取
				1.new QueryRunner()
					如果是使用这种构造创建的QueryRunner,它的事务是手动控制.
				2.new QueryRunner(DataSource ds);
					如果是使用这种构造，它的事务是自动事务，简单说，一条sql一个事务。
				
			2.QueryRunner中的三个核心方法
				query
				update
				batch
				对于上述三个方法，它们提供很多重载。
				如果QueryRunner在创建时，没有传递DataSource参数，那么在使用
				query,update,batch方法时，要传递Connection参数
				如果QueryRunner在创建时，传递了Dataource参数，那么在使用
				query,update,batch方法时，不需要传递Connection参数。
				
			总结:
				怎样配套使用:
					QueryRunner runner=new QueryRunner();
					runner.query(Connection,sql,ResultSetHandler,Object... param);
					runner.update(Connection,sql,Object...param);
					runner.batch(Connection con,sql,Object[][] objs);
					
					QueryRunner runner=new QueryRunner(DataSource ds);
					runner.query(sql,ResultSetHandler,Object... param);
					runner.update(sql,Object...param);
					runner.batch(sql,Object[][] objs);
					


## 10.ResultSetHandler介绍


	ResultSetHandler接口	
		用于封装结果集.


![](http://10)

## 11.模仿QueryRunner实现

![](http://11)

![](http://12)

![](http://13)

![](http://14)

![](http://15)

使用泛型进行优化




	模仿QueryRunner
		1.query方法模仿
			public <T> T query(Connection con, String sql, MyResultSetHandler<T> mrs,Object... params) throws SQLException {

					PreparedStatement pst = con.prepareStatement(sql); // 得到一个预处理的Statement.
					// 问题:sql语句中可能存在参数，需要对参数赋值。

					ParameterMetaData pmd = pst.getParameterMetaData();
					// 可以得到有几个参数
					int count = pmd.getParameterCount();
					for (int i = 1; i <= count; i++) {
						pst.setObject(i, params[i - 1]);
					}

					ResultSet rs = pst.executeQuery(); // 得到了结果集，要将结果集封装成用户想要的对象，但是，工具不可能知道用户需求。

					return mrs.handle(rs);
				}
		2.update方法模仿
			public int update(Connection con, String sql, Object... params) throws SQLException {

				PreparedStatement pst = con.prepareStatement(sql); // 得到一个预处理的Statement.
				// 问题:sql语句中可能存在参数，需要对参数赋值。

				ParameterMetaData pmd = pst.getParameterMetaData();
				// 可以得到有几个参数
				int count = pmd.getParameterCount();
				for (int i = 1; i <= count; i++) {
					pst.setObject(i, params[i - 1]);
				}

				int row = pst.executeUpdate();
				// 关闭资源
				pst.close();
				return row;
			}

===
pm。


## 12.复习



## 13.ResulSetHandler九个实现类介绍

	ResulsetHandler九个实现类
			
			 ArrayHandler, 将结果集中第一条记录封装到Object[],数组中的每一个元素就是记录中的字段值。
			 ArrayListHandler, 将结果集中每一条记录封装到Object[],数组中的每一个元素就是记录中的字段值。在将这些数组装入到List集合。
			
			 BeanHandler（重点）, 将结果集中第一条记录封装到一个javaBean中。
			 BeanListHandler(重点), 将结果集中每一条记录封装到javaBean中，在将javaBean封装到List集合.
			 
			 ColumnListHandler, 将结果集中指定列的值封装到List集合.
			 
			 MapHandler, 将结果集中第一条记录封装到Map集合中，集合的 key就是字段名称，value就是字段值
			 MapListHandler, 将结果集中每一条记录封装到Map集合中，集合的 key就是字段名称，value就是字段值，在将这些Map封装到List集合
			 
			 KeyedHandler,在使用指定的列的值做为一个Map集合的key,值为每一条记录的Map集合封装。
			 ScalarHandler 进行单值查询 select count(*) from account;

## 14.模仿BeanHandler实现


![](http://16)

![](http://17)

## 15.扩展--使用BeanUtils实现

![](http://18)

## 16.customer案例--查询全部


练习:

	登录成功后，访问到一个页面success.jsp，在页面上添加一个连接
	
	就是客户信息的CRUD操作.
	
	1.客户信息
	
		字段名	说明	类型
		Id	编号	varchar(40)
		name	客户姓名	varchar(20)
		gender	性别	varchar(10)
		birthday	生日	date
		cellphone	手机	varchar(20)
		email	电子邮件	varchar(40)
		preference	客户爱好	varchar(100)
		type	客户类型	varchar(40)
		description	备注	varchar(255)

		create table customer(
		   id varchar(40) primary key,
		   name varchar(20),
		   gender varchar(10),
		   birthday date,
		   cellphone varchar(20),
		   email varchar(40),
		   preference varchar(100),
		   type varchar(40),
		   description varchar(255)
		);
	2.搭建环境
		JavaEE 三层结构 
		Servlet + JSP + JavaBean+jstl + DBUtils+ DAO + MySQL 

		导入jar包 ：JSTL 、BeanUtils、DBUtils、C3P0、mysql驱动 

		创建包结构 
		cn.itcast.customer.web  表现层
		cn.itcast.customer.service 业务层
		cn.itcast.customer.dao 持久层
		cn.itcast.customer.utils 工具包
		cn.itcast.customer.domain 实体类  javaBean


		应用的jar文件
		1.	mysql驱动包
		2.	c3po包
		3.	dbutils包
		4.	BeanUtil包
		5.	JSTL包
		6.	c3p0的配置文件


SQL工具：SQLyoy Ultimate


![](http://19)

![](http://20)

![](http://21)

![](http://22)

![](http://23)

![](http://24)


	编写代码:
		1.创建Customer这个javaBean
			private String id;
			private String name;
			private String gender;
			private Date birthday;
			private String cellphone;
			private String email;
			private String preference;
			private String type;
			private String description;
			
		2.为了测试方便，向customer表中插入数据
			insert into customer values("a11","tom","男","2010-10-10","13888888888","tom@163.com","吃,喝,玩","vip","good man");
			insert into customer values("a11","fox","男","2000-10-10","13888888888","tom@163.com","吃,喝,玩","vip","good man");
			insert into customer values("a11","james","男","1990-10-10","13888888888","tom@163.com","吃,喝,玩","vip","good man");
			
			 
		3.实现查询所有客户信息操作
			1.在success.jsp页面添加连接
				<a href="${pageContext.request.contextPath}/findAll">查看所有客户信息</a>
			2.在CustomerFindAllServlet中调用service,在service中调用dao,最后得到一个List<Customer>.

			3.在showCustomer.jsp页面展示客户信息
				<c:forEach items="${cs}" var="c">
					<tr>
						<td><input type="checkbox">
						</td>
						<td>${c.id }</td>
						<td>${c.name}</td>
						<td>${c.gender }</td>
						<td>${c.birthday }</td>
						<td>${c.cellphone }</td>
						<td>${c.email }</td>
						<td>${c.preference }</td>
						<td>${c.type }</td>
						<td>${c.description }</td>
						<td><a>编辑</a>&nbsp;&nbsp;&nbsp;<a>删除</a></td>
					</tr>
				</c:forEach>


## 17.customer案例--删除操作


![](http://25)

	4.删除操作
		1.在showCustomer.jsp页面的删除连接上添加参数  客户的id
			<a href="${pageContext.request.contextPath}/delByid?id=${c.id}">删除</a>
		2.创建一个CustomerDelByIdServlet,获取请求参数,调用service中删除方法.
		
		问题:如果删除完成后，怎样处理?
			需要重新跳转到查询所有的servlet中，在重新查询数据。
				

![](http://26)

![](http://27)

## 18.customer案例--修改操作
## 19.使用自定义标签解决显示问题
## 20.虚拟主机介绍
## 21.复习与作业


--------------

Day02 End.



[print]


	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)