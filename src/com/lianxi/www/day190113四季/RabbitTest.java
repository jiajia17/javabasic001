package com.lianxi.www.day190113�ļ�;

import com.mysql.fabric.xmlrpc.base.Array;

/*
 * ����
 * 		��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ�
 * 		�������Ӷ��������ʵڶ�ʮ���µ����Ӷ���Ϊ���٣� 
 * 
 * ���ɣ�
 * 		��һ���£�1
 * 		�ڶ����£�1
 * 		�������£�2
 * 		���ĸ��£�3
 * 		������£�5
 * 		...
 * 
 * 		���ɣ��ӵ������¿�ʼ��ÿ���µ����Ӷ�����ǰ�����µ����Ӷ���֮�͡�
 * 			��һ���º͵ڶ����µ����Ӷ�����1
 * ������
 * 		int[] arr = new int[20];
 * 
 * 		arr[0] = 1;
 * 		arr[1] = 1;
 * 
 * 		arr[2] = arr[0] + arr[1];
 * 		arr[3] = arr[1] + arr[2];
 * 		arr[4] = arr[2] + arr[3];
 * 		...
 */

public class RabbitTest {
	public static void main(String[] args){
		int[] arr=new int[20];
		arr[0]=1;
		arr[1]=1;
		
		for(int x=2;x<arr.length;x++){
			arr[x]=arr[x-2]+arr[x-1];
		}
		System.out.println("��20���µ����Ӷ�����"+arr[19]);
	}
}
