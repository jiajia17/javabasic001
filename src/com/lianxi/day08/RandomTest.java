package com.lianxi.day08;

import java.util.Random;
import java.util.Scanner;

/*
 * 猜数字小游戏
 * 		系统产生一个1-100之间的随机数，请猜出这个数据是多少
 * 分析：
 * 		A：系统产生一个1-100之间的随机数
 * 		Random r= new Random();
 * 		int number =r.nextInt(100) +1;
 * 		B:键盘录入我们要猜的数据
 * 		C:比较这个两个数据，用if语句实现
 * 		D:多次猜数据，而我们不知道猜多少次，怎么办呢？
 * 			whlie(true){循环体语句；}
 * */
public class RandomTest {
	public static void main(String[] args) {
		// 系统产生一个1-100之间的随机数
		Random random = new Random();
		int number = random.nextInt(100) + 1;

		// 键盘录入我们要猜的数据
		Scanner scanner = new Scanner(System.in);
		
		//多次猜数据
		while(true){
			// 接收数据
			System.out.println("请输入你要猜的数据（1-100）：");
			int guessnumber = scanner.nextInt();
	
			// 比较这个两个数据，用if语句实现
			if (guessnumber > number) {
				System.out.println("你猜的数据" + guessnumber + "大了");
			} else if (guessnumber < number) {
				System.out.println("你猜的数据" + guessnumber + "小了");
			} else {
				System.out.println("恭喜你，猜中了");
				break;
			}
		}
	}

}
