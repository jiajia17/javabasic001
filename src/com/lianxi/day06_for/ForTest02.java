package com.lianxi.day06_for;

/*
 * 在控制台输出所有的“水仙花数”
 * 
 * 例：153=1*1*1+5*5*5+3*3*3
 * 
 * 分析：
 * 	1.三位数其实是告诉了我们水仙花数的范围，用for循环实现
 * 	2.获取一个三位数的个位，十位，百位
 * 		个位：153%10
 * 		十位：153/10%10
 * 		百位：153/10/10%10
 * 	3.拿每个数据的每个位上的数据立方和相加，然后和该数据本身进行比较
 * 	如果相等，就说明该数据是水仙花数，就打印纸控制台
 * 
 * */
public class ForTest02 {
	public static void main(String[] args) {
		for(int x=100;x<1000;x++){
			//获取一个三位数的个十百位
			int ge=x%10;
			int shi=x/10%10;
			int bai=x/10/10%10;
			
			if(x==ge*ge*ge+shi*shi*shi+bai*bai*bai){
				
				System.out.println("x:"+x);
			}
			
		}
	}
}
