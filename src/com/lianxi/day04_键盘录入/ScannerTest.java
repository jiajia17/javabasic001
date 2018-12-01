package com.lianxi.day04_键盘录入;

import java.util.Scanner;

/*
 * 键盘录入两个数据，比较这两个数据是否相等
 * */
public class ScannerTest {
	public static void main(String[] args) {
		
	//创建键盘录入对象
	Scanner sc=new Scanner(System.in);
	
	//接收数据
	System.out.println("请输入第一个数据：");
	int a=sc.nextInt();
	
	System.out.println("请输入第二个数据：");
	int b=sc.nextInt();
	
	//比较这两个数据是否相等
	boolean flag=(a==b)?true:false;
	
	System.out.println("flag:"+flag);

}
}
