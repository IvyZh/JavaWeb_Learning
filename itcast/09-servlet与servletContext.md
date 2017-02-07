> 传智播客-铁男

> 录制时间：2014.11.11

## 01-课程回顾

	* 服务器
		* 网络的架构
			* C/S	客户端/服务器
				* 服务器压力小，如果客户端需要更新下载
			* B/S	浏览器/服务器
				* 服务器压力大，不用更新
				
		* 服务器概念
			* 硬件：一台电脑。
			* 软件：服务器的软件（Tomcat）
			* 访问：http://ip+端口号	找到主机
			
		* Tomcat服务器，免费的，apache组织，支持Servelt/JSP的规范。
		* 安装JDK，配置好环境变量。
		* 常见的启动的问题：
			* 环境变量没配置好。
			* 端口占用的问题。
				* 找到占用的程序，结束掉。
				* 修改端口号。（改成80）
				
		* Tomcat的文件夹
			* bin		启动服务器和关闭服务器
			* conf（*****）	配置文件
			* lib		Tomcat运行时jar包
			* temp		临时文件
			* logs		日志
			* webapps（*****）	web的应用们
			* work（*****）		JSP翻译Servlet
		
		* 动态的WEB资源
			* Servlet/JSP
			* 在服务器中有固定的目录结构
			* 在webapps目录下创建一个文件夹
			website
				|
			WEB-INF
				|
				web.xml		必须有的（配置文件）
				classes		文件夹（编译.class文件）
				lib			文件夹（第三方jar包）
				
		* Tomcat和MyEclipse集成到一起
			
		* 部署项目（三种）
			* 直接复制到webapps目录下
			* 配置虚拟路径（访问路径）
				* 在tomcat/conf/server.xml中<Host>标签下
					<Context docBase="项目真实的路径" path="/访问路径" ></Context>
					
				* 自己在tomcat/conf/引擎名称/主机的名称/xxx.xml文件	
					<Context docBase="项目真实的路径" ></Context>
					* 因为xxx作为访问路径
					
	* HTTP的协议
		* 超文本传输协议：post请求，参数封装请求体中。做出响应，展示页面上内容，封装的响应体中。
			* 基于请求和响应模式，先有请求再有响应。
			* 默认端口号80
			* 基于TCP协议
			
		* HTTP/1.1和HTTP/1.0区别：
			* 1.1一次链接获取多个资源。
			* 1.0一次链接只能获取一个资源。
		
		* 请求
			* 请求行
				* 请求方式
					* get和post区别
				* 请求路径
				* 协议版本
					* HTTP/1.1版本
			* 请求头
				* if-modefied-since		和last-modefied 完成控制缓存。
				* referer				记住当前网页的来源
				* user-agent			查看浏览器的版本
			* 空行
			* 请求体
				* 封装post请求参数列表
		
		
		* 响应
			* 响应行
				* 协议版本
				* 状态码
					* 200		一起ok
					* 302		完成重定向操作
					* 304		if-modefied-since和last-modefied一起控制缓存
					* 404		找不到资源
					* 500		程序内部错误
				* 状态码描述
			* 响应头
				* Location		和302完成重定向
				* last-modefied	
				* refresh		页面定时刷新
				* Content-Dispostion	文件下载
					
					禁用浏览器的缓存。
				
			* 空行
			* 响应体
				* 展示用户的数据



## 02-Servlet的快速入门

