package com.lianxi.day03_�����;
/*
 * �߼���������������ӹ�ϵ���ʽ
 * &  |  ^  ! 
 * &&  ||
 * &  ��false ��false
 * |	��true ��true
 * ^	��ͬ�tfalse ��ͬ�ttrue �e������H�P�S����Ů��
 * !	true �tfalse    false �ttrue
 * */
public class OperatorDemo03 {
public static void main(String[] args) {
	//�������
	int a=3;
	int b=4;
	int c=5;
	
	//&
	System.out.println((a>b) & (a>c));//false&false
	System.out.println((a<b) & (a>c));//true&false
	System.out.println((a>b) & (a<c));//false & true
	System.out.println((a<b) & (a<c));//true &true
	System.out.println("---------");
	
	//|
	System.out.println((a>b) | (a>c));//false&false
	System.out.println((a<b) | (a>c));//true&false
	System.out.println((a>b) | (a<c));//false & true
	System.out.println((a<b) | (a<c));//true &true
	System.out.println("---------");
		
	//^
	System.out.println((a>b) ^ (a>c));//false&false
	System.out.println((a<b) ^ (a>c));//true&false
	System.out.println((a>b) ^ (a<c));//false & true
	System.out.println((a<b) ^ (a<c));//true &true
	System.out.println("---------");
}
}
