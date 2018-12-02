package com.lianxi.day05_if;

import java.util.Scanner;

/*
 * 键盘录入学生考试成绩，请根据成绩判断该学生属于哪个级别
 * 90-100  优秀
 * 80-90  好
 * 70-80  良好
 * 60-70  及格
 * 60以下不及格
 * 
 * 分析：
 * 	A 键盘录入学生考试成绩，想到键盘录入的步骤
 * 	B 通过简单的分析，我们决定采用 If语句格式3实现
 *    每次判定完毕后，我们直接输出对应的级别即可
 *    */
public class IfTest02 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Scanner scanner=new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入学生的考试成绩：");
		int score=scanner.nextInt();
		
		//if语句格式3实现
		/*if (score >= 90 && score <= 100) {
			System.out.println("优秀");
		} else if (score >= 80 && score <= 90) {
			System.out.println("好");
		} else if (score >= 70 && score <= 80) {
			System.out.println("良好");
		}

		else if (score >= 60 && score < 70) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}*/
		//通过测试数据，我们发现程序不够完善，所以我们加入了非法数据的判断
		if (score > 100 || score < 0) {
			System.out.println("您输入的成绩有误");
		} else if (score >= 90 && score <= 100) {
			System.out.println("优秀");
		} else if (score >= 80 && score <= 90) {
			System.out.println("好");
		} else if (score >= 70 && score <= 80) {
			System.out.println("良好");
		} else if (score >= 60 && score < 70) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}

	}

}
