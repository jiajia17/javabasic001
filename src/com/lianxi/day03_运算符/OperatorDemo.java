package com.lianxi.day03_�����;
/*
 * ��������������ڶԳ����ͱ������в����ķ���
 * 
 * ���ʽ������������������ķ���java�﷨��ʽ�ӡ���ͬ����������ӵı��ʽ�ǲ�ͬ�ı��ʽ��
 * ������a��b
 * 		a+b
 * 
 * ���������
 *  	���������  +��-,*,/,%(���ڻ�ȡ�����������ʱ�������),++,--
 *  	��ֵ������� ������ֵ����=�� ��չ�ĸ�ֵ�������+=��-=,*=,/=...  
 *  	��ϵ�����
 *  	�߼������
 *  	��Ԫ�����
 *  +  ���ӷ�����
 *  �ַ�����ӷ����㣬��ʵ�����ַ��ڼ�����д洢������ֵ�����������
 *  	'A'  65
 *  	'a'  94
 *  	'0'  48
 *  �ַ�������ӷ����㣬�����ַ�����ƴ��
 *  
 *  ++�ں��棬���ñ�����������Ȼ�������++
 *  ++��ǰ�棬�ȱ���++��Ȼ�����ñ���������
 *  */
public class OperatorDemo {
	public static void main(String[] args) {
		//�������
		int a=3;   //��3��ֵ��int���͵ı���a
		int b=4;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
	//	System.out.println(a/b);
		
		//�������ֻ�ܵõ�������Ҫ��õ�С�����ͱ����и�������������
		System.out.println(3.0/4);
		System.out.println(3/4.0);
		
		System.out.println(b/a);
		System.out.println(b%a);
		
		//�ַ�����ӷ�����
		char c='A';
		System.out.println(a+c);
		
		//�ַ�������ӷ�����
		System.out.println("hello"+a);
		System.out.println("Hello"+a+b);
		System.out.println(a+b+"Hello");
		int d=++a;
		System.out.println("a��"+a);
		System.out.println("d:"+d);
		
		
		//+=  ��+=����ߺ��ұߵ�������+��Ȼ��ѽ����ֵ�����
		a+=20;
		System.out.println("a:"+a);
		
		//ע�⣺��չ�ĸ�ֵ�������������ǿ������ת��
		//��һ������a,a+=10
		//�൱�ڣ�a=��a���������ͣ���a+10��
		short s=1;
		s +=1;
		System.out.println(s);
	}

}
