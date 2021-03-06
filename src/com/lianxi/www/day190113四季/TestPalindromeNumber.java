package com.lianxi.www.day190113四季;

/*
 * 需求：打印5位数中的所有回文数。
 * 		什么是回文数呢?举例：12321是回文数，个位与万位相同，十位与千位相同。
 * 
 * 分析：
 * 		A:5位数告诉了我们数据的范围，用for循环实现
 * 		B:获取每一个5位数，然后得到它的个位，十位，千位，万位
 * 			假设x是一个5位数：
 * 				个位：x%10
 * 				十位：x/10%10
 * 				千位：x/10/10/10%10
 * 				万位：x/10/10/10/10%10
 * 		C:把满足条件的数据输出即可
 */ 
public class TestPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=10000; x<100000; x++){
			int ge=x%10;
			int shi=x/10%10;
			int qian=x/10/10/10%10;
			int wan=x/10/10/10/10%10;
			if ((ge==wan) && (shi==qian)) {
				System.out.println(x);
			}
		}
	}

}
