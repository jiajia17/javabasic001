package com.lianxi.www.day190114sum;

import java.util.Scanner;

/*
 * �����ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ0-100�������֡�
 * ѡ�ֵ����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ� ����4��ѡ�ֵ�ƽ��ֵ��
 * ��д����ʵ�֡�(������С������)
 * 
 * ������
 * 		A:����һ������Ϊ6�����顣
 * 		B:ͨ������¼��ķ�ʽ������ί�ķ���
 * 		C:д����ʵ�ֻ�ȡ�����е����ֵ����Сֵ
 * 		D:д����ʵ������Ԫ�ص����
 * 		E:ƽ���֣� (��-��߷�-��ͷ�)/(arr.length-2)
 * 		F:�����������
 */
public class ScoreTest {
	public static void main(String[] args){
		int[] arr=new int[6];
		
		Scanner scanner=new Scanner(System.in);
		for(int x=0;x<arr.length;x++){
			
			System.out.println("Ոݔ���"+(x+1)+"����ί�ķ���");
			int score=scanner.nextInt();
			arr[x]=score;
		}
		
		int Max=getMax(arr);
		int Min=getMin(arr);
		int sum= sum(arr);
		
		int avg=(sum-Max-Min)/(arr.length-2);
		
		System.out.println("��ѡ�ֵ����յ÷��ǣ�"+avg);

		}
	public static int sum(int[] arr){
		int sum=0;
		for(int x=0;x<arr.length;x++){
			sum +=arr[x];
		}
		return sum;
	}
	
	public static int getMax(int[] arr){
		int max=arr[0];
		
		for(int x=1;x<arr.length;x++){
			if(arr[x]>max){
				max=arr[x];
			}
		}
		return max;
	}
	
	public static int getMin(int[] arr){
		int min=arr[0];
		
		for(int x=1;x<arr.length;x++){
			if(arr[x]>min){
				min=arr[x];
			}
		}
		return min;
	}
}
