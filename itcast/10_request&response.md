> 传智播客-铁男

> 录制时间：2014.11.11

## 01-课程回顾
## 02-缺省的servlet（了解）


![](http://1)

* 自己编写的servlet，不要配置/。
* 在tomcat/conf/web.xml中的配置。

		<servlet>
			<servlet-name>default</servlet-name>
			<servlet-class>org.apache.catalina.servlets.DefaultServlet</servlet-class>
			<init-param>
				<param-name>debug</param-name>
				<param-value>0</param-value>
			</init-param>
			<init-param>
				<param-name>listings</param-name>
				<param-value>true</param-value>
			</init-param>
			<load-on-startup>1</load-on-startup>
		</servlet>


## 03-response对象简介



> Web服务器收到客户端的http请求，会针对每一次请求，分别创建一个用于代表请求的request对象、和代表响应的response对象

> request和response对象即然代表请求和响应，那我们要获取客户机提交过来的数据，只需要找request对象就行了。要向客户机输出数据，只需要找response对象就行了



	* 响应：
		* 响应行
			* 状态码：
				void setStatus(int sc) 设置状态码
				
		* 响应头（key:value的形式，一个key对应一个value，一个key对应多个value）
			* 设置头信息
				void setHeader(String name, String value)  （一个key对应一个value）经常使用的
					setHeader("aa","bb");
					setHeader("aa","cc");
					结果：aa:cc
					
				void setIntHeader(String name, int value)  
				void setDateHeader(String name, long date) 值是毫秒值（int 秒	long 毫秒）
					
				void addHeader(String name, String value)  （一个key对应多个value）
					addHeader("aa","bb");
					addHeader("aa","cc");
					结果：aa:bb,cc
					
				void addIntHeader(String name, int value)  
				void addDateHeader(String name, long date)  					
				
		* 响应体
			ServletOutputStream getOutputStream()  	字节输出流
			PrintWriter getWriter()  				字符输出流


## 04-重定向到登陆页面


	* 登陆页面重定向
	* 状态码302		应头location
	* 需求：登陆页面，用户名和密码的登陆页面，用户名和密码都是admin，
			如果有一个不是，重定向到登陆页面，重新登陆。
			
		// 设置302的状态码
		response.setStatus(302);
		// 设置地址
		response.setHeader("location", "/day10/response/login.html");	
		
		// response对象提供了一个方法，可以完成重定向。
		response.sendRedirect("/day10/response/login.html");


## 05-页面定时跳转（读秒）

* 响应的头	refresh	
				
		<meta http-equiv="refresh" content="5;url=/day10/response/login.html">


![](http://2)

![](http://3)

## 06-禁用浏览器的缓存


	禁用浏览器缓存（三个头信息）
		* 应用：网银。页面的数据是发送变化的。
		Cache-Control : no-cache
		Expires: -1					值是日期类型（setDateHeader()）
		Pragma : no-cache

![](http://4)

## 07-输出中文乱码的问题

字节：
![](http://5)

字符：

![](http://6)

## 08-文件下载


![](http://7)
## 09-验证码的需求分析

![](http://8)


===

下午。

## 10-验证码热身


![](http://9)


## 11-验证码的实现

CheckcodeServlet

![](http://10)

- 旋转
## 12-验证码与登陆页面的结合




## 13-request对象简介和获取客户机信息
## 14-获取请求头
## 15-获取请求参数
## 16-request获取中文乱码的问题
## 17-转发和重定向和request域对象
## 18-使用转发登陆验证
## 19-简单复习

--------------

Day02 End.


[print]


	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)