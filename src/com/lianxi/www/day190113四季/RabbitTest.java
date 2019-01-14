package com.lianxi.www.day190113四季;

import com.mysql.fabric.xmlrpc.base.Array;

/*
 * 需求：
 * 		有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 		假如兔子都不死，问第二十个月的兔子对数为多少？ 
 * 
 * 规律：
 * 		第一个月：1
 * 		第二个月：1
 * 		第三个月：2
 * 		第四个月：3
 * 		第五个月：5
 * 		...
 * 
 * 		规律：从第三个月开始，每个月的兔子对数是前两个月的兔子对数之和。
 * 			第一个月和第二个月的兔子对数是1
 * 分析：
 * 		int[] arr = new int[20];
 * 
 * 		arr[0] = 1;
 * 		arr[1] = 1;
 * 
 * 		arr[2] = arr[0] + arr[1];
 * 		arr[3] = arr[1] + arr[2];
 * 		arr[4] = arr[2] + arr[3];
 * 		...
 */

public class RabbitTest {
	public static void main(String[] args){
		int[] arr=new int[20];
		arr[0]=1;
		arr[1]=1;
		
		for(int x=2;x<arr.length;x++){
			arr[x]=arr[x-2]+arr[x-1];
		}
		System.out.println("第20个月的兔子对数是"+arr[19]);
	}
}
