package com.nit.logback.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nit.logback.model.Student;
import com.nit.logback.model.Student1;

@Repository
public class StudentDAO {
  private static final String UPDATE="INSERT INTO STUDENT(FIRSTNAME,LASTNAME,DATETIME)VALUES(?,?,?)";
  private static final String UPDATE1="INSERT INTO STUDENT1(FIRSTNAME,LASTNAME,TIMESTAMP)VALUES(?,?,?)";
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int update(Student student) {
		int result=0;
		
		result=jdbcTemplate.update(UPDATE,student.getFirstName(),student.getLastName(),student.getLocalDateTime());
		
		return result;
	}
	
	public int update1(Student1 student1) {
		int result=0;
		
		result=jdbcTemplate.update(UPDATE1,student1.getFirstName(),student1.getLastName(),student1.getTimestamp());
		
		return result;
	}
	
	
}
