package com.lianxi.day09_Array;
/*
 * 数组遍历（依次输出数组中的每一个元素）
 * */
public class ArrayTest01 {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr={11,22,33,44,55};
		
		//通过for循环实现获取数据0-4
		for(int x=0;x<=4;x++){
			System.out.println(arr[x]);
		}
		
		System.out.println("---------------");
		//为解决我们去数组中数元素的个数，数组就提供了一个属性：length
		//用于获取数组元素个数
		//格式：数组名.length
		System.out.println("数组共有"+arr.length+"个");
		System.out.println("___________");
		for(int y=0;y<=arr.length-1;y++){
			System.out.println(arr[y]);
		}
	}

}
