package com.lianxi.www.day11_function01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdbcUtil {
	/*1.加载数据库驱动	
	 * 
	  2.创建连接对象
	  3.创建执行对象
	  4.处理结果/集
	  5.关闭释放资源
	  */
	//加载驱动，创建连接对象，创建执行对象
	public static PreparedStatement connectFun(String sql) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/double11?useUnicode=true&characterEncoding=UTF8";//test是数据库名
		String user = "root";
		String password ="root";
		Connection connection  =  DriverManager.getConnection(url, user, password);
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		return preparedStatement;
	}
	
	public static void  closeFun(PreparedStatement preparedStatement,Connection connection) throws ClassNotFoundException, SQLException{
		/*int  resultSet = preparedStatement.executeUpdate();//增删改  要对结果进行操作。
		ResultSet resultSet1 = preparedStatement.executeQuery();//查   对结果集进行操作
*/		
		preparedStatement.close();
		connection.close();
	}
	
}
