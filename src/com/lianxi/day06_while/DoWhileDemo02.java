package com.lianxi.day06_while;

import javax.security.auth.x500.X500Principal;

/*
 * ��Ȼ����ѭ����������ͬ�����飬�������ǻ���������ģ�
 * 	A��do...whileѭ������ִ��һ��ѭ����
 * 	B:for��whileѭ�������ж����������ſ���ִ��ѭ��
 * 
 * for while����
 * 	for ѭ�������󣬳�ʼ���ı����Ͳ��ܱ�ʹ���ˡ�
 * ��whileѭ�������󣬳�ʼ���ı��������Լ���ʹ��
 * 
 * �Ƽ�ʹ�õ�˳��
 * for----while----do...while
 * */
public class DoWhileDemo02 {
	public static void main(String[] args) {
	/*	int x=3;
		while(x<3){
			System.out.println("Java");
			x++;
		}
		System.out.println("-----------------");
		
		int y=3;
		do{
			System.out.println("Java");
			y++;
		}while(y<3);
		*/
		//for��while������
		for(int x=1;x<=10;x++){
			System.out.println("Java");
		}
		//System.out.println("x:"+x);
		System.out.println("-----------");
		
		int y=1;
		while(y<=10){
			System.out.println("Java");
			y++;
		}
		System.out.println("y:"+y);
	}

}
