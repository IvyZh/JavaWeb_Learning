> 传智播客-铁男

> 录制时间：2014.11.11



## 01-课程回顾


* js语法
	* js的动态函数和匿名函数
		* js动态函数	Function	new Function();
		* 匿名函数：没有名称的函数，起个名称
			var add = function(){
			};
	* js中全局变量和局部变量
		* 全部变量：定义`<script>`标签中的变量，在页面的任意位置上都能拿到。
		* 局部变量：定义在方法内部的变量
		
	* js的对象和API
		* String对象
			* 属性：length长度
			* 方法：
				* 和HTML相关方法
					* bold()	粗体
					* fontcolor()	字体颜色
					* sup()		上标
					* sub()		下标
					
				* 和java中String类似的方法
					* charAt()		返回指定位置的字符
					* indexof()		返回字符的位置
					* substring(start,stop)	截取字符串
					* substr(start,length)		截取字符串
				
		* Array数组
			* 声明数组	
				* var arr = [22];
				* var arr = new Array(4或者"abc");
				
			* 方法：
				* concat()		链接数组或者元素
				* pop()			删除最后一个元素，返回
				* push()		向末尾添加一个元素，返回长度。
				* sort()		排序
				
		* Date对象
			* var date = new Date();	当前时间
			* 方法：
				* toLocaleString()		显示当地日期格式
				* getFullYear()			获取年份
				* getMonth()			获取月份(0-11)	+1
				* getDate()				几号
				* getDay()				星期几
				
				* getTime()				毫秒值
				* setTime()				根据毫秒值设置时间
				* Date.parse();			可以字符串，返回是毫秒值
				
		* Math数学
			* ceil()	上舍入
			* floor()	下舍入
			* round()	四舍五入
			* random()	随机数
			
		* RegExp对象
			* new RegExp("")
			* var reg = /^表达式$/;（记住）
			
			* reg.test(string);（记住）	如果匹配返回true，如果匹配不成功返回false。
			
		* 全局函数
			* eval()		解析字符串，执行js的代码。
			* isNaN()		判断是否是非数字值
			* parseInt()	
			
* BOM	浏览器对象模型
	* winodw			窗口对象
		* alert()		提示框
		* confirm()		询问框
		* setInterval("run()",3000)		每隔3秒执行run方法，返回唯一的id值
		* setTimeout("run()",3000);		3秒后执行run方法，返回唯一的id值
		
		* 清除定时器
			* clearInterval(id)	
			* clearTimeout(id)
			
		* open("","","")	弹出新的窗口	
		* close()			关闭窗口
	
	* navigator			和浏览器版本相关
		* 属性
	* history			和历史相关
		* back()		上一页
		* forward()		下一页
		* go(1或者-1)	
	* location			和地址相关
		* href=""	获取和设置链接



## 02-DOM简介和解析HTML

* DOM	文档对象模型
	* Document	Object	Model
	* 文档：标记型文档	（HTML/XML）
	* 对象：封装属性和行为（方法）
	* 模型：共性特征的体现
	
	* DOM解析HTML
		* 通过DOM的方法，把HTML全部（元素（标签）、文本、属性）都封装成了对象。
			`<span id="spanId">文本</span>`
		* DOM想要操作标记型文档先解析。（解析器）
			* DOM解析HTML（浏览器就可以HTML）
		* 浏览器DOM解析HTML？
			

> 文档：标记型文档
对象：封装了属性和行为的实例，可以直接被调用。
模型：所有的标记型文档都具有一些共性特征的一个体现。
用来将标记型文档封装成对象，并将标记型文档中的所有内容（标签、文本、属性）都封装成对象。
封装成对象的目的是为了更方便的操作这些文档及其文档中的所有内容。因为对象包含属性和行为。
标记型文档包含标签、属性、标签中封装的数据。只要是标记型文档，DOM这种技术都可以对其进行操作。
常见的标记型文档包括：HTML   XML。
DOM要操作标记型文档必须先进行解析。


