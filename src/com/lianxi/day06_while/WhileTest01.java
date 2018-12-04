package com.lianxi.day06_while;

/*
 * while循环的语句格式：
 * 		while（判断条件语句）{
 * 			循环体语句；
 * 		}
 * 扩展格式：
 * 		初始化语句；
 * 		while（判断条件语句）{
 * 		循环体语句；
 * 		控制条件语句；
 * 		}
 * 回顾for循环格式：
 *  	for（初始化语句判断条件语句；控制条件语句）{
 *  	循环体语句；
 *  	}
 *  */
public class WhileTest01 {
	public static void main(String[] args) {
		int sum=0;
		for(int x=1;x<=10;x++){
			sum +=x;
		}
		System.out.println("sum:"+sum);
		
		
		
		
		int s=0;
		int y=1;
		
		while(y<=10){
			s +=y;
			y++;
		}
		System.out.println("s:"+s);
	}

}
