package com.lianxi.day03_�����;

/*
 * ��ȡ���������е����ֵ
 * */
public class OperatorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������������
		int a=10;
		int b=30;
		int c=20;
		
		//�Ȼ�ȡ�������ݵ����ֵ��Ȼ���ٺ͵��������ݱȽ�
		int temp=(a>b)?a:b;
		int max=(temp>c)?temp:c;
		System.out.println("max:"+max);
	}

}
