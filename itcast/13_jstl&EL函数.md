> 传智播客-铁男

> 录制时间：2014.11.11


## 01-课程回顾
## 02-jstl的概述

![](http://1)


* 下载jar包，导入到工程中
	- jstl.jar
	- standard.jar

* 标签库
	- c.tld		核心的标签库
	- fn.tld		EL表达式标签库

## 03-jstl的快速入门


	* JSTL的快速入门
		* 导入相应jar包。
		* 新建JSP的文件，引入标签库
			<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
		* 直接使用标签库


![](http://2)

这里传统方式输出a = 10的样式？

## 04-jstl的out标签


	<c:out>		输出内容
		value	：输出的内容（常量或者变量）
		default	:默认值
		escapeXml：默认是true，进行转义，设置成false，不转义。
		
		代码：
			<c:out value="Hello"></c:out>
			<c:out value="${name }"></c:out>
			<!-- "" -->
			<c:out value="${ city }" default="北京"></c:out>
			<c:out value="<a href='#'>超链接</a>" escapeXml="false"/>
				


## 05-jstl的set、remove和catch标签
## 06-jstl的if和choose标签
## 07-forEach遍历数据
## 08-forEach迭代数据
## 09-jstl的import、url和redirect标签
## 10-简单复习
## 11-自定义EL函数
## 12-自定义标签介绍和快速入门
## 13-带有标签主体的自定义标签
## 15-JSP的模式
## 16-MVC案例分析
## 17-框架搭建

--------------

Day02 End.



[print]


	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)