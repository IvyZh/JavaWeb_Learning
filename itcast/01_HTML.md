> 传智播客-铁男

> 录制时间：2014.11.11

## 01-HTML的简介

> HTML: HyperText Markup Language,超文本标记语言。

1. 文件的后缀可以是html或者htm。
2. 编辑文本
3. 使用浏览器打开（chrome、ie、firefox）


code:

	这是一段<font color="red" size="18">HTML</font>代码。
效果：

这是一段<font color="red" size="18">HTML</font>代码。



* 全称为HyperText Markup Language,译为超文本标记语言，不是一种编程语言，是一种描述性的标记语言，用于描述超文本中内容的显示方式。比如字体什么颜色，大小等。
* Html就是超文本标记语言的简写，是最基础的网页语言。
* Html是通过标签来定义的语言，代码都是由标签所组成。

文档：HtmlHelp.chm


### HTML的基本格式


code:

	<html>
	
		<head>
			<title>我是标题</title>
				存放属性的信息，辅助性的信息
				引入外部文件（css javascript）重要
				会先加载head
		</head>
	
		<body>
		
			这是一段<font color="red" size="18">HTML</font>代码。
			存放的是真正的数据
	
		</body>
	</html>


### HTML注意事项

- 多数标签都是有开始标签和结束标签，其中有个别标签因为只有单一功能，或者没有要修饰的内容可以在标签内结束。（换行 `<br />` ps:`<br >`这样运行也是ok的，但是不建议这么做。
- 想要对被标签修饰的内容进行更丰富的操作，就用到了标签中的属性，通过对属性值的改变，增加了更多的效果选择。
- 属性与属性值之间用“=”连接，属性值可以用双引号或单引号或者不用引号，一般都会用双引号。或公司规定书写规范。

code:

	这是一段HTML<font color="blue" size='16' face=隶书>文本</font>代码。

效果:

这是一段HTML<font color="blue" size='16' face=隶书>文本</font>代码。


## 02-myeclipse的简介和配置


* MyEclipse		提供了安装包	
	* 安装JDK，配置环境变量
	* 安装MyEclipse。
	
	* 配置
		
		* 配置工作空间的编码（采用UTF-8编码）（安装了myeclipse，先去配置）
		
		* Window—preferences—General--workspace—选择UTF-8编码
		
		* 创建HTML的文件后，如果不是UTF-8的编码，可以进行设置。
			* Window—preferences—MyEclipse—Files and Editors—HTML—修改成UTF-8的编码
		
		* 创建HTML的文件后，可以选择打开方式，设置默认的打开方式。
			* Window—preferences—General—Editors—File Associations—选择*.html—选择MyEclipse HTML Editor—选择default—选择ok

![](http://3)

创建web项目

![](http://1)

创建xml文件

![](http://2)

步骤：

* （编写HTML）创建web的项目
	* 创建web的项目
		* 右键 -- 选择web project	-- 其名称 -- 完成就ok。
		
	* 编写HTML的文件
		* 在WebRoot目录下 -- 右键 -- new -- myeclipse -- web -- 选择html的基本模板 -- 其名称 -- 完成。

## 03-排版标签


在WebRoot目录下，不能创建包了，只能创建文件夹。


	* <!-- -->		HTML的注释
	* <br />		换行标签
	* <hr />		一条水平线
	
	排版标签
		* <br />	换行
		* <hr />	一条水平线
			* color:	颜色
				* 值的写法：两种	
					1）直接写英文的单词（red green blue）	
					2）RGB三原色(red green blue)	#ab1255
			* width：	宽度
				* 值两种写法：
						1）	200px;	
						2）	可以写百分比
							区别：百分比跟着浏览器的大小而改变，像素值不会。
							
		* <p></p>	段落标签
			* 段落标签的开始和结束位置留一空行。
			* align：对齐方式
			
		* &nbsp;	代表空格

		* 在浏览器声明一块区域，区域中放入其他（文字，子标签）html支持标签的嵌套
						* <div></div>		+CSS+DIV在网页进行布局（美工）
						* <span></span>		
							* div块级元素（换行的符号）	
							* span标签不会换行	行内元素	，可以作为提示文字，比如用户名不能为空，密码错误等，这些可以通过js程序动态添加内容。

code:

	<hr width="300px" color="red"/>
	
	<hr width="50%" color="#ffffee"/>

	<p align="center"></p>

	<span>密码错误</span>


## 04-字体标签





## 05-列表标签
## 06-图片标签
## 07-超链接标签
## 08-表格标签
## 09-表单标签一
## 10-表单标签二
## 11-表单的form属性
## 12-表格和表单
## 13-多媒体标签
## 14-框架标签
## 15-简单复习

--------------

Day01 End.
