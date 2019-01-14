package com.lianxi.day03_运算符;

/*
 * 获取三个整数中的最大值
 * */
public class OperatorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义三个变量
		int a=10;
		int b=30;
		int c=20;
		
		//先获取两个数据的最大值，然后再和第三个数据比较
		int temp=(a>b)?a:b;
		int max=(temp>c)?temp:c;
		System.out.println("max:"+max);
	}

}
