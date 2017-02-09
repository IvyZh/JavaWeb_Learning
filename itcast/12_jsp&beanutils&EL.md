> 传智播客-铁男

> 录制时间：2014.11.11

## 01-课程回顾
## 02-session回顾

![](http://1)

![](http://2)

session2是可以访问到session1设置的数据的。

session的追踪（了解）

![](http://3)

ie的cookie禁止了，jd上：

![](http://4)

![](http://5)


	* session的创建和销毁
		* 第一次访问资源，调用request.getSession()，创建session
		* 销毁
			* 非正常关闭服务器（）
			* session的过期，默认是30分钟。
				<session-config>
					<session-timeout>30</session-timeout>
				</session-config>
			* 调用session.invalidate()	手动销毁session
			
	* session的域对象
		ServlerContext	：代表整个web应用，数据库链接
		session			：一次会话，存放个人的信息。
		request			：一次请求，存放错误处理。


## 03-JSP的简介

	* JSP语法
		* JSP的设置
			* 设置JSP文件的打开方式：window -- 选项 -- General -- Editors -- 文件关联 -- *.jsp -- 选择MyEclipse JSP Editor -- default
			* 设置JSP文件的编码：window -- 搜索JSP -- 找到JSP -- 选择UTF-8 -- OK
			
		
		* 脚本元素
			<%! %>		成员方法、成员变量
			<%= %>		输出内容
			<%  %>		局部变量，语句
			
		* JSP页面的注释		
			* HTML的注释	<!-- -->	JSP文件的阶段存在，在翻译成java文件也存在，	在页面存在
			* JAVA的注释	JSP文件的阶段存在，在翻译成java文件也存在，	在页面不存在
				<%
					// 		单行
					/**/	多行
					/**
					*		文档
					*/
				%>
			* JSP的注释		<%-- JSP的注释 --%>		之后存在JSP文件的阶段



## 04-page指令一

![](http://6)

	* 语法：<%@ 指令元素 属性名=属性值  %>
	* page		：设置JSP的属性
		* 注意：import属性可以出现多次，其他属性只能出现一次。
		* 属性：
			* language	：JSP文件允许嵌入的语言。只支持一种JAVA语言。（不需要改变）
			* extends	：JSP翻译翻译Servlet文件，servlet继承的类。（不需要改变）
			* session	：默认值是true，可以直接使用session。设置false，不能直接使用。
			* import	：引入java的jar包（使用多次）
			* buffer	：设置缓冲区的大小	默认8kb
			* aotoFlush	：设置默认刷新缓冲区（不要修改）	
			* errorPage		：指定错误页面
			* isErrorPage	：设置值，可以是exception对象，设置true，使用exception，设置不能使用exception对象
			* contentType	：服务器端输出所有内容采用编码。
			* pageEncoding	：JSP翻译成Servlet文件时采用的编码。
			* isELIgnored	：是否忽略EL表达式（false，不忽略，true，忽略）
			
		* 重点：
			* session	import	contentType	 pageEncoding	isELIgnored
			
	* include	：包含页面（页面布局）
		* 语法：<%@ include file="要包含文件的地址（静态包含）" %>
		* <%@ include file="/include/head.jsp" %>
		
	* taglib	：引入标签库文件（明天）
		* 语法：<%taglib  %>
		* 属性:
			* uri		：引入标签库文件的名称
			* prefix	：标签库的前缀名



![](http://7)

![](http://8)

![](http://9)

![](http://10)


	* 配置全局的错误页面
		* 在web.xml中进行配置。
		<error-page>
			<error-code>404</error-code>
			<location>/404.jsp</location>
		  </error-page>
		  
		  <error-page>
			<error-code>500</error-code>
			<location>/500.jsp</location>
		  </error-page>



【b】
## 05-page指令二
## 06-include页面包含
## 07-taglib指令
## 08-JSP的内置对象一out
## 09-pageContext对象一
## 10-pageContext对象二
## 11-JSP的动态标签一
## 12-JavaBean概念和使用传统方式封装数据
## 13-使用JSP的动作标签封装数据
## 14-内省简介和测试类代码
## 15-通过内省的方式完成数据的封装
## 16-BeanUtils工具类的使用
## 17-EL表达式获取域中的值
## 18-EL表达式运算
## 19-EL获取WEB常用对象
## 20-简单复习

--------------

Day02 End.


[print]


	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)