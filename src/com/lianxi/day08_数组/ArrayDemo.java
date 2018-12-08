package com.lianxi.day08_数组;

/*
 * 数组：存储同一种数据类型的多个元素的容器
 * 
 * 定义格式：
 * 		A:数据类型[] 数组名; (推荐的方式)
 * 		B:数据类型 数组名[];
 * 	举例：
 * 		int[] arr;定义了一个int类型的数组，数组名是arr；
 * 		int arr[]; 定义了一个int类型的变量，变量名是arr数组；
 * 
 * 数组初始化：
 * 		A:所谓的初始化，就是为数组开辟内存空间，并为数组中的每个元素赋予初值
 * 		B:两种方式实现
 * 			a:动态初始化  只给出长度，由系统给出初始化值
 * 			b:静态初始化	给出初始值，由系统决定长度
 * 动态初始化：
 * 		数据类型[] 数组名=new 数据类型[数组长度]；
 * */
public class ArrayDemo {
	public static void main(String[] args) {
		//数据类型[] 数组名=new 数据类型[数组长度]
		int[] arr=new int[3];
		/*
		 * Right:
		 * 		new  为数组申请内存分配，开辟空间
		 * 		int  说明数组中的元素类型是int类型
		 * 		[]  说明这是一个数组
		 * 		3:  数组的长度，其实就是数组中的元素个数
		 * */
		
		//输出数组名
		System.out.println("arr:"+arr);//[I@15db9742  数组的地址值
		//	获取数组的地址值是没有意义的  需要的是数组中的元素值，应该怎么办
		//其实数组中的每个元素都有编号 0---数组的长度-1  
		//访问格式： 数组名[索引]
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	}
}
