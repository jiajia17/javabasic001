package com.lianxi.day05_if;

import java.util.Scanner;

/*
 * ����¼���������ݣ���ȡ����������ݵ����ֵ
 * 
 * ������
 * 		A���������̵��룬���Ǿ�Ӧ���뵽����¼�����������
 * 			��������������¼����󣬽�������
 * 		B����ȡ���������ݵ����ֵ����ʵ���ǱȽϿ��ĸ����ݴ�
 * 		C���Ѵ�Ľ���������
 * 
 * ������
 * 		A �ֶ�����
 * 		B �������Զ�����
 * 		C ��ݼ����Ƽ���
 * 			ctrl+shift+o
 * */
public class IfTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������¼�����
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("�������һ�����ݣ�");
		int a=scanner.nextInt();
		System.out.println("������ڶ������ݣ�");
		int b =scanner.nextInt();
		
//		if (a>b) {
//			System.out.println("���ֵ��"+a);
//		} else {
//			System.out.println("���ֵ��"+b);
//		}
		int max;
		if (a>b) {
			max=a;
		} else {
			max=b;
		}
		//max +=100;
		System.out.println("���ֵ��"+max);
	}

}
