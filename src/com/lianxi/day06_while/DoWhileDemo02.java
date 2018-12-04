package com.lianxi.day06_while;

import javax.security.auth.x500.X500Principal;

/*
 * 虽然三种循环可以做相同的事情，但是它们还是有区别的；
 * 	A：do...while循环至少执行一次循环体
 * 	B:for和while循环必须判断条件成立才可以执行循环
 * 
 * for while区别
 * 	for 循环结束后，初始化的变量就不能被使用了。
 * 而while循环结束后，初始化的变量还可以继续使用
 * 
 * 推荐使用的顺序：
 * for----while----do...while
 * */
public class DoWhileDemo02 {
	public static void main(String[] args) {
	/*	int x=3;
		while(x<3){
			System.out.println("Java");
			x++;
		}
		System.out.println("-----------------");
		
		int y=3;
		do{
			System.out.println("Java");
			y++;
		}while(y<3);
		*/
		//for和while的区别
		for(int x=1;x<=10;x++){
			System.out.println("Java");
		}
		//System.out.println("x:"+x);
		System.out.println("-----------");
		
		int y=1;
		while(y<=10){
			System.out.println("Java");
			y++;
		}
		System.out.println("y:"+y);
	}

}
