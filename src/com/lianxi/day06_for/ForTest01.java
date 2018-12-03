package com.lianxi.day06_for;

/*
 * 求1-100之间偶数和
 * 
 * 分析：
 * 	 1.定义求和变量，初始化的值是0
 *   2.获取1-100的数据，用for循环实现
 *   3.拿到每一个数据先进行判断是否是偶数
 *   4.输出求和变量*/
public class ForTest01 {
	public static void main(String[] args) {
		//
		int sum=0;
		for(int a=1;a<=100;a++){
			if(a%2==0){
				sum +=a;
			}
			
		}
		System.out.println("sum:"+sum);
	}

}
