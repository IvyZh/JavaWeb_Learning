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


![](http://1)

## 03-schema的简介和DTD的对比

* XML约束
	* schema


* XML编程
	* JAXP的SAX解析
	* DOM4J解析

![](http://2)


* schema和DTD的对比（面试题）：
	* schema符合XML的语法结构。		
	* 可以解析schema文档。
	* schema对名称空间支持的好。				
	* schem支持更多的数据类型，自定义的数据类型。

## 04-schema的快速入门


XML Schema是用一套预先规定的XML元素和属性创建的，这些元素和属性定义了XML文档的结构和内容模式。 XML Schema规定XML文档实例的结构和每个元素/属性的数据类型

Schema相对于DTD的明显好处是，XML Schema文档本身也是XML文档，而不是像DTD一样使用自成一体的语法

6：00


## 05-schema的快速入门总结
## 06-schema的文档和名称空间的概念
## 07-JAXP的SAX解析
## 08-JAXP的SAX解析快速入门
## 09-JAXP的SAX解析
## 10-DOM4J的简介和API文档
## 11-DOM4J获取作者的文本内容
## 12-在末尾添加子节点
## 13-在指定的位置添加子节点
## 14-删除和修改文档
## 15-DOM4J对XPATH的支持
## 16-扩展内容

--------------

Day02 End.



	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)