package com.lianxi.www.day11_function01;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner  scanner = new Scanner(System.in);
		
		int a=0;
		int b=1;
		int[] arr={1,2,3};
		System.out.println(a);
		a=10;
		System.out.println(a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(arr);
		//試一下數據庫能不能連接成功
		String sql = "select * from products";
		PreparedStatement preparedStatement = JdbcUtil.connectFun(sql);
		ResultSet resultSet =preparedStatement.executeQuery();
		
		System.out.println(resultSet);
		scanner.close();
		
		
	}

		
}
