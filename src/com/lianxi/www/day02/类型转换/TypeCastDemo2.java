package com.lianxi.www.day02.����ת��;
/*
 * ǿ��ת����
 *  Ŀ������  ������ =��Ŀ�����ͣ�����ת�������ݣ���
 *  ���飺���������㣬���Ӧ����ʲô���ͣ�����ʲô���ͽ��գ���Ҫ����ת������
 *  */
public class TypeCastDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������������
	int a=10;
	byte b=20;
	int c=a+b;
	System.out.println(c);
	
	//byte d=a+b;
	byte d=(byte)(a+b);
	System.out.println(d);
	}

}
