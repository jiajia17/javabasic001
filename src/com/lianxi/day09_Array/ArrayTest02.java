package com.lianxi.day09_Array;
/*
 * �����ȡ��ֵ�����ֵ ��Сֵ��
 * */
public class ArrayTest02 {
	public static void main(String[] args) {
		//��������
		int[] arr={12,45,98,73,60};
		
		//���������
		int max=arr[0];
		
		//�������飬��ȡ����0���������Ԫ�أ����бȽ�
		for(int x=1;x<=arr.length-1;x++){
			if(arr[x]>max){
				max=arr[x];
			}
		}
		System.out.println("max:"+max);
	}
}
