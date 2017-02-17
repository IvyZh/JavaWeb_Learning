> 传智播客-duhong换老师了。。。

> 录制时间：2014.12.5

## 1.课程介绍

	今天内容：
		1.jdbc介绍
		2.快速入门
		3.jdbc api详解(重点)
		4.使用dao模式登录操作
			sql注入
			PreparedStatement(重点)
		5.jdbc处理大数据
		6.jdbc批处理

## 2.jdbc介绍

	1.jdbc介绍
		问题:jdbc是什么?
			JDBC（Java Data Base Connectivity,java数据库连接)
			简单说:就是可以直接通过java语言，去操作数据库。
			
		jdbc是一套标准,它是由一些接口与类组成的。
		
		学习中涉及到的类与接口
			它们主要在两个包下
				java.sql
					类:DriverManger
					接口  Connection Statement ResultSet  PreparedStatement
							CallableStatement（它是用于调用存储过程）
				javax.sql
					接口 DataSource
				
		
		什么是驱动?
			 两个设备要进行通信，满足一定通信数据格式，数据格式由设备提供商规定，设备提供商为设备提供驱动软件，
			 通过软件可以与该设备进行通信

## 3.jdbc快速入门

	2.jdbc入门
		编写一个jdbc入门代码，完成对数据库操作.
			create table user(
			   id int primary key auto_increment,
			   username varchar(20) unique not null,
			   password varchar(20) not null,
			   email varchar(40) not null
			);
			
			INSERT INTO USER VALUES(NULL,'tom','123','tom@163.com');
			INSERT INTO USER VALUES(NULL,'fox','123','fox@163.com');	
			
		1.下载驱动
			将驱动jar包复制到lib下.
		2.创建一个JdbcDemo1类	
				// 1.注册驱动
				DriverManager.registerDriver(new Driver());
	
				// 2.获取连接对象
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/day17", "root", "abc");
	
				// 3.通过连接对象获取操作sql语句Statement
				Statement st = con.createStatement();
	
				// 4.操作sql语句
				String sql = "select * from user";
	
				// 操作sql语句(select语句),会得到一个ResultSet结果集
				ResultSet rs = st.executeQuery(sql);
	
				// 5.遍历结果集
				// boolean flag = rs.next(); // 向下移动，返回值为true，代表有下一条记录.
				// int id = rs.getInt("id");
				// String username=rs.getString("username");
				// System.out.println(id);
				// System.out.println(username);
				
				while(rs.next()){
					int id=rs.getInt("id");
					String username=rs.getString("username");
					String password=rs.getString("password");
					String email=rs.getString("email");
					
					System.out.println(id+"  "+username+"  "+password+"  "+email);
				}
				
				//6.释放资源
				rs.close();
				st.close();
				con.close();

## 4.DriverManager详解

