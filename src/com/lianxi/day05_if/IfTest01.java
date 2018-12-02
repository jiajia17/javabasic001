package com.lianxi.day05_if;

import java.util.Scanner;

/*
 * 键盘录入两个数据，获取这个两个数据的最大值
 * 
 * 分析：
 * 		A：看到键盘导入，我们就应该想到键盘录入的三个步骤
 * 			导包，创建键盘录入对象，接收数据
 * 		B：获取这两个数据的最大值，其实就是比较看哪个数据大
 * 		C：把大的结果输出即可
 * 
 * 导包：
 * 		A 手动导包
 * 		B 点击鼠标自动生成
 * 		C 快捷键（推荐）
 * 			ctrl+shift+o
 * */
public class IfTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建键盘录入对象
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("请输入第一个数据：");
		int a=scanner.nextInt();
		System.out.println("请输入第二个数据：");
		int b =scanner.nextInt();
		
//		if (a>b) {
//			System.out.println("最大值是"+a);
//		} else {
//			System.out.println("最大值是"+b);
//		}
		int max;
		if (a>b) {
			max=a;
		} else {
			max=b;
		}
		//max +=100;
		System.out.println("最大值是"+max);
	}

}
