package com.lianxi.day06_for;

public class ForTest03 {
	public static void main(String[] args) {
		//����ͳ�Ʊ�������ʼ��ֵ��0
		int count=0;
		//��ȡ��λ����forѭ��ʵ��
		for(int x=100; x<1000;x++){
			//��ȡ��λʮλ��λ
			int ge=x%10;
			int shi=x/10%10;
			int bai=x/10/10%10;
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==x){
				count++;
			}
		}
		//���ͳ�Ʊ���
		System.out.println("count:"+count);
	}
	

}
