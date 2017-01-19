> 传智播客-铁男

> 录制时间：2014.11.11



## 01-课程回顾


* DOM解析HTML简介
	* DOM	文档对象模型
	* 解析器
	
* document对象
	* getElementById("id的值");	返回一个元素（标签）对象
	* getElementsByName("name的名称");	返回数组
	* getElementsByTagName("标签名称");	返回数组
	
	* 创建元素对象
		document.createElement("元素名称");
		document.createTextNode("文本内容");
		appendChild(node);	父节点调用该方法
		insertBefore(new,old)	在指定的节点之前添加子节点
		
* Element对象
	* 操作属性	setAttribute("","")	设置或者修改属性
				getAttribute("属性名称");
				removeAttribute("属性名称");
				
	* 获取子节点
		getElementsByTagName("子节点的元素名称");
		
* Node节点对象		
	* nodeName	nodeType nodeValue
	* parentNode	父节点（*****）
	
	* appendChild(node);	父节点调用该方法
	* insertBefore(new,old)	在指定的节点之前添加子节点
	* replaceChild(new,old)	替换节点
	* removeChild(node)		删除节点
	* cloneNode(true或者false)	复制节点
	
* innerHTML	获取和设置文本内容
	<span></span>
	
* 事件
	* onclick 		点击事件
	* ondblclick	双击事件
	* onload		加载事件
	* onfoucs		获取焦点
	* onblur		失去焦点
	* onchange		改变事件

	
	* onsubmit		控制表单的提交

## 02-onsubmit事件


* onsubmit事件
	* 控制表单提交。	需要把onsubmit作用在表单上		`<form  onsubmit="">`
	* 值的写法：onsubmit="return run()"
	* run()必须要有返回值，必须返回true或者false。
	* 如果返回是true，表单可以提交，如果返回false，表单不能提交。如果没有返回值，默认是表单提交。
	* run()的逻辑写什么？
		* 表单的校验。


![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170118153154.png)


正则表达式 /^表达式$/.test(string);返回true或者false

> 前台校验 后台校验


## 03-js提交表单

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170118153909.png)

## 04-XML的简介

* XML的简介
	* XML	可扩展的标记语言。（和HTML非常类似的）
		* 可扩展的。
		* 自定义的标签。	
		
	* XML传输数据，HTML是显示数据。
	
* XML的版本：	XML1.0（使用该版本）		XML1.1（不向下兼容）
* 做什么用？
	* 描述有关系的数据


XML技术用于解决什么问题?

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170118162026.png)
	
* 应用
	* 作为配置文件。
		* XML技术除用于保存有关系的数据之外，它还经常用作软件配置文件，以描述程序模块之间的关系。(如后面将要学习到的Struts、Spring和Hibernate都是基于XML作为配置文件的)

	* 可以在系统与系统之间进行数据的传输。
		* webserivice	soap	XML封装数据
		* json	和XML概念	
					

> XML是指可扩展标记语言(eXtensible Markup Language)，它是一种标记语言，很类似HTML。它被设计的宗旨是传输数据，而非显示数据。

> XML标签没有被预定义，需要用户自行定义标签。

> XML技术是W3C组织(World Wide Web Consortium万维网联盟)发布的，目前遵循的是W3C组织于2000年发布的XML1.0规范。

> XML被广泛认为是继Java之后在Internet上最激动人心的新技术。



## 05-XML的文档声明

* XML的语法
	* 文档声明（*****）
	* 元素（***）
	* 属性（***）
	* 注释（*）
	* 特殊字符
	* CDATA区
	* PI（处理指令）（忘了）




* 文档声明（*****）
	* 写法：	<?xml version="1.0"  ?>
	* 文档声明必须出现在xml文件的第一行和第一列的位置。
	* 属性：
		* version="1.0"				XML的版本	（必须写）
		* encoding="UTF-8"			编码集		（可选的）
		* standalone="yes或者no"	代表xml的文件是否是独立的。（如果是no，不独立，可以引入外部的文件）（可选的）
			* 因为不写该属性，可以引入外部的文件。
	* 乱码会伴随你们一生？
		* 产生的原因：保存文件时和打开文件时采用的编码不一致。
		* 解决办法：保存文件可打开文件采用的编码一致就ok。（MyEclipse不会产生乱码问题）

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170118172716.png)


## 06-XML的元素、属性和特殊字符



* 元素（***）
	* 开始标签和结束标签。
		* 包含标签主体：	`<abc>文本</abc>`
		* 不包含标签主体：	`<abc/>`
		
	* 不能交叉嵌套	
	* 只能有一个根元素（必须有，并且只能有一个）
	
	* 命名规范：
		* 区分大小写					错误的：`<a></A>`	代表两个标签
		* 不能以数字和-中划线开头		错误的：`<1a>		<-a>`
		* 不能以XML（Xml	XML  xml）开头	错误的：`<xmlaa>`
		* 不能包含空格和冒号。
			

* 属性（***）
	* 自定义：命名规范同上。
	* 在同一个元素上，不能有相同的属性。（*****）
	* 可以使用双引号或者单引号。
	
	
