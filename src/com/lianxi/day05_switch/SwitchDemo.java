package com.lianxi.day05_switch;

import java.util.Scanner;

/*
 * switch(表达式){
 * 		case 值1:
 * 			语句体1;
 * 			break;
 * 		case 值2:
 * 			语句体2;
 * 			break;
 * 		...
 * 		default:
 * 			语句体n+1;
 * 			break;
 * }
 * 格式解释：
 * 		表达式：byte,short,int,char
 * 		JDK5以后可以使枚举
 * 		JDK以后可以是字符串
 * 		case后面的值：就是用来和表达式的值进行匹配的内容
 * 		break：表示中断的意思
 * 		default:所有的值都不匹配的时候执行
 * 执行流程：
 * 		A 首先计算表达式的值
 * 		B 拿着这个计算出的值，依次和case后面的值进行比较，一旦有匹配的就执行相应的语句
 * 		在执行过程中，遇到break就结束
 * 		C如果所有的case都不匹配，就执行语句体n+1
 * */
public class SwitchDemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("请输入一个数字（1-7）");
		int weekday=scanner.nextInt();
		
		switch (weekday) { 
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
			

		default:
			System.out.println("输入有误");
			break;
		}
	}

}
