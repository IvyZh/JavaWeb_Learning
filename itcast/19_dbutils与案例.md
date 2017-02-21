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



## 8.dbutils核心介绍
## 9.QueryRunner详解
## 10.ResultSetHandler介绍
## 11.模仿QueryRunner实现
## 12.复习
## 13.ResulSetHandler九个实现类介绍
## 14.模仿BeanHandler实现
## 15.扩展--使用BeanUtils实现
## 16.customer案例--查询全部
## 17.customer案例--删除操作
## 18.customer案例--修改操作
## 19.使用自定义标签解决显示问题
## 20.虚拟主机介绍
## 21.复习与作业


--------------

Day02 End.



[print]


	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)