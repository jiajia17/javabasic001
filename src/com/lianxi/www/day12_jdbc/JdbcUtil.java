package com.lianxi.www.day12_jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class JdbcUtil {
	/*
	 * ���ȼ���jar�� mysql�������ݿ� 1.�������ݿ����� 2.�������Ӷ��� 3.����ִ�ж��� 4.������/�� 5.�ر��ͷ���Դ
	 */
	// �������ݿ�����
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
	 * int resultSet = preparedStatement.executeUpdate();//��ɾ�� �Խ�����в��� ResultSet
	 * resultSet2= preparedStatement.executeQuery();// �� �Խ�������в���
	 */
	public static void closeFun(PreparedStatement preparedStatement, Connection connection)
			throws ClassNotFoundException, SQLException {
		preparedStatement.close();
		connection.close();
	}
}
