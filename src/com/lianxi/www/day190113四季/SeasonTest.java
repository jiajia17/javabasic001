package com.lianxi.www.day190113�ļ�;

import java.util.Scanner;

public class SeasonTest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("������һ���·ݣ�1-12����");
		
		int month=scanner.nextInt();
		
		if(month==3 || month==4 || month==5){
			System.out.println(month+"���Ǵ���");
		}else if (month==6|| month==7||month==8) {
			System.out.println(month+"�����ļ�");
		}else if (month==9|| month==10||month==11) {
			System.out.println(month+"�����＾");
		}else if (month==12|| month==1||month==2) {
			System.out.println(month+"���Ƕ���");
		}else {
			System.out.println("������������");
			
		}
	}

}
