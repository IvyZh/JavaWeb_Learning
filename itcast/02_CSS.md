> 传智播客-铁男

> 录制时间：2014.11.11

## 01-课程回顾

HTML语言回顾

	* HTML的简介	超文本标记语言。
	* 是网页最基础的语言。
	* 都是由标签所组成的。
	
	* HTML的基本格式
		<html>
			<head>
				属性信息，辅助性的信息
				引入外部的文件（css、js）
				先加载
			</head>
			<body>
				真正的数据内容（展示用户的数据）
			</body>
		</html>
	
	* HTML的规范
	
	* HTML的标签
		* 排版标签
			* <br />	换行
			* &nbsp;	空格
			* <hr />	水平线
			
			* <p></p>	段落标签
			
			* <div></div>
			* <span></span>
			
		* 字体标签
			* <font></font>
				* color：颜色
				* size：字体的大小
					* 最大值：7	最小值是1
				* face：字体的类型
			
			* 标题的标签
				<h1></h1>
				<h6></h6>
				
			* 粗体标签	斜体标签
			
			* 特殊字符
				<	&lt;
				>	&gt;
				&	&amp;
				
		* 列表标签
			<dl>
				<dt></dt>
				<dd></dd>
			</dl>
			
			有序列表和无序列表
				有序：
					<ol type="a" start="3">
						<li></li>
					</ol>
				无序：
					<ul type="">
						<li></li>
					</ul>
					
		* 图片标签
			<img src="图片的地址" width=""  height="" alt="图片的说明文字">
			
		* 超链接的标签
			<a></a>
			* 链接资源
				通过href=""
					* 访问网络的资源：
					* 
					* 
					* ://www.baidu.com
					* 默认file文件的协议
					* 支持自定义的协议
					
			* 定位资源
				* 通过name	定义锚点
					* 返回需要使用href="#锚点的名称"
					
		* 表格标签
			<table border="1" width="" height="" >	：声明表格的范围
				<caption></caption> ：表格标题标签
				<tr align="中间显示文字对齐方式"> ：行
					<th></th> ：单元格
						* 默认居中和加粗
				</tr>
				<tr>
					<td></td> ：单元格
						* 行合并：rowspan="2"
						* 列合并：colspan="2"
				</tr>
			</table>
			
		* 表单标签
			<form action="表单提交地址" method="提交方式" >
				* 表单的提交方式？
					* 最常用的两种，get和post
					* 区别：
						* get方式将参数列表显示在地址栏上，post不会，参数封装到请求体中。
						* get方式安全级别较低，post较高。
						* get方式不支持大数据，post支持大数据。
						
					* 输入项
						<input type="text" name="username" >	文本框
						<input type="password" name="password" /> 密码框
						<input	type="radio" name="sex" value="0" checked="checked" />男
						<input type="checkbox" name="love" value="0" />篮球
						
						<input type="file" name="myfile" />	上传文件
						<input type="hidden" name="userId" value="001" />隐藏组件
						<input type="button" value="我是按钮" />
						<input type="image" src="引入一张图片" > 提交
						
						<select name="city">
							<option value="bj">数据</option>
						</select>
						
						<textarea rows="10" cols="10" name="desc"></textarea>
						
						<input type="reset" value="重置" />
						<input type="submit" value="提交" />
			</form>
			
		* 框架标签
			<frameset rows="150,*" >
				<frame src="链接html" name="top">
				<frame src="链接html" name="left">
			</frameset>
## 02-CSS的简介

### 主要内容
* CSS简介
* CSS和HTML的结合
* CSS的选择器
* CSS的布局（了解）
* Javascript（js）
* Javascript简介
* Javascript语法
* Javascript对象和API
* DOM文档对象模型
* BOM浏览器对象模型

CSS的用处：

