package com.lianxi.day09_Array;
/*
 * 两个常见小问题：
 * 		ArrayIndexOutOfBoundsException:数组索引越界异常
 * 		产生的原因：访问了不存在的索引
 * 	
 * 		NullPointerException:空指针异常
 * 		产生的原因：数组已经不在指向堆内存的数据了，你还使用数组名去访问元素
 * */
public class ArrayDemo02 {
	public static void main(String[] args) {
		//定义数组
		int[] arr={1,2,3};
		//访问数组元素
		//System.out.println(arr[3]);//java.lang.ArrayIndexOutOfBoundsException
		
		//引用类型：类，接口，数组
		//常量：空常量，null,是可以赋值给引用类型的
		arr=null;
		System.out.println(arr[1]);//java.lang.NullPointerException
	}

}
