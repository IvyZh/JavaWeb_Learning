> 传智播客-铁男

> 录制时间：2014.11.11

## 01-课程回顾

* java基础加强
	* MyEclipse的简介	
		* cn.itcast.xxx创建的包
		* 创建类	User
		* 方法		runDemo()
		
	* DeBug调试（断点调试）
		* 打断点。选择DeBug As
		* Step Over		跳过	F6
		* Resume		执行下一个断点，如果没有断点，执行完成。F8
		* Step Into		跳入	F5
		* Step Return	跳出	F7
		* Drop To Frame	返回到最开始位置
		
	* JUnit	单元测试
		* 测试一个方法。
		* 使用的JUnit4的版本。导入jar包。myeclipse直接引入即可。
		* @Test第一次导包。
		
		* @Test		测试
		
	* MyEclipse快捷建
		
	* JDK5.0的特性
		* 泛型
			* 应用在集合上。
				
			* 编写通用性较强的代码。
				* 自定义泛型方法和类
				public <T> void run(T t){
					T t
				}
				
		* 枚举
			enum 类名称{
				BOSS("红色"),HR;
			}
			
		* 静态导入（鸡肋）
			
		* 增强for循环
			for(数据类型 变量 ：要循环的内容){
				
			}
			
		* 可变参数
			* int...nums
			* 可以nums当成数组。
			* 只能有一个可变参数，可变参数放在末尾。
			
		* 反射	
			* 通过.class文件获取类中的所有的内容。
			* 先获取Class对象
				* 类名	User.class;
				* 实例对象	new User().getClass();
				* Class.forName("类的包名+类名");
				
			* 构造器、属性、方法。获取到都是对象。	


## 02-作业

![](http://1)

![](http://2)

![](http://3)


## 03-网络架构


* WEB的学习
	* 服务器
		* 网络的架构（面试题）
			* C/S	client/server	客户端/服务器端		例子：QQ	快播	暴风影音
				* 优点：交互性好，服务器压力小。
				* 缺点：客户端更新了，下载。
				
			* B/S	browser/server	浏览器/服务器端		例子：购物网站	12306	
				* 缺点：服务器压力大。
				* 优点：服务器更新就ok。

## 04-WEB的简介

![](http://4)


* WEB网页	javaweb	使用java开发网页。
* 静态的web资源
	* HTML、CSS、JAVASCRIPT
* 动态的web资源	
	* 数据发生变化。例子：并不是页面动态，它就是动态web
	* Servlet/JSP	
	* ASP	.net	微软开发
	* PHP	开源（开发网站那速度真快），提供模板。
	* RUBY	小日本开发的。
	* JAVA做什么？后台的管理系统，处理大数据。

## 05-常见的服务器及tomcat服务器安装等

* 服务器的介绍
	* 原理：网络编程。
	* 概念：
		* 硬件：就是一台主机。
		* 软件：安装了服务器的软件（tomcat）。	
		* 安装软件后，称为WEB服务器。
		* 启动服务器，访问资源。
		* 访问：http://+ip+端口号	找到主机。如果资源的文件，就可以访问了。
		* 访问百度：http://www.baidu.com/
		* HTTP协议默认端口号是80，可以不写。
		* ping www.baidu.com	61.135.169.121
		
		* 如果想访问本机的服务器（扩展）
			* http://localhost:80
			* http://127.0.0.1:80

---


* 常见服务器
	* WebLogic	BEA公司开发的（被Oracle收购了）	收费的	支持JAVAEE所有的规范（EJB servlet/jsp规范）
		* （JAVA 	MySql(Oracle)	WebLogic）
		
	* WebSphere	IBM公司开发的	收费的	支持JAVAEE所有的规范（EJB servlet/jsp规范）
		* 银行喜欢用
		
	* Tomcat 	apache（开源的组织，非常的伟大）只Servlet/JSP规范。免费的。


---
* Tomcat的安装和注意实现
	* （前提条件）安装JDK，配置java的环境变量。
	* 安装版（给客户用）
	* 解压版：解压当前文件夹，目录不要有中文。
	* 启动服务器：tomcat/bin/startup.bat（启动服务器）	
	* 访问：http://192.168.24.215:8080访问服务器的主页。我的ip：  192.168.11.100
	* 关闭服务器：点关闭按钮，shutdown.bat

![](http://5)


## 06-tomcat服务器常见的启动问题

* 配置环境变量。C:\Program Files (x86)\Java\jdk1.6.0_16
	* 一闪而过，环境变量没配置好。
	
* 端口占用问题
	* java.net.BindException: Address already in use: JVM_Bind  【异常日志在logcatalina】
	* 端口被占用。
	
	* 解决问题：
		* 结束掉占用端口的应用程序。
			* 找到占用端口的应用程序。
			* 通过命令	netstat –ano，在任务管理器中结束程序。
			
		* 修改端口号。
			* 修改配置文件了。
			* tomcat/conf/server.xml配置文件
			
					<Connector port="80" protocol="HTTP/1.1" 
					   connectionTimeout="20000" 
					   redirectPort="8443" />
			
		* 有应用程序占用80端口，用上边的方式解决。
		* 有的WIN7系统自带World wide web publish IIS服务，默认占用80端口。
			* 如果有。去服务中，该手动启动。
			
		* 概率非常小。操作系统占用80端口。


## 07-tomcat的包结构和动态的web资源目录结构

![](http://6)


* Tomcat目录结构
	* bin（**）			启动项，关闭项。	
	* conf（*****）		里面Tomcat配置文件
	* lib（**）			服务器运行使用的jar包
	* logs（***）		日志文件，运行时产生的日志。
	* temp（**）		运行时临时文件
	* webapps（*****）	web applications（web的应用们）
	* work（*****）		JSP翻译成Servlet程序


---

* 如果动态的WEB资源，把WEB资源发布到服务器的webapps目录下的时候，有固定的目录结构。
	* 静态的web资源
		* HTML、CSS、JAVASCRIPT
	* 动态的web资源	
		* 数据发生变化。例子：
		* Servlet/JSP	
		
* 开发动态的WEB资源程序，目录结构如下（必须记住）
	* Servlet/JSP只要包含，就称为动态的WEB资源


			website --- 项目名称
				|	---		存放	HTML CSS JAVASCRIPT JSP 图片
				WEB-INF
					|
					web.xml		程序的入口。配置文件（必须有的）
					classes		文件夹，名称固定的  可选的
					lib			文件夹，名称固定	可选的


## 08-Tomcat与MyEclipse集成和部署项目


* Tomcat和MyEclipse的集成
	* window -- 选项 -- MyEclipse -- servers -- 选择tomcat -- 选择Enable -- 选择tomcat根目录
	* 配置JDK -- 选择JDK。
	* 启动服务器。
	

## 09-虚拟路径的问题






## 10-虚拟路径修改和tomcat管理员的配置
## 11-部署项目的三种方式
## 12-web通信原理
## 13-HTTP协议的简介
## 14-HTTP协议之请求
## 15-请求头
## 16-响应内容
## 17-简单复习

--------------

Day02 End.


[print]


	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)