package com.lianxi.www.day190114sum;

import java.util.Scanner;

/*
 * ����
 * (1)����¼��5��int���͵����ݴ洢����arr��
 * (2)���巽����arr�����е����ݷ�ת
 * (3)���巽���Է�ת���������б���
 * 
 * ������
 * 		A:����һ������Ϊ5������
 * 		B:ͨ������¼�����ݸ������е�Ԫ�ظ�ֵ
 * 		C:���巽����arr�����е����ݷ�ת
 * 			ʲô�Ƿ�ת?��η�ת?
 * 		D:���巽����������
 */
public class ReverseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5];
		Scanner scanner=new Scanner(System.in);
		for(int x=0;x<arr.length;x++){
			System.out.println("�������"+(x+1)+"��Ԫ��");
			arr[x]=scanner.nextInt();
			
		}
		System.out.println("��תǰ������Ԫ�أ�");
		printArray(arr);
		
		reverse(arr);
		
		
		System.out.println("��ת�������Ԫ�أ�");
		
		printArray(arr);
		
	}
	public static void printArray(int[] arr){
		System.out.println("[");
		for(int x=0;x<arr.length;x++){
			if(x==arr.length-1){
				System.out.println("]");
			}else{
				System.out.println(arr[x]+",");
			}
		}
	}
	public static void reverse(int[] arr){
		for(int startIndex=0,endIndex=arr.length-1;startIndex<=endIndex;startIndex++,endIndex--){
			int temp=arr[startIndex];
			arr[startIndex]=arr[endIndex];
			arr[endIndex]=temp;
			
		}
	}

}
