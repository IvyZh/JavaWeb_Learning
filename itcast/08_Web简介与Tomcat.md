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

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170123171058.png)

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170123171126.png)

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170123171417.png)


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

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170123172038.png)


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

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170123174454.png)


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

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170123175940.png)


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


* 虚拟路径（访问路径）
	* 默认和项目名称是相同（不要去修改）。
	* WebRoot变成了虚拟路径（访问的路径）


---

下午。

## 10-虚拟路径修改和tomcat管理员的配置

* 直接复制项目，需要修改虚拟路径。
	* 项目上右键 -- 选择属性 -- MyEclipse -- web -- 修改虚拟路径。

* 扩展
	* window -- show view -- servers 



* Tomcat管理员的配置（了解）
	* 在tomcat/conf/tomcat-user.xml
				
			<role rolename="manager"/>
			<user username="admin" password="admin" roles="manager"/>



## 11-部署项目的三种方式


* 如何部署WEB程序（三种）
	* 1项目复制到webapps目录下。
		
	* 通过配置虚拟路径的方式。
		* 2直接修改配置文件
			* 写到tomcat/conf/server.xml
			* 找到<Host>标签，配置到Host标签的中间
			* 目的：通过配置，配置访问路径，准确找到c:\bb的文件
				* `<Context docBase="文件夹的真实目录" path="虚拟路径（访问路径）" ><Context>`
				* `<Context docBase="C:\bb" path="/itcast" ></Context>`
				* 访问：http://localhost:80/itcast
				
		* 3自己编写一个配置文件（格式）（推荐使用）
			* 自定义xxx.xml结尾文件，在$CATALINA_HOME/conf/[enginename]/[hostname]/ directory.目录下。
			* 把xxx当成虚拟（访问）路径。
			
			* 在xml的文件中编写。
				* 在哪个目录下：
					* $CATALINA_HOME/conf/[enginename]/[hostname]/ directory.
					* 如果找引擎的名称和主机的名称，在server.xml中找。
					* tomcat/conf/Catalina/localhost/ccc.xml
					
				* ccc.xml的文件编写什么内容？
					* <Context docBase="C:\cc"></Context>
				* 访问：http://localhost:80/ccc/abc.html
							
## 12-web通信原理

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170124105626.png)

## 13-HTTP协议的简介

* 配置虚拟主机（了解）



* HTTP的协议
	* 啥是HTTP的协议：超文本传输协议。
	* 基于TCP链接的传输协议。
	* HTTP协议默认是80
	* 基于请求和响应的模式。（先有请求，后有响应）
		* www.baidu.com（访问百度的服务器）
		* 百度的首页返回给我
	* 客户端连上web服务器后，若想获得web服务器中的某个web资源，
		需遵守一定的通讯格式，HTTP协议用于定义客户端与web服务器通迅的格式
		
		
	* 使用telnet命令，快速了解http协议。
	* 如果是win的系统，开启telnet的命令。	
		
		
		启动服务器.
		cmd>telnet localhost 80  回车
		telnet命令有一个乱码问题  解决乱码.
		解决  ctrl+]  回车
		注意：命令行中输入的内容不能写错，一旦写错了，不支持删除。
		请求：
		
		GET /aa/1.html HTTP/1.1
		host:localhost
		输入两次回车
		
	* 使用telnet命令发送了一次请求
		* 请求：
			GET /aa/1.html HTTP/1.1
			host:localhost
			
		* 响应：		
			
				HTTP/1.1 200 OK
				Server: Apache-Coyote/1.1
				ETag: W/"21-1416624196782"
				Last-Modified: Sat, 22 Nov 2014 02:43:16 GMT+
				Content-Type: text/html
				Content-Length: 21
				Date: Sat, 22 Nov 2014 07:33:53 GMT
				
				<h1>hello java!!</h1>
			
	
	* HTTP协议的版本
		* HTTP/1.0
			* 链接后，只能获取一个web资源。
			* 链接后，发送请求，服务器做出响应，链接立即断开。
				GET /aa/1.html HTTP/1.0
				host:localhost	
			
		* HTTP/1.1（使用）
			* 链接后，可以获取多个web资源。
			* 链接后，发送请求，服务器做出响应，链接不会立即断开。
				再次发送请求，直接有一段时间没操作，自动断开。
				GET /aa/1.html HTTP/1.1
				host:localhost

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170124151213.png)


