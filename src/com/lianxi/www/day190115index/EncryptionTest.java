package com.lianxi.www.day190115index;

import java.util.Scanner;

/*
 * 需求：键盘录入数据,要求数据是四位的整数,现需要对数据进行加密,加密规则如下:
 * 每位数字都加上5,然后除以10的余数代替该数字,
 * 再将第一位和第四位交换,第二位和第三位交换,
 * 请把加密后的数据输出到控制台
 * 
 * 分析：
 * 		A:键盘录入一个四位数
 * 		B:对数据进行加密
 * 			举例：
 * 				4567
 * 				把这个四位数分成个，十，百，千存储到数组中
 * 				int[] arr = {4,5,6,7};
 * 				每位数字都加上5：
 * 					arr[x] += 5;	{9,10,11,12}
 * 				然后除以10的余数代替该数字：
 * 					arr[x] %= 10;	{9,0,1,2}
 * 				 再将第一位和第四位交换,第二位和第三位交换：
 * 					{9,0,1,2}		{2,1,0,9}
 * 		C:输出加密后的数据
 */
public class EncryptionTest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("请输入一个四位整数：");
		int number=scanner.nextInt();
		
		int ge=number%10;
		int shi=number/10%10;
		int bai=number/10/10%10;
		int qian=number/10/10/10%10;
		
		int[] arr={ge,shi,bai,qian};
		
		for(int x=0;x<arr.length;x++){
			arr[x] +=5;
			arr[x] %=10;
			
		}
		int temp=arr[0];
		arr[0]=arr[3];
		arr[3]=temp;
		
		int temp2=arr[1];
		arr[1]=arr[2];
		arr[2]=temp2;
		
		
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[x]);
		}
		System.out.println();
	}
	
}
