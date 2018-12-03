package com.lianxi.day06_for;

/*
 * for 循环语句的格式：
 * 		for（初始化语句；判断条件语句；控制条件语句）{
 *          循环体语句；
 *          }
 *     执行流程：
 *     	A:执行初始化语句；
 *      B:执行判断条件语句，看其结果是true还是false
 *      如果是false，就结束循环
 *      如果是true，就继续执行
 *      C:执行循环体语句
 *      D:执行控制条件语句
 *      E:回到B继续*/
public class ForDemo {
	public static void main(String[] args) {
		for (int a=1;a<=5;a++){
			System.out.println("HelloWorld");
		}
		for(int x=1;x<=5;x++){
			System.out.println("x:"+x);
		}
		for(int y=5;y>=1;y--){
			System.out.println("y:"+y);
		}
		/*
		 * 求出1-5之间的数据之和
		 * 分析：
		 * 1.定义求和变量，初始化的值是0
		 * 2.获取1-5的数据，用for循环实现
		 * 3.把每一次获取到的数据累加到求和变量即可
		 * 4.输出求和变量
		 * */
		
		
		int sum=0;
		for(int b=1;b<=5;b++){
			sum +=b;
		}
		System.out.println("sum:"+sum);
		
	}

}
