package com.lianxi.www.day190115index;

import java.util.Scanner;

/*
 * ���󣺼���¼������,Ҫ����������λ������,����Ҫ�����ݽ��м���,���ܹ�������:
 * ÿλ���ֶ�����5,Ȼ�����10���������������,
 * �ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����,
 * ��Ѽ��ܺ���������������̨
 * 
 * ������
 * 		A:����¼��һ����λ��
 * 		B:�����ݽ��м���
 * 			������
 * 				4567
 * 				�������λ���ֳɸ���ʮ���٣�ǧ�洢��������
 * 				int[] arr = {4,5,6,7};
 * 				ÿλ���ֶ�����5��
 * 					arr[x] += 5;	{9,10,11,12}
 * 				Ȼ�����10��������������֣�
 * 					arr[x] %= 10;	{9,0,1,2}
 * 				 �ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ������
 * 					{9,0,1,2}		{2,1,0,9}
 * 		C:������ܺ������
 */
public class EncryptionTest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("������һ����λ������");
		int number=scanner.nextInt();
		
		int ge=number%10;
		int shi=number/10%10;
		int bai=number/10/10%10;
		int qian=number/10/10/10%10;
		
		int[] arr={ge,shi,bai,qian};
		
		for(int x=0;x<arr.length;x++){
			arr[x] +=5;
			arr[x] %=10;
			
		}
		int temp=arr[0];
		arr[0]=arr[3];
		arr[3]=temp;
		
		int temp2=arr[1];
		arr[1]=arr[2];
		arr[2]=temp2;
		
		
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[x]);
		}
		System.out.println();
	}
	
}