* Servlet（好好学）
	* 动态WEB的资源。
	* 什么是Servlet
		* 实现Servlet接口，重写5个方法。
		* Servlet是一个小的java程序，运行在服务器中，接收和响应从客户端（浏览器）发送过来的请求。
		
	* 快速入门
		* 编写一个类，实现Servlet接口，重写5个方法。
			* 编写一个类，继承GenericServlet类，重写一个方法。
		* 配置文件，配置Servlet信息。（必须会）
			
				<!-- 先配置Servlet信息 -->
				<servlet>
					<!-- 配置Servlet名称，名称必须唯一 -->
					<servlet-name>ServletDemo1</servlet-name>
					<!-- 配置Servlet的完全路径（包名+类名） -->
					<servlet-class>cn.itcast.servlet.ServletDemo1</servlet-class>
				</servlet>
				
				<!-- 配置Servlet映射（访问路径） -->
				<servlet-mapping>
					<!-- 配置Servlet名称，和上面的名称必须相同 -->
					<servlet-name>ServletDemo1</servlet-name>
					<!-- 配置虚拟路径（访问路径） -->
					<url-pattern>/demo1</url-pattern>
				</servlet-mapping>
			
	* 编译
		* javac -d . HelloServlet.java
		* HelloServlet.java:4: 软件包 javax.servlet 不存在
		* set classpath=%classpath%;servlet-api.jar	设置临时的环境变量，只对当前的窗口有效。

