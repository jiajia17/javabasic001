package com.lianxi.day04_键盘录入;

import java.util.Scanner;
/*
 * 为了提高程序的灵活性
 * 如何实现键盘录入数据呢？目前只能使用JDK提供的类Scanner
 * 使用步骤：
 * 		A：导包
 * 			import java.util.Scanner;
 * 			在一个类中顺序：package>import>class
 * 		B:创建键盘录入对象
 * 			Scanner sc=new Scanner(System.in);
 * 		C:接收数据
 * 			int i=sc.nextInt();
 *  */
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("请输入一个数据：");
		int i=sc.nextInt();
		
		System.out.println("i:"+i);
		
		
	}

}
