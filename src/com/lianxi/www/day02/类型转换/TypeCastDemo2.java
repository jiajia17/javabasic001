package com.lianxi.www.day02.类型转换;
/*
 * 强制转换：
 *  目标类型  变量名 =（目标类型）（被转换的数据）；
 *  建议：数据做运算，结果应该是什么类型，就用什么类型接收，不要随意转换类型
 *  */
public class TypeCastDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义两个变量
	int a=10;
	byte b=20;
	int c=a+b;
	System.out.println(c);
	
	//byte d=a+b;
	byte d=(byte)(a+b);
	System.out.println(d);
	}

}
