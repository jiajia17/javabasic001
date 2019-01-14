package com.lianxi.www.day190113四季;

import java.util.Scanner;

public class SeasonTest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("请输入一个月份（1-12）：");
		
		int month=scanner.nextInt();
		
		if(month==3 || month==4 || month==5){
			System.out.println(month+"月是春季");
		}else if (month==6|| month==7||month==8) {
			System.out.println(month+"月是夏季");
		}else if (month==9|| month==10||month==11) {
			System.out.println(month+"月是秋季");
		}else if (month==12|| month==1||month==2) {
			System.out.println(month+"月是冬季");
		}else {
			System.out.println("输入数据有误");
			
		}
	}

}
