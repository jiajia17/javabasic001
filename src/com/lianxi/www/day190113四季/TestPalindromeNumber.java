package com.lianxi.www.day190113�ļ�;

/*
 * ���󣺴�ӡ5λ���е����л�������
 * 		ʲô�ǻ�������?������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
 * 
 * ������
 * 		A:5λ���������������ݵķ�Χ����forѭ��ʵ��
 * 		B:��ȡÿһ��5λ����Ȼ��õ����ĸ�λ��ʮλ��ǧλ����λ
 * 			����x��һ��5λ����
 * 				��λ��x%10
 * 				ʮλ��x/10%10
 * 				ǧλ��x/10/10/10%10
 * 				��λ��x/10/10/10/10%10
 * 		C:�����������������������
 */ 
public class TestPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=10000; x<100000; x++){
			int ge=x%10;
			int shi=x/10%10;
			int qian=x/10/10/10%10;
			int wan=x/10/10/10/10%10;
			if ((ge==wan) && (shi==qian)) {
				System.out.println(x);
			}
		}
	}

}
