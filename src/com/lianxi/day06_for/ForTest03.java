package com.lianxi.day06_for;

public class ForTest03 {
	public static void main(String[] args) {
		//定义统计变量，初始化值是0
		int count=0;
		//获取三位数用for循环实现
		for(int x=100; x<1000;x++){
			//获取个位十位百位
			int ge=x%10;
			int shi=x/10%10;
			int bai=x/10/10%10;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==x){
				count++;
			}
		}
		//输出统计变量
		System.out.println("count:"+count);
	}
	

}