* 注释（*）
	* 和HTML的注释相同
	`<!-- XML的注释 -->`
	
	* 注释不能嵌套。
	
* 特殊字符
	* <		`&lt;`
	* >		`&gt;`
	* &		`&amp;`
	* "		`&quot;`
	* '		`&apos;`


## 07-XML的语法二

* CDATA区
	* 把标签中的内容作为字符串。
	* 语法：
		<![CDATA[
			内容：当成字符串
		]]>

* PI（处理指令）（忘了）
	* 替换HTML(country.xml)

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170118200653.png)


语法总结：

	所有 XML 元素都须有关闭标签
	XML 标签对大小写敏感
	XML 必须正确地嵌套顺序
	XML 文档必须有根元素(只有一个)
	XML 的属性值须加引号
	特殊字符必须转义 --- CDATA
	XML 中的空格、回车换行会解析时被保留

## 08-约束的简介

DTD要求会写。

* XML的约束
	* DTD
	* schema
* 格式良好的XML：遵循语法规范。	
* 有效的XML：有约束。

code:
	
	<myspring>
		<bean>hello.java</bean>
		<猫/>
	</myspring>

## 09-DTD的快速入门

book.xml

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170118201525.png)

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170118201721.png)

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170118201825.png)



	书写完成DTD，并且约束成功后，可以总结书写的过程，更方便记忆。
	复杂标签：<!ELEMENT 标签名 (子节点)>
	简单标签：<!ELEMENT 标签名 (#PCDATA)>
	引入DTD：<!DOCTYPE 根节点 SYSTEM “dtd的地址”>

	* 快速入门的步骤：
		* 需要出现哪些标签？
		* 在DTD的文件中编写元素
			<!ELEMENT 元素名称 元素类型>
		* 判断元素是否是复杂还是简单元素？
			* 如果是简单元素：(#PCDATA)	代表是字符串
			* 如果是复杂元素：(子节点)
			
		* 需要在book.xml引入DTD的文件
			* <!DOCTYPE 根节点 SYSTEM "DTD文件的地址">
	
	* DTD与XML文档的关联方式
		* 可以在XML的文件中直接书写DTD的代码。（经常使用）
			<!DOCTYPE 根节点 [
				DTD的代码
			]>
		
		* 引入本地的DTD文件（经常使用）
			<!DOCTYPE 根节点 SYSTEM "DTD文件的地址">
		
		* 引入网络上的DTD文件
			<!DOCTYPE 根节点 PUBLIC "DTD文件名称" "DTD文件的地址">

## 10-DTD与XML的三种结合方式


* DTD与XML文档的关联方式
	* 可以在XML的文件中直接书写DTD的代码。（经常使用）
		<!DOCTYPE 根节点 [
			DTD的代码
		]>
	
	* 引入本地的DTD文件（经常使用）
		<!DOCTYPE 根节点 SYSTEM "DTD文件的地址">
	
	* 引入网络上的DTD文件
		<!DOCTYPE 根节点 PUBLIC "DTD文件名称" "DTD文件的地址">

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170119104208.png)


## 11-定义元素

	DTD:
	元素定义
	属性定义
	实体定义

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170119104911.png)

## 12-定义属性


![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170119113643.png)

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170119113758.png)



## 13-属性语法和定义实体

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170119162154.png)

* 实体定义（用的不多）	
	* <!ENTITY 别名 "值" >
	* 需要在xml中引入别名，浏览器打开文件后，在引入的位置上显示值的。

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170119162405.png)


## 14-DTD的文档

w3c文档上也有。

> 看约束文档写xml文件

## 15-解析XML编程的简介

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170119165430.png)

* 解析XML的方式有哪些呢？
	* 常用的有两种？DOM和SAX 
	* 区别：
		- DOM解析XML
		  * 在内存中形成树状结构
		  * 缺点：如果文档过大，容易产生内存溢出的问题。  
		  * 优点：方便做增删改的操作	
			
		- SAX解析
		  * 基于事件驱动，边读边解析
		  * 优点：不会产生内存溢出问题。
		  * 缺点：不能做增删改操作。（DOM4J在内存生成树状结构）

- JAXP SUN提供的
- DOM4J 企业都在用 DOM4J提供的
- JDOM（不讲了）



## 16-JAXP的DOM方式入门

- JAXP解析XML
	- DOM
	- SAX

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170119171220.png)

DOM：

	* DocumentBuilderFactory	：解析器工厂类
	* DocumentBuilder	获取解析器对象
	* 解析XML（Document parse(String uri) ）
		// 获取解析器工厂类
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		// 获取解析器对象
		DocumentBuilder builder = factory.newDocumentBuilder();
		// 解析XML的文档，返回document对象
		Document document = builder.parse("src/book2.xml");


练习，解析book.xml

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170119172408.png)

## 17-JAXP的添加子节点

需求：在第二本下末尾添加子节点

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170119172834.png)

## 18-JAXP的封装和删除节点


![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170119173516.png)


## 19-简单复习

--------------

Day05 End.



	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)