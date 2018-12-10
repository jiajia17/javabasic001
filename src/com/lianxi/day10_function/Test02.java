package com.lianxi.day10_function;

public class Test02 {
	public static void main(String[] args) {
		Utildefine.fun1("12321");
		
		Utildefine a=new Utildefine();
		System.out.println(a.fun2("321"));
		
		a.fun1(123545);
		
		String[] array01=new String[4];
		array01[0]="1";
		array01[1]="2";
		array01[2]="3";
		array01[3]="4";
		
		
		
		String[] array02 = {"1","2","3","4"};
		
		a.fun3(array01);
		}

}
