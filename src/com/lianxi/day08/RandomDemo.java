package com.lianxi.day08;

import java.nio.channels.NonWritableChannelException;
import java.time.Year;
import java.util.Random;

/*
 * Random：用于产生随机数
 * 
 * 使用步骤：
 * 	A:导包
 * 		import java.util.Random;
 * 	B:创建对象
 * 		Random r= new Random();
 * 	C:获取随机数
 * 		int number=r.nextInt(10);
 * 		获取数据的范围：【0,10） 包括0，不包括10
 * */
public class RandomDemo {
	public static void main(String[] args) {
		//创建对象
		Random r= new Random();
		for(int i=1;i<=10;i++){
			//获取随机数
			int number=r.nextInt(10);
			System.out.println("number:"+number);
		}
		//如何 获取1-100之间的随机数呢？
		for(int a=1;a<=100;a++){
			//int y=r.nextInt(100);//0-99
			int y=r.nextInt(100)+1;
			System.out.println("y:"+y);
		}
		
	}

}
