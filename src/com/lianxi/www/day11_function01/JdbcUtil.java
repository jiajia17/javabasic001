package com.lianxi.www.day11_function01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdbcUtil {
	/*1.�������ݿ�����	
	 * 
	  2.�������Ӷ���
	  3.����ִ�ж���
	  4.������/��
	  5.�ر��ͷ���Դ
	  */
	//�����������������Ӷ��󣬴���ִ�ж���
	public static PreparedStatement connectFun(String sql) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/double11?useUnicode=true&characterEncoding=UTF8";//test�����ݿ���
		String user = "root";
		String password ="root";
		Connection connection  =  DriverManager.getConnection(url, user, password);
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		return preparedStatement;
	}
	
	public static void  closeFun(PreparedStatement preparedStatement,Connection connection) throws ClassNotFoundException, SQLException{
		/*int  resultSet = preparedStatement.executeUpdate();//��ɾ��  Ҫ�Խ�����в�����
		ResultSet resultSet1 = preparedStatement.executeQuery();//��   �Խ�������в���
*/		
		preparedStatement.close();
		connection.close();
	}
	
}
