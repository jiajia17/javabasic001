package com.lianxi.day08_数组;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr=new int[3];
		
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//然后定义第二个数组的时候把第一个数组的地址赋值给第二个数组
		int[] arr2=arr;
		
		//再次输出两个数组的名及元素
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
	}

}
