package com.lianxi.day05_if;

import java.util.Scanner;

/*
 * ����¼��ѧ�����Գɼ�������ݳɼ��жϸ�ѧ�������ĸ�����
 * 90-100  ����
 * 80-90  ��
 * 70-80  ����
 * 60-70  ����
 * 60���²�����
 * 
 * ������
 * 	A ����¼��ѧ�����Գɼ����뵽����¼��Ĳ���
 * 	B ͨ���򵥵ķ��������Ǿ������� If����ʽ3ʵ��
 *    ÿ���ж���Ϻ�����ֱ�������Ӧ�ļ��𼴿�
 *    */
public class IfTest02 {
	public static void main(String[] args) {
		//��������¼�����
		Scanner scanner=new Scanner(System.in);
		
		//��������
		System.out.println("������ѧ���Ŀ��Գɼ���");
		int score=scanner.nextInt();
		
		//if����ʽ3ʵ��
		/*if (score >= 90 && score <= 100) {
			System.out.println("����");
		} else if (score >= 80 && score <= 90) {
			System.out.println("��");
		} else if (score >= 70 && score <= 80) {
			System.out.println("����");
		}

		else if (score >= 60 && score < 70) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}*/
		//ͨ���������ݣ����Ƿ��ֳ��򲻹����ƣ��������Ǽ����˷Ƿ����ݵ��ж�
		if (score > 100 || score < 0) {
			System.out.println("������ĳɼ�����");
		} else if (score >= 90 && score <= 100) {
			System.out.println("����");
		} else if (score >= 80 && score <= 90) {
			System.out.println("��");
		} else if (score >= 70 && score <= 80) {
			System.out.println("����");
		} else if (score >= 60 && score < 70) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}

	}

}
