package com.lianxi.day03_运算符;
/*
 * && 和 & 結果一樣
 * || 和 | 結果一樣
 * &&和&的区别：
 * 		&&有短路效果，左边为false，右边不执行
 * 		& 左边无论是什么，右边都会执行
 *  ||和|的区别：
 * 		||有短路效果，左边为true，右边不执行
 * 		| 左边无论是什么，右边都会执行
 * */
public class OperatorDemo04 {
	public static void main(String[] args) {
		//定义变量
		int a=3;
		int b=4;
		int c=5;
		
		//&&
		System.out.println((a>b) && (a>c));//false&false
		System.out.println((a<b) && (a>c));//true&false
		System.out.println((a>b) && (a<c));//false & true
		System.out.println((a<b) && (a<c));//true &true
		System.out.println("---------");
		
		//||
		System.out.println((a>b) || (a>c));//false&false
		System.out.println((a<b) || (a>c));//true&false
		System.out.println((a>b) || (a<c));//false & true
		System.out.println((a<b) || (a<c));//true &true
		System.out.println("---------");
		
		int x=10;
		int y=20;
		//System.out.println((x++ >10) &(y++ >20));//false &false
		System.out.println((x++ >10) && (y++ >20));
		System.out.println("x:"+x);
		System.out.println("y:"+y);

}
}