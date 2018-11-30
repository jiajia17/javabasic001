package com.lianxi.day03_运算符;
/*
 * 逻辑运算符：用于连接关系表达式
 * &  |  ^  ! 
 * &&  ||
 * &  有false 则false
 * |	有true 则true
 * ^	相同則false 不同則true 舉例：情侶關係（男女）
 * !	true 則false    false 則true
 * */
public class OperatorDemo03 {
public static void main(String[] args) {
	//定义变量
	int a=3;
	int b=4;
	int c=5;
	
	//&
	System.out.println((a>b) & (a>c));//false&false
	System.out.println((a<b) & (a>c));//true&false
	System.out.println((a>b) & (a<c));//false & true
	System.out.println((a<b) & (a<c));//true &true
	System.out.println("---------");
	
	//|
	System.out.println((a>b) | (a>c));//false&false
	System.out.println((a<b) | (a>c));//true&false
	System.out.println((a>b) | (a<c));//false & true
	System.out.println((a<b) | (a<c));//true &true
	System.out.println("---------");
		
	//^
	System.out.println((a>b) ^ (a>c));//false&false
	System.out.println((a<b) ^ (a>c));//true&false
	System.out.println((a>b) ^ (a<c));//false & true
	System.out.println((a<b) ^ (a<c));//true &true
	System.out.println("---------");
}
}
