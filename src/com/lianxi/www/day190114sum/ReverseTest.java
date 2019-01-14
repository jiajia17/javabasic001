package com.lianxi.www.day190114sum;

import java.util.Scanner;

/*
 * 需求：
 * (1)键盘录入5个int类型的数据存储数组arr中
 * (2)定义方法将arr数组中的内容反转
 * (3)定义方法对反转后的数组进行遍历
 * 
 * 分析：
 * 		A:定义一个长度为5的数组
 * 		B:通过键盘录入数据给数组中的元素赋值
 * 		C:定义方法将arr数组中的内容反转
 * 			什么是反转?如何反转?
 * 		D:定义方法遍历数组
 */
public class ReverseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5];
		Scanner scanner=new Scanner(System.in);
		for(int x=0;x<arr.length;x++){
			System.out.println("请输入第"+(x+1)+"个元素");
			arr[x]=scanner.nextInt();
			
		}
		System.out.println("反转前的数组元素：");
		printArray(arr);
		
		reverse(arr);
		
		
		System.out.println("反转后的数组元素：");
		
		printArray(arr);
		
	}
	public static void printArray(int[] arr){
		System.out.println("[");
		for(int x=0;x<arr.length;x++){
			if(x==arr.length-1){
				System.out.println("]");
			}else{
				System.out.println(arr[x]+",");
			}
		}
	}
	public static void reverse(int[] arr){
		for(int startIndex=0,endIndex=arr.length-1;startIndex<=endIndex;startIndex++,endIndex--){
			int temp=arr[startIndex];
			arr[startIndex]=arr[endIndex];
			arr[endIndex]=temp;
			
		}
	}

}
