package com.lianxi.www.day190113�ļ�;

import java.util.Scanner;

public class SeasonTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("������һ���·ݣ�1-12����");
		int month=scanner.nextInt();
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("����");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�＾");
			break;

		default:
			System.out.println("��������·�����");
			break;
		}
	}

}
