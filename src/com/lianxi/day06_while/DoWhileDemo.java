package com.lianxi.day06_while;

/*
 * do...whileѭ��������ʽ��
 * 		do{
 * 			ѭ����䣻
 * 		}while���ж�������䣩��
 * ��չ��ʽ��
 * 		��ʼ����䣻
 * 		do{
 * 			ѭ������䣻
 * 			����������䣻
 * 	    }while(�ж��������)��
 * 
 * ִ�����̣�
 * 		1.ִ�г�ʼ�����
 * 		2.ִ��ѭ�������
 * 		3.ִ�п����������
 * 		4.ִ���ж�������䣬����true����false
 * 		�����false���ͽ���ѭ��
 * 		�����true���ص�B����
 * */
public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڿ���̨���10��HelloWorld
		for(int x=1;x<=10;x++){
			System.out.println("Hello World");
		}
		System.out.println("----------");
		
		int x=1;
		do{
			System.out.println("Hello World");
			x++;
		}while(x<=10);

	}

}
