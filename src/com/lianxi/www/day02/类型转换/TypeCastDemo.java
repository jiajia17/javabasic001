package com.lianxi.www.day02.����ת��;

public class TypeCastDemo {
	/*
	 *  +:����һ����������������ӷ������
	 *  �������������ʱ��һ��Ҫ�������������ݵ����ͱ���һ��
	 *  
	 *  ����ת����
	 *    ��ʽת��
	 *    ǿ��ת��
	 *    
	 *    ��ʽת����
	 *      byte,short,char --int -- long -- float -- double
	 *      */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������������
		int a =3;
		int b =4;
		int c=a+b;
		System.out.println(c);
		
		//����һ��byte ���͵ı�����һ��int���͵ı���
		byte bb=3;
		int cc=5;
		System.out.println(bb+cc);
		
		//����ֱ������������ǿ��Եģ�˵������ҲӦ�ÿ��Խ����������
		//����Ҫ�������������ݵ�����һ�£������ڲ�һ�£�����Ӧ����ʲô���ͽ�����
		//byte dd=bb+cc;//������ʧ����
		//System.out.println(dd);
		int ee=bb+cc;
		System.out.println(ee);

	}

}
