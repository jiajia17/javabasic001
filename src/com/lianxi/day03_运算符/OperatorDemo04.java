package com.lianxi.day03_�����;
/*
 * && �� & �Y��һ��
 * || �� | �Y��һ��
 * &&��&������
 * 		&&�ж�·Ч�������Ϊfalse���ұ߲�ִ��
 * 		& ���������ʲô���ұ߶���ִ��
 *  ||��|������
 * 		||�ж�·Ч�������Ϊtrue���ұ߲�ִ��
 * 		| ���������ʲô���ұ߶���ִ��
 * */
public class OperatorDemo04 {
	public static void main(String[] args) {
		//�������
		int a=3;
		int b=4;
		int c=5;
		
		//&&
		System.out.println((a>b) && (a>c));//false&false
		System.out.println((a<b) && (a>c));//true&false
		System.out.println((a>b) && (a<c));//false & true
		System.out.println((a<b) && (a<c));//true &true
		System.out.println("---------");
		
		//||
		System.out.println((a>b) || (a>c));//false&false
		System.out.println((a<b) || (a>c));//true&false
		System.out.println((a>b) || (a<c));//false & true
		System.out.println((a<b) || (a<c));//true &true
		System.out.println("---------");
		
		int x=10;
		int y=20;
		//System.out.println((x++ >10) &(y++ >20));//false &false
		System.out.println((x++ >10) && (y++ >20));
		System.out.println("x:"+x);
		System.out.println("y:"+y);

}
}