![](http://1)


> CSS （Cascading Style Sheets）是层叠样式表用来定义网页的显示效果。可以解决html代码对样式定义的重复，提高了后期样式代码的可维护性，并增强了网页的显示效果功能。简单一句话：CSS将网页内容和显示样式进行分离，提高了显示功能。


	* CSS：cascading style sheet	：层叠样式表。
	* 做什么用：设置网页的显示效果（设置样式）。		
	* CSS将网页显示的效果和内容分离。（耦合性）
		
		超<font>文本</font>标签语言
		
	* HTML只需要把文本内容封装起来，不用属性，用CSS的代码来控制显示效果。
	* 如果开发了多套CSS的代码，都不用修改HTML的代码。


## 03-CSS与HTML的结合方式

4种结合方式（重点）

* 1.在html的标签上，提供了一个(属性)，style="CSS的代码"，属性之间要用分号隔开， `<div style="background-color:red;color:lime;">哈哈<div>`
* 2.在HTML的文件，提供了一个(标签)	`<style type="text/css">CSS的代码</style>`，这个标签放在`<head></head>`的中间


code:

	<html>
		<head>
			<style type="text/css">
				div{
					background-color:red;
					color:lime;
				}
			</style>
		</head>
		
		<body>
			<div>哈哈哈<div>
		</body>
	
	</html>

* 3.引入外部的文件的方式（引入CSS的文件，定义一个css文件（后缀名名  demo.css））（经常使用的方式）
	* @import url("CSS文件的地址");	 属性必须要写`<style></style>`内部。大写和小写都没有问题。（注意：必须有;）
	* css的注释 /* */


code:

div.css:

	div{
			background-color:red;
			color:lime;
		}

demo.html:

	<head>
		<style type="text/css">
			@import url("div.css");
			@IMPORT url("span.css");
		</style>
	</head>


使用一个总的css管理器

zong.css:

	@import url("div.css");
	@IMPORT url("span.css");

demo.html:

	<head>
		<style type="text/css">
			@import url("zong.css");
		</style>
	</head>


> 如果想给p标签引入样式，这样就只需要修改zong.css文件就可以，大大的降低了耦合度

* 4.引入外部文件的方式，通过一个`<link>`		写在`<head></head>`中间， 不要放在`<style>`中间（经常使用）
	* rel：代表当前和引入文件之间的关系，stylesheet
	* type：text/css
	* href：引入CSS文件的地址


## 04-CSS的优先级和规范简介

* 从上到下，由外到内，优先级是从低到高的。（一般情况下）（*****）
* 标签名选择器 < 类选择器 < ID选择器 < style属性	（特殊情况下）（*****）

* 规范
	* CSS的写法：	div{CSS的属性名:值;CSS的属性名:值;...}
	* 如果一个属性有多个值，值与值之间使用空格隔开
		* 例子 div{ xx:yy zz aa },边框，大小颜色...

## 05-CSS的基本选择器 


* CSS的选择器-----告诉CSS的代码作用在哪个标签上。
	* 基本选择器
		* 1. 标签名选择器		div{}	span{}
		* 2. 类选择器：在HTML的标签上，提供了属性	class，定位到div的标签（美工经常使用的方式）
			* 写法：	.class的名称	(div.hehe{font-size:25px;color:fuchsia})
			* 设置不同的标签，具有相同的样式
				* .hehe{font-size:25px;color:fuchsia}

		* 3. ID选择器
			* 在HTML的标签上，提供的属性 设置样式
				* 写法：	#id的名称	(#haha{font-size:25px;color:fuchsia})
			* 一般情况下：设置不同的ID,如果不同html标签设置了相同的id，就会有同一个#id效果
				* 一般情况下给js语言来使用。
				
	
			

## 06-CSS的扩展选择器
* 标签名选择器 < 类选择器 < ID选择器 < style属性	（特殊情况下）（*****）

* 扩展选择器
	* 关联选择器：标签可以嵌套，标签与标签之间的关系。
		* 写法：	中间用空格隔开	例子（div font{font-size:25px;color:fuchsia}）
		
	* 组合选择器：对多个不同的选择器（id class选择器）进行相同的样式
		* 写法：在多个不同的选择器之间用 ,	隔开  .hehe,#haha{font-size:25px;color:fuchsia}
		
	* 伪元素选择器：	定义好的一些选择器，用就ok。
		* 如果使用超链接伪元素选择器：使用顺序：	L V H A，注意！


伪元素选择器:
	
	<head>
		<style>
		
			input:FOUSE{
				background-color:gray	
			}
		</style>
	</head>

超链接：

	/* 未访问*/
	a:LINK{
		text-decoration:none;
		color:blue;
	}

	/* 访问完成*/
	a:VISITED{
		font-size:20px;
		color:yellow;
	}

	/* 悬停*/
	a:HOVER{
		font-size:25px;
		color:red;
	}

	/* 点击*/
	a:ACTIVE{
		font-size:35px;
		color:green;
	}
## 07-CSS的布局（了解）

> 参考工具：CSS2.0样式表中文手册

> CSS+DIV进行布局


	<div>
		<div>
			<img />
		</div>
		<div>
			<font>领导很忙</font>
		</div>
	</div>
			

![](http://2)

如何横向布局呢？

float文本流。

![](http://3)

![](http://4)

![](http://5)

![](http://6)

![](http://7)

## 08-js的简介




## 09-js与HTML的结合方式
## 10-js的基本数据类型和定义变量
## 11-js的运算符
## 12-结束的语句
## 13-99乘法表
## 14-js的数组
## 15-js的函数
## 16-复习

--------------

Day02 End.

	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)