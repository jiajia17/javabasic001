package com.lianxi.day09_Array;
/*
 * ���������������������е�ÿһ��Ԫ�أ�
 * */
public class ArrayTest01 {
	public static void main(String[] args) {
		//����һ������
		int[] arr={11,22,33,44,55};
		
		//ͨ��forѭ��ʵ�ֻ�ȡ����0-4
		for(int x=0;x<=4;x++){
			System.out.println(arr[x]);
		}
		
		System.out.println("---------------");
		//Ϊ�������ȥ��������Ԫ�صĸ�����������ṩ��һ�����ԣ�length
		//���ڻ�ȡ����Ԫ�ظ���
		//��ʽ��������.length
		System.out.println("���鹲��"+arr.length+"��");
		System.out.println("___________");
		for(int y=0;y<=arr.length-1;y++){
			System.out.println(arr[y]);
		}
	}

}
