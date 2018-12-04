package com.lianxi.day07_break;

/*
 * break:中断的意思
 * 
 * 使用场景：
 * 	1.switch语句中
 * 	2.循环中
 * 
 * 注意：
 * 		离开使用场景是没有意义的
 * 作业：
 * 	用于结束循环
 * 
 * continue：继续的意思
 * 使用场景： 
 * 		循环中
 * 注意：
 * 		离开使用场景是没有意义的
 * 作用：
 * 		结束一次循环，继续下一次的循环
 * */
public class BreakDemo {
	public static void main(String[] args) {
		//离开使用场景是没有意义的
		//break;
		//continue;
		for(int x=1;x<=10;x++){
			if(x==3){
				//break;
				continue;
				}
			System.out.println("HelloWorld");
			}
		}

}
