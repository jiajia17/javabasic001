package com.lianxi.www.day02.类型转换;

public class TypeCastDemo {
	/*
	 *  +:这是一个运算符，用于做加法运算的
	 *  我们在做运算的时候，一般要求参与运算的数据的类型必须一致
	 *  
	 *  类型转换：
	 *    隐式转换
	 *    强制转换
	 *    
	 *    隐式转换：
	 *      byte,short,char --int -- long -- float -- double
	 *      */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义两个变量
		int a =3;
		int b =4;
		int c=a+b;
		System.out.println(c);
		
		//定义一个byte 类型的变量，一个int类型的变量
		byte bb=3;
		int cc=5;
		System.out.println(bb+cc);
		
		//我们直接输出这个结果是可以的，说明我们也应该可以接收这个数据
		//我们要求参与运算的数据的类型一致，而现在不一致，我们应该用什么类型接收呢
		//byte dd=bb+cc;//可能损失精度
		//System.out.println(dd);
		int ee=bb+cc;
		System.out.println(ee);

	}

}
