package com.lianxi.day06_for;

/*
 * for ѭ�����ĸ�ʽ��
 * 		for����ʼ����䣻�ж�������䣻����������䣩{
 *          ѭ������䣻
 *          }
 *     ִ�����̣�
 *     	A:ִ�г�ʼ����䣻
 *      B:ִ���ж�������䣬��������true����false
 *      �����false���ͽ���ѭ��
 *      �����true���ͼ���ִ��
 *      C:ִ��ѭ�������
 *      D:ִ�п����������
 *      E:�ص�B����*/
public class ForDemo {
	public static void main(String[] args) {
		for (int a=1;a<=5;a++){
			System.out.println("HelloWorld");
		}
		for(int x=1;x<=5;x++){
			System.out.println("x:"+x);
		}
		for(int y=5;y>=1;y--){
			System.out.println("y:"+y);
		}
		/*
		 * ���1-5֮�������֮��
		 * ������
		 * 1.������ͱ�������ʼ����ֵ��0
		 * 2.��ȡ1-5�����ݣ���forѭ��ʵ��
		 * 3.��ÿһ�λ�ȡ���������ۼӵ���ͱ�������
		 * 4.�����ͱ���
		 * */
		
		
		int sum=0;
		for(int b=1;b<=5;b++){
			sum +=b;
		}
		System.out.println("sum:"+sum);
		
	}

}
