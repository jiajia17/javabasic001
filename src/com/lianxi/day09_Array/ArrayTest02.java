package com.lianxi.day09_Array;
/*
 * 数组获取最值（最大值 最小值）
 * */
public class ArrayTest02 {
	public static void main(String[] args) {
		//定义数组
		int[] arr={12,45,98,73,60};
		
		//定义参照物
		int max=arr[0];
		
		//遍历数组，获取除了0索引以外的元素，进行比较
		for(int x=1;x<=arr.length-1;x++){
			if(arr[x]>max){
				max=arr[x];
			}
		}
		System.out.println("max:"+max);
	}
}
