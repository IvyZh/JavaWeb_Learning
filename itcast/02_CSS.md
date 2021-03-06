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

CSS的用法：

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170112155910.png)


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
			

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170112175939.png)

如何横向布局呢？

float文本流。

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170112183445.png)

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170112183511.png)

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170112183625.png)

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170112183712.png)

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170112183844.png)

## 08-js的简介

> Javascript是基于对象和事件驱动的脚本语言，主要应用在客户端。

特点：

- 交互性（信息的动态交互）
- 安全性（不可以直接访问本地硬盘）
- 跨平台性（只要是可以解析js的浏览器都可以执行，和平台无关）

HTML--->界面数据的显示
CSS---->界面样式
Javascript--->逻辑，交互（网站的动态效果）



* javascript和java不同（一点关系没有）（雷锋和雷峰塔）
	* Netscape（网景），静态的效果。livescript（javascript的前身）
	* java诞生了，升级了，改名（javascript），火了。
	* 巨头：自己开发一套（jscript）
	* 找一些公司推出的标准：	SUN	微软	ECMA（欧洲计算机制造协会），联合推出现在的标准。
	
	* ECMAScript：标准。基础上扩展。
	
	* js的基于对象，java是面向对象。
	* js解析就可以执行，java先编译再执行。
	* js是弱类型的语言，java是强类型语言。


* javascript语言的组成
	* ECMAScript	标准（js的语法，变量，函数）
	* BOM			（Browser Object Model）	浏览器对象模型
	* DOM			（Document Object Model）	文档对象模型	


## 09-js与HTML的结合方式


* 1.js代码直接写在html里面
	1. HTML的文件提供了一个标签	<script type="text/javascript">js的代码</script>，标签可以放在HTML文件的任意位置上。head body 都可以，推荐放在body后面
	2. js代码又三种注释方式


code:

	<html>
		...
		<script type="text/javascript">
			window.alert("hehe");
		</script>
		...
	</html>

* 2.引入外部js文件,`<script src="引入js文件（相对路径）" >`,如果script通过src的属性引入了外部的文件，里面的js代码就不会执行了。

demo.js

	alert("hehe");

xx.html


	<html>
		...
		<script type="text/javascript" src="demo.js">
			window.alert("hehe");
		</script>
		...
	</html>


F12 打开浏览器调试工具

## 10-js的基本数据类型和定义变量


* 关键字
	* var	声明变量   function 声明函数
	
* 标示符
	* 和java一样
	
* 注释
	* 和java一样
	
* 变量		
	* 声明变量，只使用一个关键字	var num = 12;  var str = "abc"; 
	* 5种基本数据类型
		* 5种基本数据类型
		* Undefined、Null、Boolean、Number 和 String 
		
			* String		字符串类型
				* js中双引号和单引号都代表的是字符串
			* Number		数字类型
				* 不区分整数和小数
			* Boolean		布尔类型
			* Null			空，给引用赋值的
			* Undefined		未定义（声明变量，没有赋值）
		
		* 声明变量，使用var关键字	
		* typeof() 判断当前变量是什么类型的数据
			* var num = 12;num = "123";
			* alert(typeof(num));// number,string
			* var data = null;alert(typeof(data));//object
			* var d;alert(typeof(d));//undefined


code:

	num2 = 2
	alert(num2);// 不加分号，不写关键字也是ok的，但不建议这么做。


			
## 11-js的运算符

参考工具：w3school

* 算术运算符
	* 0或者null是false，非0或者非null是true，默认用1表示。
	
		var num = 3710;
		alert(num/1000*1000);// 3710
		
		var n = "12";
		alert(n-1);//11

		alert("abc"-1);//Nan
		* 不区分整数和小数

> Javascript中小数和整数都是数字类型，所以除法中没有整数，会出现小数。

> 字符串与数字相加，是字符串链接，如果相减，字符串直接转换成数字再相减。

> Boolean类型可以进行运算，false就是0或者null，非0非空是true，默认用1显示。

> ++ -- 等和java中一样。



	var num = 123;
	
	if(num = 1){// 这里应该是用==
		alert("ok");//会弹出来
	}else{
		alert("no equeal");
	}


* 赋值运算符
	* 和java是一样的
* 比较运算符
	* ==	比较值是否相同
	* ===	**比较值和类型是否相同**
* 逻辑运算符
	* 和java中一样

* 三元运算符
	条件?值1:值2

## 12-结束的语句

判断语句 if...else,switch

循环语句 for(var i = 0;i<5;i++){},while,do...while


document.write("文本内容");// 文本内容可以输出HTML代码


## 13-99乘法表

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170113160139.png)


## 14-js的数组

* js的数组
	* java	String [] str = {};
	* 声明数组
		* var arr = [12,34,55];
		* var arr = new Array(5);		声明数组，长度是5
		* var arr = new Array(2,3,4);	声明数组，元素是2 3 4
		
	* 数组的属性
		* 长度：length
		* 数组的长度是可变的。 arr[3] = 9;//ok
		* arr[4] = "abc";//ok

> document.write(arr);// 12,34,55,9





## 15-js的函数


* js的方法
	* java中	public String 方法名称(参数列表(int num,String str)){
					方法体;
					return null;
				}
				
	* js中，通过关键字function	声明方法。
		
		function 方法名称(参数列表 (num,str)){
			方法体;
			return;
		}
		
		* 参数列表：**不能使用var关键字**
		* 返回值：可写可不写的，如果有写返回值，如果没有，返回值可以省略不写。
		
	* 调用执行。	
	
	* 在函数的内部，有一个数组，装传过来的参数的
		* arguments:这是一个参数

	* Javascript中不存在重载形式。


![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170113162202.png)

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170113162557.png)

![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE20170113162946.png)

## 16-复习

--------------

Day02 End.

	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)