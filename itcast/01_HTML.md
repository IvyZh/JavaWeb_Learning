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

<a name="top">这是顶部</a>


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

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170110134024.png)

创建web项目

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170110132252.png)

创建xml文件

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170110132501.png)

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

* 字体标签

		* <font>字体的内容</font>
		* 字体标签：
		* <font></font>
		* color:	颜色
		* size：		字体的大小
			* 最大值和最小值
				* 最小值是：1
				* 最大值是：7,如果想更大，就使用css
			* 默认值：	3
				* 值的写法	+2-->（3+2）
		* face：		字体的类型

* 标题标签

		* <h1></h1>
			...
		  <h6></h6>	
		* 特点：逐渐缩小

* 粗体

		<b></b>
		
* 斜体	

		* <i></i>
		* 标签可以嵌套的
			<b><i>文本的内容</i></b>
			
* 特殊字符

		* <		&lt;
		* >		&gt;
		* & 	&amp;


		3<4 6>2 ----ok
		
		2<a b>4 ----no


* 滚动的字幕

		* <marquee>我是测试文本</marquee>

滚动的字幕效果：

<marquee>我是测试文本</marquee>

## 05-列表标签

> 是为了数据格式化列表
			
第一种code：

		<dl>
			<dt>上层项目</dt>
			<dd>下层项目</dd>
			<dd>下层项目</dd>
		</dl>
			
效果（自动对齐，缩进的）：

<dl>
	<dt>上层项目</dt>
	<dd>下层项目</dd>
	<dd>下层项目</dd>
</dl>

第二种有序列表：

	<ol>	
		<li>数据的条目</li>
		<li>数据的条目</li>
		<li>数据的条目</li>
	</ol>
				
	* ol的属性
		* type="a"
		* start="" 从哪开始	
		

有序列表效果：

<ol>	
	<li>数据的条目</li>
	<li>数据的条目</li>
	<li>数据的条目</li>
</ol>
			

第三种无序列表:

	<ul>
		<li>数据条目</li>
		<li>数据条目</li>
		<li>数据条目</li>
	</ul>	
	* ul的属性
		* type=""	circle square

	注：可以通过css把前面的小圆点去掉

无序列表效果：

<ul>
	<li>数据条目</li>
	<li>数据条目</li>
	<li>数据条目</li>
</ul>	

应用：

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170111134436.png)


## 06-图片标签

	<img />
		* 属性：
			* src="图片的地址"
			* width="图片的显示宽度"
			* height:图片显示的高度
			* alt：图片的说明文字，依赖于浏览器	


code:

	<img src="xx" width="60%" height="70%" alt="美女"/>

相对路线的写法

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170111134815.png)

工具：IETester

可以嵌套
code：

	<marquee> 
		<img src="http://img4.duitang.com/uploads/item/201203/28/20120328142832_nQuy8.jpeg"/>
	</marquee>

效果：

<marquee> 
	<img src="http://img4.duitang.com/uploads/item/201203/28/20120328142832_nQuy8.jpeg" width="100"/>
</marquee>


图片的热点区域其实就是讲一个图片专门的分割出一个链接区域，这就是热点（了解）

## 07-超链接标签

> 作用：链接资源 定义资源


- 链接资源
	* 必须要指定属性：href="链接的地址"
	* 需要编写协议
		* HTTP
	* **默认file文件的协议**
		* 如果浏览器可以解析文件，默认会打开文件。
		* 如果浏览器不可以解析文件，弹出下载窗口。
	* 支持自定义协议
		* 浏览器解析不了的协议，默认找操作系统的引用程序。
		

code :
	
	<a href="http://www.baidu.com">百度</a>
	<a href="../imgs/1.jpg">图片</a>
	<a href="../download/1.exe">文件</a>
	<a href="http://www.xunlei.com/jyfy.avi">电影1</a>
	<a href="thunder://balabalablabalbal">电影2</a>
	<a href="mailto:PR@meizu.com">联系我们PR@meizu.com</a>

- 定位资源
	* name	定义锚点
	* 点击	href="#锚点名称"


code：

	<a name="top">---这是顶部---</a>

	<a href="#top">回到顶部</a>


效果：

<a href="#top">回到顶部</a> //怎么不行啊。。。

## 08-表格标签

> 使用表格标签格式化数据，与列表标签注意区别

表格的应用
![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170111143412.png)


code:

	<table>
	
		<caption>用户信息</caption>
		<tr>
			<td>name</td>
			<td>age</td>
		</tr>
		
		<tr>
			<td>zhangsan</td>
			<td>18</td>
		</tr>
	
	<table>

