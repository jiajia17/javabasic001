package com.lianxi.www.day190114sum;

import java.util.Scanner;

/*
 * 需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 其余4个选手的平均值。
 * 请写代码实现。(不考虑小数部分)
 * 
 * 分析：
 * 		A:定义一个长度为6的数组。
 * 		B:通过键盘录入的方式给出评委的分数
 * 		C:写方法实现获取数组中的最大值，最小值
 * 		D:写方法实现数组元素的求和
 * 		E:平均分： (和-最高分-最低分)/(arr.length-2)
 * 		F:输出分数即可
 */
public class ScoreTest {
	public static void main(String[] args){
		int[] arr=new int[6];
		
		Scanner scanner=new Scanner(System.in);
		for(int x=0;x<arr.length;x++){
			
			System.out.println("請輸入第"+(x+1)+"个评委的分数");
			int score=scanner.nextInt();
			arr[x]=score;
		}
		
		int Max=getMax(arr);
		int Min=getMin(arr);
		int sum= sum(arr);
		
		int avg=(sum-Max-Min)/(arr.length-2);
		
		System.out.println("该选手的最终得分是："+avg);

		}
	public static int sum(int[] arr){
		int sum=0;
		for(int x=0;x<arr.length;x++){
			sum +=arr[x];
		}
		return sum;
	}
	
	public static int getMax(int[] arr){
		int max=arr[0];
		
		for(int x=1;x<arr.length;x++){
			if(arr[x]>max){
				max=arr[x];
			}
		}
		return max;
	}
	
	public static int getMin(int[] arr){
		int min=arr[0];
		
		for(int x=1;x<arr.length;x++){
			if(arr[x]>min){
				min=arr[x];
			}
		}
		return min;
	}
}
