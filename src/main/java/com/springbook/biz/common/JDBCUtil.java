package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//JDBC 관련 작업 처리 기능을 제공하는 클래스
//모든 메서드를 인스턴스 생성없이 호출 가능하도록 static 으로 선언
public class JDBCUtil {

	public static Connection getConnection() { //데이터베이스 연결
		try { //DriverManager 클래스를 사용한 연결
			Class.forName("org.h2.Driver");
			return DriverManager.getConnection("jdbc:h2:rcp://localhost/~/test","sa","");
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	//공통: 모두 sql문을 수행하는 역할, 사용시 반드시 trt~catch 또는 throws처리가 필요
	//statement: 정적인 쿼리문 수행 ,즉 쿼리문에 값이 미리 입력되어 있어야 한다
	//PreparedStatement: statement를 상속받는 객체, sql쿼리를 실행시키는 기능, 객체생성시 지정된 sql명령어만 수행
	//                   파싱을 한번하기에 빠르다. 따음표와 자료형을 신경쓰지 않아도 된다
	
	//Connection: 특정DB연결, sql문 실행되고 연결 컨텍스트내에서 결과가 반환
	//ResultSet: 결과값을 저장, 저장된값을 행단위로 호출가능,
	//           executeQuery(String sql)을 통해 쿼리 실행하면 ResultSet타입으로 반환
	
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
