package com.lianxi.day04_����¼��;

import java.util.Scanner;
/*
 * Ϊ����߳���������
 * ���ʵ�ּ���¼�������أ�Ŀǰֻ��ʹ��JDK�ṩ����Scanner
 * ʹ�ò��裺
 * 		A������
 * 			import java.util.Scanner;
 * 			��һ������˳��package>import>class
 * 		B:��������¼�����
 * 			Scanner sc=new Scanner(System.in);
 * 		C:��������
 * 			int i=sc.nextInt();
 *  */
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("������һ�����ݣ�");
		int i=sc.nextInt();
		
		System.out.println("i:"+i);
		
		
	}

}