![](http://1)

![](http://2)

## 03-使用MyEclipse开发Servlet和执行过程


![](http://3)

![](http://4)

## 04-Servlet的生命周期

* Servlet的生命周期（面试题）
	* 生命周期：实例被创建，对外提供服务，销毁。
		* Servlet被创建后，然后调用init方法进行初始化，第一次访问的时候被调用，只会被调用一次
			void init(ServletConfig config) 
		* 从客户端发送所有的请求是service方法进行处理的。可以调用多次
			void service(ServletRequest req, ServletResponse res)  
		* 从服务器中移除服务，调用destroy方法。手动停止服务的时候调用
			void destroy()  
	
	* Servlet的生命周期：第一次请求的时候，Servlet实例被创建，立即调用init方法进行初始化。实例通过service方法提供服务。服务器关闭或者移除服务时，调用destroy方法进行销毁。



## 05-开发细节

问题：service方法和 doGet doPost 什么关系 ？？？
在HttpServlet中 service方法内部，根据请求方式 调用doGet 或者 doPost 
* 导入 Servlet源码 



* Servlet的关系

		Servlet接口
			|
		GenericServlet（重写5个方法）
			|
		HttpServlet（继承GenericServlet实现了Servlet接口）	
			|
		MyServlet	
		
		
		* 为什么会有GenericServlet？为什么有HttpServlet？
		* 注意事项：
			* 如果想重写init方法，重写无参数的init方法。


* 开发步骤（最终）
	* 编写一个类，继承HttpServlet
	* 重写doGet和doPost方法
		* 在doPost方法中调用doGet方法。
		* 表单是get方式，调用doGet
		* 表单是post方法，调用doPost方法
		* doGet和doPost互相调用。
			
				<form action="http://localhost:80/day09/demo5" method="post">
					姓名：<input type="text" name="username" />
					<input type="submit" value="查询" />
				</form>
			
	* 在web.xml配置


## 06-Servlet模板的修改


![](http://5)
![](http://6)

![](http://7)




* 修改Servlet模板
	* 先找到MyEclipse的安装路径。
	* \myeclipse10.7\Common\plugins\com.genuitec.eclipse.wizards.xxxx.jar
	 	* 我自己的：com.genuitec.eclipse.wizards_9.0.0.me201211011550.jar
		
	* 千万别解压，右键--选择压缩工具打开--templates--Servlet.java
	* 拖回去之前，先MyEclipse关闭。

![](http://8)

## 07-Servlet自动加载


* Servlet自动加载
	* Servlet默认是第一次访问时候创建实例。通过配置，服务器启动，创建实例。
	* init做初始化的操作，非常消耗时间的。
		
	* 在<servlet>标签下
		`<load-on-startup>3</load-on-startup>`
	* 值是正整数
		* 如果值越小，优先级越高。



===
下午。

## 08-配置servlet的映射和优先级

	* 配置虚拟路径（访问路径）
		<servlet-mapping>
			<url-pattern>/demo5</url-pattern>
		</servlet-mapping>	
		
		* 完全路径匹配
			* 以/开头的			/demo5		/servlet/demo5
			* 访问：http://localhost/day09/demo5
		* 目录匹配
			* 以/开头的			/*
			* 访问：http://localhost/day09/demo5可以访问
		* 扩展名匹配
			* 不能以/开头的		*.do	*.action	
			* 访问：http://localhost/day09/demo5.do
			
		* 优先级：完全路径匹配	> 目录匹配 > 扩展名匹配（*****）



![](http://9)

## 09-WEB开发中路径的问题


![](http://10)

![](http://11)


	* WEB开发中路径的问题	
		* 相对路径
			* 一个文件相对于另一个文件的位置的关系。
			* 不能以/开头	写法：	./demo	demo	../demo
			
			* 访问1.html：	http://localhost/day09/1.html
			* 访问demo5：	http://localhost/day09/demo5
			* 从1.html中去访问demo5：./demo5	demo5
			
			* 访问2.html：	http://localhost/day09/html/2.html
			* 访问demo5：	http://localhost/day09/demo5
			* 从2.html访问demo5：../demo5


![](http://12)


	* 绝对路径（推荐使用）
		* 以/开头的
		* 访问demo5：	http://localhost/day09/demo5
		* 从1.html使用绝对路径访问demo5：http://localhost/day09/demo5
		* 简写方式：/day09/demo5
		
		* 客户端绝对路径
			* /day09/demo5	需要写项目名
			
		* 服务器绝对路径	
			* /demo5	不能写项目名

## 10-ServletConfig对象


* ServletConfig对象和配置文件相关
	* 配置初始化参数
		* 需要在`<servlet></servlet>`标签下配置。
		* 如果要是配置在某个servlet的标签下，那么只能在该servlet中获取初始化参数。
		
				<init-param>
					<param-name>username</param-name>
					<param-value>root</param-value>
				</init-param>
		
	* String getServletName()  					获取配置文件中servlet的名称
	* String getInitParameter(String name)  	获取初始化参数
	* Enumeration getInitParameterNames()  	    获取初始化参数的名称们


![](http://13)

![](http://14)

## 11-ServletContext对象获取初始化参数

![](http://15)

	* ServletContext对象（域对象）	（*****）
		* 定义：WEB容器在启动时，它会为每个WEB应用程序都创建一个对应的ServletContext对象，它代表当前web应用。
		一个WEB应用对应一个ServletContext对象
		一个WEB应用下有多个Servlet程序
		所有的servlet程序都共享同一个ServletContext对象
		
		demo1存入内容	ServletContext	demo2中取出来
		
		* 作用：
			* 获取WEB应用全局初始化参数
				* 在web.xml中配置
					<context-param>
						<param-name>encoding</param-name>
						<param-value>GBK</param-value>
					</context-param>
				
				String getInitParameter(String name)	  
				getInitParameterNames() 					
				
			* 实现数据的共享（*****）
				void setAttribute(String name, Object object)   存入数据
				void removeAttribute(String name)  				删除数据
				Object getAttribute(String name)  				获取数据
				
			* 读取资源文件（*****）
				InputStream getResourceAsStream(String path)  	通过文件的地址获取输入流
				String getRealPath(String path)  		通过文件的地址获取文件的绝对磁盘路径

![](http://16)

![](http://17)
## 12-ServletContext对象共享数据


![](http://18)

![](http://19)


## 13-ServletContext读取资源文件

![](http://20)



注意读取文件的位置：是在tomcat服务器bin目录下。

![](http://21)

![](http://22)

![](http://23)


## 14-响应头


* HTTP的协议
	* 请求
		* referer		记住当前网页的来源
		* user-agent	浏览器版本信息
		* if-modefied-since
		
	* 响应
		* 响应头
		* location		和302一起来完成重定向的操作
		* refresh		页面的定时刷新
		* last-modefied	和 if-modefied-since和304状态码一起来控制缓存。

重定向：

![](http://24)

![](http://25)

定时跳转：

![](http://26)



## 15-控制缓存

![](http://27)

## 16-简单复习

--------------

Day09 End.


[print]


	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)