package com.lianxi.day08;

import java.nio.channels.NonWritableChannelException;
import java.time.Year;
import java.util.Random;

/*
 * Random�����ڲ��������
 * 
 * ʹ�ò��裺
 * 	A:����
 * 		import java.util.Random;
 * 	B:��������
 * 		Random r= new Random();
 * 	C:��ȡ�����
 * 		int number=r.nextInt(10);
 * 		��ȡ���ݵķ�Χ����0,10�� ����0��������10
 * */
public class RandomDemo {
	public static void main(String[] args) {
		//��������
		Random r= new Random();
		for(int i=1;i<=10;i++){
			//��ȡ�����
			int number=r.nextInt(10);
			System.out.println("number:"+number);
		}
		//��� ��ȡ1-100֮���������أ�
		for(int a=1;a<=100;a++){
			//int y=r.nextInt(100);//0-99
			int y=r.nextInt(100)+1;
			System.out.println("y:"+y);
		}
		
	}

}
