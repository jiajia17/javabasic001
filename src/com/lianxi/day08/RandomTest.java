package com.lianxi.day08;

import java.util.Random;
import java.util.Scanner;

/*
 * ������С��Ϸ
 * 		ϵͳ����һ��1-100֮������������³���������Ƕ���
 * ������
 * 		A��ϵͳ����һ��1-100֮��������
 * 		Random r= new Random();
 * 		int number =r.nextInt(100) +1;
 * 		B:����¼������Ҫ�µ�����
 * 		C:�Ƚ�����������ݣ���if���ʵ��
 * 		D:��β����ݣ������ǲ�֪���¶��ٴΣ���ô���أ�
 * 			whlie(true){ѭ������䣻}
 * */
public class RandomTest {
	public static void main(String[] args) {
		// ϵͳ����һ��1-100֮��������
		Random random = new Random();
		int number = random.nextInt(100) + 1;

		// ����¼������Ҫ�µ�����
		Scanner scanner = new Scanner(System.in);
		
		//��β�����
		while(true){
			// ��������
			System.out.println("��������Ҫ�µ����ݣ�1-100����");
			int guessnumber = scanner.nextInt();
	
			// �Ƚ�����������ݣ���if���ʵ��
			if (guessnumber > number) {
				System.out.println("��µ�����" + guessnumber + "����");
			} else if (guessnumber < number) {
				System.out.println("��µ�����" + guessnumber + "С��");
			} else {
				System.out.println("��ϲ�㣬������");
				break;
			}
		}
	}

}
