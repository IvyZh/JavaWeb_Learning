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


需要把errorpage给去掉。

## 05-page指令二

![](http://11)

![](http://12)

## 06-include页面包含


	* include	：包含页面（页面布局）
		* 语法：<%@ include file="要包含文件的地址（静态包含）" %>
		* <%@ include file="/include/head.jsp" %>






![](http://13)

![](http://14)

![](http://15)

![](http://17)





## 07-taglib指令

	* taglib	：引入标签库文件（明天）
			* 语法：<%taglib  %>
			* 属性:
				* uri		：引入标签库文件的名称
				* prefix	：标签库的前缀名



![](http://18)

## 08-JSP的内置对象一out


![](http://19)


	* JSP的内置对象（9个）直接使用
		request response session application out pageContext page config exception
		
		内置对象					真实的对象					方法
		request						HttpServletRequest			setAttribute()	getAttribute()
		response					HttpServletResponse			addCookie()		getWriter()
		session						HttpSession					setAttribute()	getAttribute()
		application					ServletContext				setAttribute()	getAttribute()
		config						ServletConfig				getInitParameter()	getInitParameterNames()
		
		exception					Throwable					getMessage()
		page						Object						（不使用对象）
		out						JspWriter					write()		print()
		pageContext					PageContext					setAttribute()	getAttribute()



		* exception
			* 和异常有关的
			* 前提条件：isErrorPage="true"，才能使用exception对象。
		* page	
			* 当前页面的对象。
		* out对象
			JspWriter			  PrintWriter  response.getWriter()
			
			<%= "HELLO" %>
			<% out.print("AAAA"); %>
			<% response.getWriter().print("BBBB"); %>
			<% out.print("CCCC"); %>
			* 输出结果：
			
		


![](http://20)

![](http://21)

## 09-pageContext对象一


* pageContext对象
	* 域对象
		* 自己存取值
		* 向其他的域存取值。
			* setAttribute(String name, Object value, int scope) 
			* getAttribute(String name, int scope) 
			* findAttribute(String name) 
			
	* 可以获取其他8个对象。
		* 编写框架或者通用性较高代码。

===

pm

## 10-pageContext对象二


![](http://22)

## 11-JSP的动态标签一

![](http://23)

![](http://24)


![](http://25)

![](http://26)

![](http://27)

## 12-JavaBean概念和使用传统方式封装数据



* 什么是JavaBean？
	* 定义
		* 必须有一个无参的构造方法
		* 属性私有化
		* 私有化的属性必须通过public类型的方法暴露给其它程序，并且方法的命名也必须遵守一定的命名规范。
			
				public class User(){
					private String username;
					private String password;
					public void setUsername(){
						
					}
					public void getUsername(){
						
					}
					public void getPassword(){
						
					}
					public void getInfo(){
						
					}
				}
		
	* 作用：封装数据。

![](http://28)


## 13-使用JSP的动作标签封装数据


![](http://29)

![](http://30)


## 14-内省简介和测试类代码
提交到servlet程序


![](http://31)

![](http://32)

![](http://33)


## 15-通过内省的方式完成数据的封装

![](http://34)


## 16-BeanUtils工具类的使用

资料-beanutils,logging



* 导入jar包
	* commons-beanutils-1.8.3.jar
	* commons-logging-1.1.1.jar

![](http://35)

![](http://36)

* 默认把字符串转换成日期类型
	* 编写一个类，实现Converter接口。重写该方法。把字符串转换日期。
	* 在封装数据之前进行注册。ConvertUtils.register(Converter converter, Class clazz) 	Date.class


![](http://37)

![](http://38)


这样就ok了。


## 17-EL表达式获取域中的值

![](http://39)


	* EL表达式
		* 语法：${ }
		* 获取（域对象中的）数据
			<h4>获取域对象中的值</h4>
			<%
				pageContext.setAttribute("name", "黄海波");
				request.setAttribute("name", "美美");
			%>
			
			${ pageScope.name }
			${ requestScope.name }


			<h4>域中数组的值</h4>
			<%
				String [] arrs = {"美美","波波","东东","名名"};
				request.setAttribute("arrs", arrs);
			%>
			${ arrs[2] }

			<h4>域中集合的值</h4>
			<%
				List<String> list = new ArrayList<String>();
				list.add("美美");
				list.add("小凤");
				list.add("芙蓉");
				request.setAttribute("list", list);
			%>
			${ list[1] }

			<h4>域中Map集合的值</h4>
			<%
				Map<String,String> map = new HashMap<String,String>();
				map.put("aa", "美美");
				map.put("bb", "小凤");
				request.setAttribute("map", map);
			%>
			${ map.bb }


			<h4>域中集合中有对象的值</h4>
			<%
				List<User2> uList = new ArrayList<User2>();
				uList.add(new User2("banzhang","123"));
				uList.add(new User2("美美","abc"));
				request.setAttribute("uList", uList);
			%>
			${ uList[1].username }
## 18-EL表达式运算



	* 执行运算
		<h4>加法运算</h4>
		${ n1 + n2 }

		<h3>关系运算</h3>
		<h4>大于</h4>
		${ n1 > n2 }	${ n1 gt n2 }

		<h4>小于</h4>
		${ n1 < n2 }	${ n1 lt n2 }

		<h4>等于</h4>
		${ n1 == n2 }	${ n1 eq n2 }

		<h4>不等于</h4>
		${ n1 != n2 }	${ n1 ne n2 }

		<h4>大于等于</h4>
		${ n1 >= n2 }	${ n1 ge n2 }

		<h4>小于等于</h4>
		${ n1 <= n2 }	${ n1 le n2 }

		<h3>逻辑运算</h3>
		<h4>与</h4>
		${ n1 > n2 && n3 > n4 }		${ n1 > n2 and n3 > n4 }

		<h4>或</h4>
		${ n1 > n2 || n3 > n4 }		${ n1 > n2 or n3 > n4 }

		<h4>非</h4>
		${ !(n1 > n2) }		${ not (n1 > n2) }
			


## 19-EL获取WEB常用对象

	* 获取WEB开发中的对象
		pageScope
		requestScope
		sessionScope
		applicationScope
		
		param 			获取请求的参数	getParameter()
		paramValues		获取请求的参数	getParameterValues()
		
		header			获取请求头的信息
		headerValues	获取请求头的信息
		
		initParam		获取全局的初始化参数
		cookie			获取cookie	${cookie.last.value}
			
		pageContext
		
		<h4>EL的WEB对象</h4>
		${ param.username }

		<h4>获取请求头</h4>
		${ header.referer }
		
		<h4>获取全局初始化参数</h4>
		${ initParam.username }
		
		<h4>pageContext对象</h4>
		${ pageContext.request.contextPath }	


## 20-简单复习



--------------

Day02 End.


[print]


	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)