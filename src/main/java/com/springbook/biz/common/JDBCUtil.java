package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//JDBC ���� �۾� ó�� ����� �����ϴ� Ŭ����
//��� �޼��带 �ν��Ͻ� �������� ȣ�� �����ϵ��� static ���� ����
public class JDBCUtil {

	public static Connection getConnection() { //�����ͺ��̽� ����
		try { //DriverManager Ŭ������ ����� ����
			Class.forName("org.h2.Driver");
			return DriverManager.getConnection("jdbc:h2:rcp://localhost/~/test","sa","");
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	//����: ��� sql���� �����ϴ� ����, ���� �ݵ�� trt~catch �Ǵ� throwsó���� �ʿ�
	//statement: ������ ������ ���� ,�� �������� ���� �̸� �ԷµǾ� �־�� �Ѵ�
	//PreparedStatement: statement�� ��ӹ޴� ��ü, sql������ �����Ű�� ���, ��ü������ ������ sql��ɾ ����
	//                   �Ľ��� �ѹ��ϱ⿡ ������. ����ǥ�� �ڷ����� �Ű澲�� �ʾƵ� �ȴ�
	
	//Connection: Ư��DB����, sql�� ����ǰ� ���� ���ؽ�Ʈ������ ����� ��ȯ
	//ResultSet: ������� ����, ����Ȱ��� ������� ȣ�Ⱑ��,
	//           executeQuery(String sql)�� ���� ���� �����ϸ� ResultSetŸ������ ��ȯ
	
	public static void close(PreparedStatement stmt, Connection conn) {
		if(stmt != null) {
			try {
				if(!stmt.isClosed()) stmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				stmt = null;
			}
		}
		if(conn !=null) {
            try {
				if(!conn.isClosed()) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}
	}
	
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		if(rs != null) {
            try {
				if(!rs.isClosed()) rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				rs = null;
			}
		}
		if(stmt != null) {
			try {
				if(!stmt.isClosed()) stmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				stmt = null;
			}
		}
		if(conn !=null) {
            try {
				if(!conn.isClosed()) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}
	}
}