![](http://1)

	jdbc操作详解
			1.注册驱动
				DriverManager.registDriver(new Driver());
				
				1.DriverManager类
					它是java.sql包下的一个驱动管理的工具类,可以理解成是一个容器(Vector),可以装入很多数据库驱动
					
					它的registDriver方法分析
						  public static synchronized void registerDriver(java.sql.Driver driver)
						  参数:java.sql.Driver
						  我们传递的是  com.mysql.jdbc.Driver;
						  
					在com.mysql.jdbc.Driver类中有一段静态代码块:
						
						static {
							try {
								java.sql.DriverManager.registerDriver(new Driver());
							} catch (SQLException E) {
								throw new RuntimeException("Can't register driver!");
							}
						}
					上述代码的问题:
						1.在驱动管理器中会装入两个mysql驱动.
							解决方案:使用反射
									Class.forName("com.mysql.jdbc.Driver");
									
					分析:使用反射的方式来加载驱动有什么好处?
						1.只加载一次，装入一个驱动对象.
						2.降低耦合，不依赖于驱动.
						
				2.可以通过DriverManager来获取连接对象
					Connection con=DriverManager.getConection(String url,String user,String password);
						url作用:就是用于确定使用哪一个驱动.
							mysql url:  jdbc:mysql://localhsot:3306/数据库名.
							oralce url: jdbc:oracle:thin:@localhost:1521:sid
		
				总结:DriverManager作用:
					1.注册驱动
					2.获取连接Connection

## 5.url介绍

	关于url
			url格式
				主协议  子协议   主机 端口  数据库
				jdbc   :  mysql ://localhost:3306/day17
				
			mysql的url可以简写:
				前提：主机是localhost 端口是3306
				jdbc:mysql:///day17
				
			了解:在url后面可以带参数
				useUnicode=true&characterEncoding=UTF-8


## 6.Connection介绍

	2.Connection详解
		java.sql.Connection，它代表的是一个连接对象。简单说，就是我们程序与数据库连接。
		
		Connection作用:
			1.可以通过Connection获取操作sql的Statement对象。
				Statement createStatement() throws SQLException
				示例:
				Statement st=con.createStatement();
				
				了解:
					1.可以获取执行预处理的PreparedStatement对象.
						PreparedStatement prepareStatement(String sql) throws SQLException
					2.可以获取执行存储过程的 CallableStatement
						CallableStatement prepareCall(String sql) throws SQLException
			2.操作事务
				setAutoCommit(boolean flag);开启事务
				rollback();事务回滚
				commit();事务提交

## 7.Statement介绍


	3.Statement详解
		java.sql.Statement用于执行sql语句.
		Statement作用:
			1.执行sql
				DML:insert update delete
					int executeUpdate(String sql)
					
					利用返回值判断非0来确定sql语句是否执行成功。
					
				DQL:select
					ResultSet executeQuery(String sql)
					
				可以通过execute方法来执行任何sql语句.
					execute(String sql)：用于向数据库发送任意sql语句

			2.批处理操作
				addBatch(String sql); 将sql语句添加到批处理
				executeBatch();批量执行
				clearBatch();清空批处理.

## 8.ResultSet介绍

	4.ResultSet详解
		java.sql.ResultSet它是用于封装select语句执行后查询的结果。
		
		常用API
			1.next()方法
				public boolean next();
					用于判断是否有下一条记录。如果有返回true,并且让游标向下移动一行。
					如果没有返回false.
					
			2.可以通过ResultSet提供的getXxx()方法来获取当前游标指向的这条记录中的列数据。
				常用:
					getInt()
					getString()
					getDate()
					getDouble()
					参数有两种
						1.getInt(int columnIndex);
						2.getInt(String columnName);
						
					如果列的类型不知道，可以通过下面的方法来操作
						getObject(int columnIndex);
						getObject(String columnName);



## 9.关闭资源与异常处理

	5.关闭资源
		Jdbc程序运行完后，切记要释放程序在运行过程中，创建的那些与数据库进行交互的对象，这些对象通常是ResultSet, Statement和Connection对象。

		特别是Connection对象，它是非常稀有的资源，用完后必须马上释放，如果Connection不能及时、正确的关闭，极易导致系统宕机。Connection的使用原则是尽量晚创建，尽量早的释放。

		为确保资源释放代码能运行，资源释放代码也一定要放在finally语句中。



## 10.jdbc的crud操作

![](http://2)


## 11.JdbcUtils工具抽取


	关于JdbcUtils抽取:
		只抽取到Connection。
		
		public static Connection getConnection() throws ClassNotFoundException,
			SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		// 2.获取连接
		Connection con = DriverManager.getConnection("jdbc:mysql:///day17",
				"root", "abc");

		return con;
	}
	
	关于上述的抽取JdbcUtils的缺点:
		1.它只能针对于mysql数据库。
		2.每一次调用，都会注册一次驱动.
		
	对于上述问题，对JdbcUtils进行修改:
		1.将关于连接数据库的信息定义到配置文件中。
		  读取配置文件进行加载.		
	
			public class JdbcUtils {

				private static final String DRIVERCLASS;
				private static final String URL;
				private static final String USERNAME;
				private static final String PASSWORD;

				static {
					DRIVERCLASS = ResourceBundle.getBundle("jdbc").getString("driverClass");
					URL = ResourceBundle.getBundle("jdbc").getString("url");
					USERNAME = ResourceBundle.getBundle("jdbc").getString("username");
					PASSWORD = ResourceBundle.getBundle("jdbc").getString("password");
				}

				static {
					try {
						// 将加载驱动操作，放置在静态代码块中.这样就保证了只加载一次.
						Class.forName(DRIVERCLASS);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				}

				public static Connection getConnection() throws SQLException {

					// 2.获取连接
					Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

					return con;
				}
			}

![](http://3)


===

pm.
## 12.复习



## 13.滚动结果集介绍
## 14.dao模式介绍
## 15.登录操作案例
## 16.关于sql注入与PreparedStatement介绍
## 17.注册操作分析(作业)
## 18.关于自定义异常
## 19.大二进制操作
## 20.大文本操作
## 21.批处理
## 22.复习


--------------

Day02 End.


[print]


	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)