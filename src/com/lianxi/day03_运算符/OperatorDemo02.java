package com.lianxi.day03_�����;

/*
 * 	��ϵ�������
 * 		==,!=,>,>=,<,<=
 * 		��ϵ������Ľ����boolean����
 * ע�����
 * 		ǧ��Ҫ��==д��=
 * */
public class OperatorDemo02 {
	public static void main(String[] args) {
		//�������
		int a=10;
		int b=20;
		int c=10;
		
		//==
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println("---------");
		
		//��=
		System.out.println(a != b);
		System.out.println(a != c);
		System.out.println("---------");
		
		System.out.println(a <= b);
		System.out.println(a <= c);
		System.out.println("---------");
		
		System.out.println(a >= b);
		System.out.println(a >= c);
		System.out.println("---------");
		
		//ע�����
		System.out.println(a == b);
		System.out.println(a = b);//��b��ֵ��ֵ��a��Ȼ���a��ֵ���
		
	}
}
