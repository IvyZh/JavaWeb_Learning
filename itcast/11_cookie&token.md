> 传智播客-铁男

> 录制时间：2014.11.11


## 01-课程回顾
## 02-JSP的简介

![](http://1)

* JSP、EL表达式的入门（要用）	
	* Servlet/JSP	是两种动态的WEB资源的两种技术。
	* 使用Servlet生成HTML的页面
	
			response.getWriter("<form action='' method='post'>");
			response.getWriter("<input type='text' name='username'>");
	* JSP简介
		* java server pages		java服务器端的网页们，是在服务器端执行。
		* JSP不仅可以写HTML+java代码+JSP自己的代码
		* JSP的运行原理（*****）：JSP -- 翻译成Servlet -- 编译 -- 访问

![](http://2)


![](http://3)


## 03-JSP的脚本元素

* JSP的脚本元素（JSP的页面可以编写java代码）
		
		<%!  %>		：定义类、定义变量、定义方法（不常用）	成员变量。
		<%=  %>		：输出语句（输出到页面，不能有分号）	
		<%   %>		：定义变量、语句


![](http://4)


## 04-脚本元素和EL表达式

![](http://5)

![](http://6)
* EL快速入门
	* 获取域对象中的内容		request.setAttribute("xx","yy");
	${xx}

![](http://7)

## 05-cookie和session的原理


![](http://8)


![](http://9)

![](http://10)

## 06-记录上次的访问时间分析

![](http://11)

* 显示上次的访问时间（案例）
	* 第一次访问，输出欢迎，在服务器端，记录当前的时间，把当前的时间通过cookie回写到浏览器。
	* 第二次访问，会带着上次的时间，获取时间，可以把时间显示到页面上，记录当前的时间，再把回写浏览器。
	* 输出上次的访问时间。
	
## 07-记录上次的访问时间代码实现

![](http://12)

## 08-cookie常用的api



	* Cookie的API
		* cookie的构造方式	Cookie(String name, String value) 
		* String getName()  获取cookie的名称
		* String getValue() 获取cookie的值
		
		* void setMaxAge(int expiry)  			：设置有效时间
			* 失效cookie	setMaxAge(0);	前提条件：设置有效路径（和之前设置过相同）
			
		* void setPath(String uri)  			：设置有效路径
			* 默认的有效路径（）
				* 配置	/last				默认路径	/day11
				* 配置	/servlet/last		默认路径	/day11/servlet
		
		* void setDomain(String pattern)  		：设置有效域名
			* www.sina.com.cn
			* sports.sina.com.cn
			* xxx.sina.com.cn
			* 设置有效域名	setDomain(".sian.com.cn");
		
		* 会话级别的cookie：默认保存到浏览器的内存中。
		* 持久的cookie：把cookie保存到磁盘上。通过setMaxAge(int a)进行设置。


![](http://13)

===

pm.

## 09-商品浏览记录分析


![](http://14)

![](http://15)

## 10-商品浏览记录代码

![](http://16)

![](http://17)

## 11-清除商品记录

![](http://18)


## 12-session的简介

![](http://19)

* session（服务器） 
	* cookie基于客户端，不安全，并且大小和个数的限制。
	* session域对象，范围一次会话范围，存个人相关的数据。
		* setAttribute(String name, Object value) 
		* Object getAttribute(String name)  
		
		* String getId()  获取seesion的唯一的ID
		* void invalidate()  销毁的seesion



## 13-简单购物车的分析

![](http://20)


## 14-使用session实现简单的购物车

![](http://21)

![](http://22)

## 15-验证码的校验

![](http://23)


--------------

Day11 End.



[print]


	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)