package com.lianxi.day08_����;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr=new int[3];
		
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//Ȼ����ڶ��������ʱ��ѵ�һ������ĵ�ַ��ֵ���ڶ�������
		int[] arr2=arr;
		
		//�ٴ�����������������Ԫ��
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
	}

}
