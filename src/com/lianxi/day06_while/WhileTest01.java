package com.lianxi.day06_while;

/*
 * whileѭ��������ʽ��
 * 		while���ж�������䣩{
 * 			ѭ������䣻
 * 		}
 * ��չ��ʽ��
 * 		��ʼ����䣻
 * 		while���ж�������䣩{
 * 		ѭ������䣻
 * 		����������䣻
 * 		}
 * �ع�forѭ����ʽ��
 *  	for����ʼ������ж�������䣻����������䣩{
 *  	ѭ������䣻
 *  	}
 *  */
public class WhileTest01 {
	public static void main(String[] args) {
		int sum=0;
		for(int x=1;x<=10;x++){
			sum +=x;
		}
		System.out.println("sum:"+sum);
		
		
		
		
		int s=0;
		int y=1;
		
		while(y<=10){
			s +=y;
			y++;
		}
		System.out.println("s:"+s);
	}

}
