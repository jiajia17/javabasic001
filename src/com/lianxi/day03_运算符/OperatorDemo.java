package com.lianxi.day03_运算符;
/*
 * 运算符：就是用于对常量和变量进行操作的符号
 * 
 * 表达式：用运算符连接起来的符合java语法的式子。不同的运算符连接的表达式是不同的表达式。
 * 举例：a，b
 * 		a+b
 * 
 * 运算符分类
 *  	算术运算符  +，-,*,/,%(用于获取两个数据相除时候的余数),++,--
 *  	赋值运算符（ 基本赋值运算=） 扩展的赋值运算符：+=，-=,*=,/=...  
 *  	关系运算符
 *  	逻辑运算符
 *  	三元运算符
 *  +  做加法运算
 *  字符参与加法运算，其实是拿字符在计算机中存储的数据值来参与运算的
 *  	'A'  65
 *  	'a'  94
 *  	'0'  48
 *  字符串参与加法运算，是做字符串的拼接
 *  
 *  ++在后面，先拿变量做操作，然后变量再++
 *  ++在前面，先变量++，然后再拿变量做操作
 *  */
public class OperatorDemo {
	public static void main(String[] args) {
		//定义变量
		int a=3;   //把3赋值给int类型的变量a
		int b=4;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
	//	System.out.println(a/b);
		
		//整数相除只能得到整数。要想得到小数，就必须有浮点数参与运算
		System.out.println(3.0/4);
		System.out.println(3/4.0);
		
		System.out.println(b/a);
		System.out.println(b%a);
		
		//字符参与加法运算
		char c='A';
		System.out.println(a+c);
		
		//字符串参与加法运算
		System.out.println("hello"+a);
		System.out.println("Hello"+a+b);
		System.out.println(a+b+"Hello");
		int d=++a;
		System.out.println("a："+a);
		System.out.println("d:"+d);
		
		
		//+=  拿+=的左边和右边的数据做+，然后把结果赋值给左边
		a+=20;
		System.out.println("a:"+a);
		
		//注意：扩展的赋值运算符，隐含了强制类型转换
		//有一个变量a,a+=10
		//相当于：a=（a的数据类型）（a+10）
		short s=1;
		s +=1;
		System.out.println(s);
	}

}
