package com.lianxi.day09_Array;

/*
 * 静态初始化的格式：
 * 		数据类型[]  数组名 =new 数据类型[]{元素1,元素2,元素3,...}
 * 举例：
 * 		int[] arr=new int[]{1,2,3};
 * 简化格式：
 * 		数据类型[] 数组名={元素1,元素2,元素3,...};
 * 		int[] arr={1,2,3};
 * */
public class ArrayDemo01 {
		public static void main(String[] args) {
		//定义数组
			int[] arr={1,2,3};
		//输出数组名和元素
			System.out.println(arr);
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
		}

}