![](http://1)

## 03-DOM的三个级别和DHTML


* DOM的三个级别：
	- DOM level 1：将html文档封装成对象。
	- DOM level 2：在level 1的基础上添加新的功能，例如：对于事件和css样式的支持。
	- DOM level 3：支持xml1.0的一些新特性。

* DHTML不是一种编程语言,动态的HTML，它不是一门语言，是多项技术综合体的简称。
	* html		：封装数据。	`<span>展示给用户的数据</span>`
	* css		：设置样式（显示效果）
	* dom		：操作HTML（解析HTML）
	* js		：提供逻辑（判断语句，循环语句）


## 04-在末尾添加子节点



* BOM 和HTML DOM关系图

![](http://2)


* Document：代表整个文档。
	* 方法：
		* getElementById("id的值");			通过元素的id的属性获取元素（标签）对象。
		* getElementsByName("name属性值");		通过名称获取元素对象的集合（返回数组）
		* getElementsByTagName("标签名称");	通过标签名称获取元素对象的集合（返回数组）
		* write("文本的内容（html的标签）")		把文本内容写到浏览器上。
		* createElement("元素名称");		创建元素对象
		* createTextNode("文本内容")		创建文本对象
		* appendChild("子节点")				添加子节点
		
![](http://3)



> 在ul无序列表下，添加一个子节点
![](http://4)



## 05-Element对象

* Element对象
	* 获取元素对象
		* getAttribute("属性名称");	获取属性的值
		* setAttribute("属性名称","属性的值");	设置或者修改属性的值
		* removeAttribute("属性名称");		删除属性
		
	* 获取元素下的所有子节点（*****）
		* ul.getElementsByTagName();
		* document.getElementsByTagName(); 区别
![](http://5)

## 06-Node节点属性

* Node：节点对象
	* nodeName		：节点名称
	* nodeType		：节点类型
	* nodeValue		：节点的值
	* parentNode	获取父节点（永远是一个元素节点）

![](http://6)


	IE6-8                                 IE9-10 Chrome FireFox
	firstChild 第一个节点                 firstElementChild 第一个节点
	lastChild最后一个节点、               lastElementChild 最后一个节点
	nextSibling 下一同级节点              nextElementSibling 下一同级节点
	previousSibling 上一同级节点          previousElementSibling 上一同级节点


code:

	<ul>
		<li>北京</li>
	</ul>	
	
	* 如果通过ul获取北京的子节点，使用是	ul.firstElementChild;	获取北京的子节点（IE9-11 Chrome FireFox）
	* 但是如果IE6-8，需要使用firstChild;	
		
	<span id="spanId">
		文本内容
	</span>	
	
	* 使用span的标签获取span中间的文本内容（也是对象）,需要使用firstChild;（不管是什么浏览器）


## 07-Node节点方法

* 方法
	* hasChildNodes()		检查是否包含子节点
	* hasAttributes()		检查是否包含属性
	
	* appendChild(node)			父节点调用，在末尾添加子节点
	* insertBefore(new,old)		父节点调用，在指定节点之前添加子节点
	* replaceChild(new,old)		父节点调用，替换节点
	* removeChild(node)			父节点调用,删除节点
	
	* cloneNode(boolean)		不是父节点调用,复制节点
		* boolean	：如果是true，复制子节点
					：如果是false，不复制子节点，默认是false


无序列表的内容替换：

![](http://7)


复制按钮到span区域：

![](http://8)

---
下午。

## 08-innerHTML的属性



* innerHTML	：获取和设置文本内容。
	* innerHTML属性：
		* 获取文本内容
		* 设置文本内容
		
	* 事件：
		onclick		点击事件
		onload		加载事件
		onfocus		获取焦点事件
		onblur		失去焦点事件

![](http://9)

## 09-全选练习

* 全选/全不选/反选的练习
	`<input type="checkbox" />`
	* 指定默认值：checked	只要出现在 `<input type="checkbox" checked="checked" />` ,对号就勾上了。



## 10-下拉列表左右选择

![](http://10)

![](http://11)

![](http://12)

双击ondblclick


![](http://13)


## 11-省市联动


![](http://14)


select-->onchange(this.value)


code:

	<body>
		
		<select id="select1" onchange="run(this.value)">
			<option>--请选择--</option>
			<option value="北京">北京</option>
			<option value="河北">河北</option>
			<option value="山东">山东</option>
			<option value="河南">河南</option>
		</select>
		
		<select id="select2">
			
		</select>
		
	</body>
	<script type="text/javascript">
		/* 
			* 思路：通过传过来的值，和数组对比，如果匹配成功，获取数组中后面的值（1开始），添加select2中。
				
				* 事件：改变事件
					* onchange
					* 通过改变事件把值传过来
				* 区数组中获取值（获取里面的数组0位置的元素），和传过来的值做对比，如果匹配，获取该数组中后面的值。
				* 添加到select2中。
		*/
		var arr = [];
		arr[0] = new Array("北京","海淀区","昌平区","朝阳区","东城区","西城区","丰台区","大兴区","怀柔区");
		arr[1] = new Array("河北","石家庄","保定","邯郸","秦皇岛","张家口","唐山","承德","廊坊");
		arr[2] = new Array("山东","济南","青岛","烟台","威海","潍坊","菏泽","临沂","淄博","济宁","聊城");
		arr[3] = new Array("河南","郑州","洛阳","信阳","安阳","南阳","开封","商丘","驻马店","平顶山");
		
		function run(val){
			// 获取select2
			var select2 = document.getElementById("select2");
			// 先清除掉select2下所有的子节点
			// 先获取select2下所有的子节点
			var ops = select2.getElementsByTagName("option");
			// 循环遍历
			for(var x=0;x<ops.length;x++){
				// 获取每一个
				var op = ops[x];
				// 删除节点
				select2.removeChild(op);
				x--;
			}
			
			// alert(val);
			// 获取数组的值
			for(var i=0;i<arr.length;i++){
				var inarr = arr[i];
				// 里面的数组0位置的元素
				var str = inarr[0];
				// alert(str);
				// 判断传过来的值和数组的值是否相等
				if(val == str){
					// 获取数组后的内容
					for(var j=1;j<inarr.length;j++){
						// 除了0位置后的所有元素
						var instr = inarr[j];
						// alert(instr);
						// 添加到select2中
						// 创建元素对象
						var option = document.createElement("option");
						// 创建文本对象
						var text = document.createTextNode(instr);
						// 把文本添加到元素的下面
						option.appendChild(text);
						// 把元素添加到select2中
						select2.appendChild(option);
					}
				}
			}
		}
		
	</script>



## 12-事件简介

* 鼠标移动的事件
	onmousemove
	onmouseout			
	onmouseover			
	
* 鼠标点击事件（*****）
	onclick			单击
	ondblclick		双击
	
* 加载和卸载
	* onload（*****）		加载
	* onunload		卸载
	
* 获取焦点和失去焦点（*****）
	* onfocus		获取焦点
	* onblur		失去焦点
	
* 键盘
	* onkeyup		按下抬起
	
* 改变事件（*****）
	* onchange
			
## 13-简单复习

--------------

Day04 End.



	![](https://github.com/IvyZh/JavaWeb_Learning/blob/master/imgs/itcast/QQ%E6%88%AA%E5%9B%BE.png)