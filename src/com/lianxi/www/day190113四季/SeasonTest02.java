package com.lianxi.www.day190113四季;

import java.util.Scanner;

public class SeasonTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("请输入一个月份（1-12）：");
		int month=scanner.nextInt();
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;

		default:
			System.out.println("你输入的月份有误");
			break;
		}
	}

}