> HTTP是hypertext transfer protocol（超文本传输协议）的简写，它是TCP/IP协议的一个应用层协议，用于定义WEB浏览器与WEB服务器之间交换数据的过程。 

> HTTP协议是学习JavaWEB开发的基石，不深入了解HTTP协议，就不能说掌握了WEB开发，更无法管理和维护一些复杂的WEB站点。

> HTTP协议的版本：HTTP/1.0、HTTP/1.1


## 14-HTTP协议之请求
![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170124152907.png)

## 15-请求头

* 请求行
	* 请求方式
		* POST、GET、HEAD、OPTIONS、DELETE、TRACE、PUT、CONNECT
		* 常用post和get
		* 区别：
			* get把参数显示在地址栏上，安全级别低，不支持大数据。
			* post把参数封装请求体中，安全级别高，支持大数据。
			
	* 请求地址
		* 请求资源
	* 协议版本
		* HTTP/1.1
* 请求头

		Accept: text/html,image/*    
		Accept-Charset: ISO-8859-1
		Accept-Encoding: gzip
		Accept-Language:zh-cn 
		Host: www.itcast.com:80
		If-Modified-Since: Tue, 11 Jul 2000 18:23:51 GMT
		Referer: http://www.itcast.com/index.jsp
		User-Agent: Mozilla/4.0 (compatible; MSIE 5.5; Windows NT 5.0)
		Connection: close/Keep-Alive   
		Date: Tue, 11 Jul 2000 18:23:51 GMT	
	
	* 重要的头
		* If-Modified-Since		必须和响应头信息一起来完成控制本地的缓存。
		* Referer				当前的网页的来源。（防止盗链）
		* User-Agent			判断浏览器的版本（文件下载的时候）
		
* 空行
* 请求体
	* 封装post参数列表。

防盗链。

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170124154141.png)



## 16-响应内容


![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170124154444.png)

* 响应
	* 响应行
		* 协议版本
			* HTTP/1.1
		* 状态码
		
				200 ：请求成功处理，一切OK
				302 ：请求重定向
				304 ：服务器端资源没有改动，通知客户端查找本地缓存
				404 ：客户端访问资源不存在
				500 ：服务器内部出错
			
		* 状态码描述
			
	* 响应头
	
			Location: http://www.it315.org/index.jsp 
			Server:apache tomcat
			Content-Encoding: gzip 
			Content-Length: 80 
			Content-Language: zh-cn 
			Content-Type: text/html; charset=GB2312 
			Last-Modified: Tue, 11 Jul 2000 18:23:51 GMT
			Refresh: 1;url=http://www.it315.org
			Content-Disposition: attachment; filename=aaa.zip
			Expires: -1
			Cache-Control: no-cache  
			Pragma: no-cache   
			Connection: close/Keep-Alive   
			Date: Tue, 11 Jul 2000 18:23:51 GMT
		
		* 重要的头
			* Location					和302一起完成重定向。
			* Last-Modified				和请求头If-Modified-Since一起控制缓存。和状态码304
			* Refresh					完成页面的定时跳转
			* Content-Disposition 		设置文件是以附件打开
			
					Expires: -1
					Cache-Control: no-cache  
					Pragma: no-cache
					* 禁用缓存（网银系统）
			
	* 空行
	* 响应体
		* 存放真正的数据。



 
转发：找班长借钱，他自己找副班长借钱，

重定向：（找班长借钱，发送一次请求，回了我没钱，返回状态码302，给副班长地址，再去找富班长借钱，又发送了一次）
## 17-简单复习






--------------

Day02 End.


[print]


	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)