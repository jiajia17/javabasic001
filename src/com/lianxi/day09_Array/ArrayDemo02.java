package com.lianxi.day09_Array;
/*
 * ��������С���⣺
 * 		ArrayIndexOutOfBoundsException:��������Խ���쳣
 * 		������ԭ�򣺷����˲����ڵ�����
 * 	
 * 		NullPointerException:��ָ���쳣
 * 		������ԭ�������Ѿ�����ָ����ڴ�������ˣ��㻹ʹ��������ȥ����Ԫ��
 * */
public class ArrayDemo02 {
	public static void main(String[] args) {
		//��������
		int[] arr={1,2,3};
		//��������Ԫ��
		//System.out.println(arr[3]);//java.lang.ArrayIndexOutOfBoundsException
		
		//�������ͣ��࣬�ӿڣ�����
		//�������ճ�����null,�ǿ��Ը�ֵ���������͵�
		arr=null;
		System.out.println(arr[1]);//java.lang.NullPointerException
	}

}
