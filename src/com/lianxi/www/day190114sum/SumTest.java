package com.lianxi.www.day190114sum;

/*
 * ����
 * (1)����һ��int���͵�һά���飬����Ϊ{171,72,19,16,118,51,210,7,18}
 * (2)���������������Ҫ���Ԫ�غ͡�
 * 		Ҫ����͵�Ԫ�صĸ�λ��ʮλ���ܰ���7,����ֻ��Ϊż����
 * 
 * ������
 * 		A:����һ��int���͵�һά����
 * 		B:����һ����ͱ���
 * 		C:�������飬��ȡ�������е�ÿһ��Ԫ��
 * 		D:�жϸ�Ԫ���Ƿ���������Ҫ������Ǿ��ۼӣ����򣬲�������
 * 			x%2==0
 * 			x%10 != 7
 * 			x/10%10 !=7
 * 		E:������
 */
public class SumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={171,72,19,16,118,51,210,7,18};
		
		int sum=0;
		
		for(int x=0;x<arr.length;x++){
			if ((arr[x]%2==0) && (arr[x]%10!=7) && (arr[x]/10%10!=7)) {
				sum +=arr[x];
			}
		}
		System.out.println("sum:"+sum);
	}

}
