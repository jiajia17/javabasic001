package com.lianxi.www.day12_jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);

		String sql = "select * from products";
		PreparedStatement preparedStatement = JdbcUtil.connectFun(sql);
		ResultSet resultSet = preparedStatement.executeQuery();

		System.out.println(resultSet);
	}

}
