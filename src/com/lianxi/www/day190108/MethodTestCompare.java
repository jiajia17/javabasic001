package com.lianxi.www.day190108;

import java.util.Scanner;

public class MethodTestCompare {
	public static void main(String[] args) {
		//��������¼�����
		Scanner scanner=new Scanner(System.in);
		//��������
		System.out.println("�������һ�����ݣ�");
		int x=scanner.nextInt();
		System.out.println("������ڶ������ݣ�");
		int y=scanner.nextInt();
		
		//���÷���
		boolean b=campare(x,y);
		
		//������
		System.out.println("b:"+b);
		
		/*
		 * �Ƚ��������Ƿ����
		 * ������ȷ��
		 * 	����ֵ���ͣ�boolean;
		 * 	�����б�int a, int b*/
		
		
		}

	private static boolean campare(int x, int y) {
		// TODO Auto-generated method stub
		
		if(x==y){
			return true;
		}else{
			return false;
		}
	}

}
