package com.lianxi.day06_for;

/*
 * ��1-100֮��ż����
 * 
 * ������
 * 	 1.������ͱ�������ʼ����ֵ��0
 *   2.��ȡ1-100�����ݣ���forѭ��ʵ��
 *   3.�õ�ÿһ�������Ƚ����ж��Ƿ���ż��
 *   4.�����ͱ���*/
public class ForTest01 {
	public static void main(String[] args) {
		//
		int sum=0;
		for(int a=1;a<=100;a++){
			if(a%2==0){
				sum +=a;
			}
			
		}
		System.out.println("sum:"+sum);
	}

}
