package com.lianxi.day05_switch;

import java.util.Scanner;

/*
 * switch(���ʽ){
 * 		case ֵ1:
 * 			�����1;
 * 			break;
 * 		case ֵ2:
 * 			�����2;
 * 			break;
 * 		...
 * 		default:
 * 			�����n+1;
 * 			break;
 * }
 * ��ʽ���ͣ�
 * 		���ʽ��byte,short,int,char
 * 		JDK5�Ժ����ʹö��
 * 		JDK�Ժ�������ַ���
 * 		case�����ֵ�����������ͱ��ʽ��ֵ����ƥ�������
 * 		break����ʾ�жϵ���˼
 * 		default:���е�ֵ����ƥ���ʱ��ִ��
 * ִ�����̣�
 * 		A ���ȼ�����ʽ��ֵ
 * 		B ��������������ֵ�����κ�case�����ֵ���бȽϣ�һ����ƥ��ľ�ִ����Ӧ�����
 * 		��ִ�й����У�����break�ͽ���
 * 		C������е�case����ƥ�䣬��ִ�������n+1
 * */
public class SwitchDemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("������һ�����֣�1-7��");
		int weekday=scanner.nextInt();
		
		switch (weekday) { 
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
			

		default:
			System.out.println("��������");
			break;
		}
	}

}