效果：

<table border="2" width="100" heith = "200" bgcolor="red" bordercolor="green">
	<caption>用户信息</caption>
	<tr>
		<td>name</td>
		<td>age</td>
	</tr>
	<tr>
		<td>zhangsan</td>
		<td>18</td>
	</tr>
<table>


属性：


- table的属性
	* border:	边框
	* width:	宽度
	* height:	高度
		
- tr的属性
	* align:中间的文字的对齐方式	
		
- td&th区别：
	* th中间的内容粗体显示。
	* th中间的内容默认居中。
	* th一般用来表格的表头
			
- td的属性
	* width		宽度（一般都不会设置单元格的宽和高的）
	* height	高度
	* 合并单元格（值的写法：合并几个单元格，值就写几）
		* 行合并	rowspan=""
		* 列合并	colspan=""
				
* `<caption></caption>`必须要写在table的中间


合并单元格的应用和体现：

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170111151138.png)



## 09-表单标签一

> 收集用户输入的数据


	* 表单的标签
	<form >
		* form的属性
			* action="表单的提交路径"
				* http://www.baidu.com
				* html页面
			* method="提交方式（默认是get方式）"（面试题）
				* form表单的提交方式有哪些？（get和post的区别）
					* 答：form表单提交方式有很多，常用的有两种post和get
						* post和get提交方式的区别：
							* get方式会把参数列表显示在地址栏上，post方式不会（请求体）。
							* get方式说明网站安全级别较低，post安全级别较高。
							* get方式不支持大数据，post支持大数据。
							
					* 推荐大家使用post方式。
		
		* 用户输入的内容
		<input type="类型" name="名称(必须要指定)" value="是否指定value属性" />
			* name属性必须要指定，value可以看情况指定
		
		* type="text"			普通的文本框
			* name必须指定
			
		* type="password"		密码框
			* name必须指定
			
		* type="radio"			单选按钮
			* name必须指定	value必须指定
			* name的属性，值要相同
			* 默认值：checked=checked或者true
			
		* type="checkbox"		多选按钮
			* name必须指定	value必须指定
			* 默认值：checked=checked或者true
			
		* type="reset"			重置：恢复到最初的状态	
		* type="submit" 		提交表单
			* 点击提交后，地址栏发生了变化（?sex=on）
			* 在普通的文本框上添加name属性 name="username"之后，点击提交，地址栏发生了变化（?username=haha&sex=on）
				String str = "?username=haha&sex=on";
			* ?username=zhangsan&password=123&sex=nan&love=zq	
				
		
	</form>



code:

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170112102812.png)

## 10-表单标签二

	* type="file"			选择文件		
		* name属性指定
	* type="hidden"			隐藏组件,用处：
		* name指定 value指定	
		
	* type="button"			按钮
		* value="显示的文字"
		* 和js（javascript）	绑定事件
	
	* type="image"			图片---?这个有提交的效果？
		* 提交	引入外部的一个文件（图片）
	
	* 声明选择框	
		<select name="city">
			<option value="bj"></option>
			<option value="sh"></option>
		</select>	
		* selected="selected"	代表默认值
	* <textarea>文本域
		* rows="行"
		* clos="列"	
		* name属性指定
		


code:

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170112110206.png)


## 11-表单的form属性

* form的属性
	* action="表单的提交路径"
		* http://www.baidu.com
		* html页面
	* method="提交方式（默认是get方式）"（面试题）
		* form表单的提交方式有哪些？（get和post的区别）
			* 答：form表单提交方式有很多，常用的有两种post和get
				* post和get提交方式的区别：
					* get方式会把参数列表显示在地址栏上，post方式不会（请求体）。
					* get方式说明网站安全级别较低，post安全级别较高。
					* get方式不支持大数据，post支持大数据。
					
			* 推荐大家使用post方式。



这是一个GET请求：
	
	<a href="http://www.baidu.com?usernam=zhangsan&pwd=123">后台</a>

## 12-表格和表单
> table和form的结合：


![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170112140227.png)



## 13-多媒体标签

用的比较少。几乎不用。

	<bgsound="1.mp3" loop="-1">

IE支持


## 14-框架标签（了解）

	<frameset rows="150,*">
		<frame >	代表上半部分
		<frame >	代表下半部分
	</frameset>
	
>前提条件：不能写在<body>标签的内部和下面


	<a href="xx.html" target="_black">用户管理</a>
	
	<a href="xx.html" target="right">用户管理</a>


code:

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170112141821.png)


## 15-简单复习

--------------

Day01 End.


	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)
