package com.lianxi.www.day12_jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class JdbcUtil {
	/*
	 * 首先加载jar包 mysql驱动数据库 1.加载数据库驱动 2.创建连接对象 3.创建执行对象 4.处理结果/集 5.关闭释放资源
	 */
	// 加载数据库驱动
	public static PreparedStatement connectFun(String sql) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/double11?useUnicode=true&characterEncoding=UTF8";
		String user = "root";
		String password = "root";
		Connection connection = (Connection) DriverManager.getConnection(url, user, password);
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		return preparedStatement;
	}

	/*
	 * int resultSet = preparedStatement.executeUpdate();//增删改 对结果进行操作 ResultSet
	 * resultSet2= preparedStatement.executeQuery();// 查 对结果集进行操作
	 */
	public static void closeFun(PreparedStatement preparedStatement, Connection connection)
			throws ClassNotFoundException, SQLException {
		preparedStatement.close();
		connection.close();
	}
}
