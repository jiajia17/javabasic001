package com.lianxi.day06_while;

/*
 * do...while循环的语句格式：
 * 		do{
 * 			循环语句；
 * 		}while（判断条件语句）；
 * 扩展格式：
 * 		初始化语句；
 * 		do{
 * 			循环体语句；
 * 			控制条件语句；
 * 	    }while(判断条件语句)；
 * 
 * 执行流程：
 * 		1.执行初始化语句
 * 		2.执行循环体语句
 * 		3.执行控制条件语句
 * 		4.执行判断条件语句，看是true还是false
 * 		如果是false，就结束循环
 * 		如果是true，回到B继续
 * */
public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//在控制台输出10次HelloWorld
		for(int x=1;x<=10;x++){
			System.out.println("Hello World");
		}
		System.out.println("----------");
		
		int x=1;
		do{
			System.out.println("Hello World");
			x++;
		}while(x<=10);

	}

}
