package com.lianxi.www.day190108;

import java.util.Scanner;

public class MethodTestCompare {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner scanner=new Scanner(System.in);
		//接收数据
		System.out.println("请输入第一个数据：");
		int x=scanner.nextInt();
		System.out.println("请输入第二个数据：");
		int y=scanner.nextInt();
		
		//调用方法
		boolean b=campare(x,y);
		
		//输出结果
		System.out.println("b:"+b);
		
		/*
		 * 比较两个数是否相等
		 * 两个明确：
		 * 	返回值类型：boolean;
		 * 	参数列表：int a, int b*/
		
		
		}

	private static boolean campare(int x, int y) {
		// TODO Auto-generated method stub
		
		if(x==y){
			return true;
		}else{
			return false;
		}
	}

}
