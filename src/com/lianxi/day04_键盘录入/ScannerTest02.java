package com.lianxi.day04_����¼��;

import java.util.Scanner;

/*
 * ����¼���������ݣ���ȡ�����������е����ֵ
 * */
public class ScannerTest02 {
	
	public static void main(String[] args) {
		
		//��������¼�����
		Scanner sc=new Scanner(System.in);
		
		//��������
		System.out.println("�������һ�����ݣ�");
		int a=sc.nextInt();
		System.out.println("������ڶ������ݣ�");
		int b=sc.nextInt();
		System.out.println("��������������ݣ�");
		int c=sc.nextInt();
		
		int temp=(a>b)?a:b;
		int max=(temp>c)?temp:c;
		System.out.println("max:"+max);
		
		
		
	
	}

}
