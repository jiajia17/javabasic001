package com.lianxi.day09_Array;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
	//	System.out.println(Arrays.toString(arr));
		while(true){
		System.out.println("请选择操作 1存储数据   2最大值   3猜数字 4退出");
		int key=scanner.nextInt();
		switch (key) {
	case 1:
		fun1();
		break;
	case 2:
		if(arr==null){
			System.out.println("sorry,还没有值，请先存储");
			fun1();
			break;
		}
		fun2();
		break;
	case 3:
		if(arr==null){
			System.out.println("sorry,还没有值，请先存储");
			fun1();
			break;
		}
		fun3();
		break;
	case 4:
		return;

	default:System.out.println("输入数不合法");
		break;
	}
	}
		
	}
	static Scanner scanner=new Scanner(System.in);
	static int[] arr;
	public static void fun1(){
		System.out.println("请告诉我你要输入几个数据：");
		int a=scanner.nextInt();//a代表数组的长度
		arr=new int[a];
		//System.out.println(arr.length);
		for(int x=0;x<a;x++){
			
			System.out.println("请输入第"+(x+1)+"个数据");
			//a=scanner.nextInt();
		//	arr[x]=a;
			arr[x]=scanner.nextInt();
		}
	}
	
	public static void fun2(){
		int max=arr[0];
		//	int min=arr[0];
			for(int y=1;y<arr.length;y++){
				if(max>arr[y]){
					
				}else{
					max=arr[y];
					//min=arr[y];


				}
			}
			System.out.println("max："+max);
	}
	
	public static void fun3(){
		Random random=new Random();
		int r=random.nextInt(arr.length);
		while(true){
			System.out.println("请猜数：");
			int number=scanner.nextInt();
			
			if (number>arr[r]) {
				System.out.println("大了");
			} else if (number<arr[r]){
				System.out.println("小了");
			}else{
				System.out.println("猜对了");
				break;
			}
		}
	}
	
}
	