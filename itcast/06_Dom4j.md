> 传智播客-铁男

> 录制时间：2014.11.11



## 01-课程回顾

* onsubmit事件：控制表单的提交，表单的校验。
* 注意事项：作用在form标签上，onsubmit="return run()"
* run()	必须有返回值，返回true或者false。

* 通过js提交表单				
	* 获取form对象，提交的submit();	.action=""	.method=""




## 02-作业


* XML的编程（解析XML）
	* 解析XML的技术，DOM和SAX
	
	* JAXP是SUN提交，JAVASE的一部分。DOM解析
	* 开发步骤（先获取解析器）：
		* 获取解析器的工厂类
		* 获取解析器类
		* 解析XML，返回document对象。
		
		
	* 回写
		* 先获取回写的工厂类
		* 获取回写类
		* transform(new DOMSource(document),new StreamResult(path));


![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)

## 03-schema的简介和DTD的对比

* XML约束
	* schema


* XML编程
	* JAXP的SAX解析
	* DOM4J解析

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)


* schema和DTD的对比（面试题）：
	* schema符合XML的语法结构。		
	* 可以解析schema文档。
	* schema对名称空间支持的好。				
	* schem支持更多的数据类型，自定义的数据类型。

## 04-schema的快速入门


XML Schema是用一套预先规定的XML元素和属性创建的，这些元素和属性定义了XML文档的结构和内容模式。 XML Schema规定XML文档实例的结构和每个元素/属性的数据类型

Schema相对于DTD的明显好处是，XML Schema文档本身也是XML文档，而不是像DTD一样使用自成一体的语法

schema的快速入门:

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)


## 05-schema的快速入门总结


* 开发schema的约束文档
	* 引入W3C的名称
		* 在根节点上，使用属性xmlns(xml namespace)
		* xmlns="http://www.w3.org/2001/XMLSchema"
	* 定义元素
		* `<element name="书架"></element>`
	* 判断是否是复杂还是简单的元素
		* 如果是简单	在element有属性	type="数据的类型"	
		* 如果是复杂	
			* 声明标签是复杂的元素	`<complexType>`
			* 子元素之间的关系	`<sequence>`
	* 起名：targetNamespace	目标名称空间（起名）
		* 值是任意的：http://www.itcast.cn/1110
		
	* elementFormDefault	： 
		* qualified（使用）	：质量好的
		* unqualified		：质量不好的
		
* 在XML文档中引入自己编写的schema文档
	* 引入W3C名称空间，我是实例文档。
		* xmlns="http://www.w3.org/2001/XMLSchema-instance"
	* 引入自己编写的schema的文档
		* xmlns="http://www.itcast.cn/1110"
	* 问题：元素上不能有相同的属性名称
		* 解决：起别名		:aa
		* 技巧：在下面出现标签的概率小起别名
	* 引入自己编写的schema文档的地址
		* schemaLocation属性是W3C提供的，如果W3C名称空间要是有别名的话，先把别名写上。
			xsi:schemaLocation="名称空间   schema文件的地址"



## 06-schema的文档和名称空间的概念

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)

w3c文档.


![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)

练习：Company.xsd  department.xsd company.xml


![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)


## 07-JAXP的SAX解析

- 在使用 DOM 解析 XML 文档时，需要读取整个 XML 文档，在内存中构架代表整个 DOM 树的Doucment对象，从而再对XML文档进行操作。此种情况下，如果 XML 文档特别大，就会消耗计算机的大量内存，并且容易导致内存溢出。

- SAX解析允许在读取文档的时候，即对文档进行处理，而不必等到整个文档装载完才会文档进行操作。
- SAX解析，只能做查询，不能做增删改。



* SAX解析
	* 解析器
		* 获取解析器的工厂
		* 获取解析器对象
		* 解析XML(XML的文件的地址，事件处理器)
		
	* 事件处理器
		* 自己编写的类，需要继承DefalutHandler类，重写三个方法。
		* startElement()
		* characters()
		* endElement()


* SAX的解析原理：		
	解析器采用SAX方式在解析某个XML文档时，它只要解析到XML文档的一个组成部分，		（边读边解析）
	都会去调用事件处理器的一个方法，解析器在调用事件处理器的方法时，
	会把当前解析到的xml文件内容作为方法的参数传递给事件处理器。
	
	事件处理器由程序员编写，程序员通过事件处理器中方法的参数，
	就可以很轻松地得到sax解析器解析到的数据，从而可以决定如何对数据进行处理。

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)

## 08-JAXP的SAX解析快速入门

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)


---

下午。

## 09-JAXP的SAX解析

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)



## 10-DOM4J的简介和API文档


* DOM4J的解析（必须会，企业中用的多）
	* 先下载DOM4J相应的jar包。导入工程中，才能使用。
	* 把dom4j-1.6.1.jar导入到工程中。
	* WEB项目：复制dom4j-1.6.1.jar到	WebRoot -- WEB-INF -- lib里面。就ok。

> Dom4j是一个简单、灵活的开放源代码的库。Dom4j是由早期开发JDOM的人分离出来而后独立开发的。与JDOM不同的是，dom4j使用接口和抽象基类，虽然Dom4j的API相对要复杂一些，但它提供了比JDOM更好的灵活性。 


> Dom4j是一个非常优秀的Java XML API，具有性能优异、功能强大和极易使用的特点。现在很多软件采用的Dom4j，例如Hibernate，包括sun公司自己的JAXM也用了Dom4j。

> 使用Dom4j开发，需下载dom4j相应的jar文件。


index.html说明文档


## 11-DOM4J获取作者的文本内容


![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)


## 12-在末尾添加子节点

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)

## 13-在指定的位置添加子节点


![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)

## 14-删除和修改文档

删除：
![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)

修改：
![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)


## 15-DOM4J对XPATH的支持

* DOM4J对XPATH的支持
	* 导入包。jaxen-1.1-beta-6.jar。
	* 怎么使用？
		selectNodes("/AAA")			返回集合
		selectSingleNode()		一个Node对象
		
	* 参数就是xpath的语法
		* /AAA/BBB			获取BBB的节点
		* //BBB				无论层级关系，找到BBB的节点
		* *					代表是所有
		* /AAA/BBB[1]		找到BBB的第一个		/AAA/BBB[last()]	最后一个
		* @					属性

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)


## 16-扩展内容


项目：stu

-------------- 

Day06 End.



	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)