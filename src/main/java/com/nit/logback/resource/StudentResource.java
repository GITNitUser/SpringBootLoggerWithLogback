package com.nit.logback.resource;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nit.logback.dao.StudentDAO;
import com.nit.logback.model.Student;
import com.nit.logback.model.Student1;
import com.nit.logback.model.Student2;

@RestController
public class StudentResource {
	private static final Logger logger = LoggerFactory.getLogger(StudentResource.class);
	@Autowired
	private StudentDAO studentDAO;

	@RequestMapping("/")
	public String helloWorld() {
		Student student = new Student("ilyas", "abbasi", LocalDateTime.now());

		logger.info("Student Object is created: " + student);

		studentDAO.update(student);

		return "successful";
	}

	@RequestMapping("/hello")
	public String timeStamp() {
		Student1 student1 = new Student1("ilyas", "abbasi", Timestamp.valueOf(LocalDateTime.now()));
		logger.info("Student1 Object is created: " + student1);
		studentDAO.update1(student1);

		return "successful";
	}
	
	@RequestMapping("/get")
	public Student1 getTimeStamp() {
		Student1 student1 = new Student1("ilyas", "abbasi", Timestamp.valueOf(LocalDateTime.now()));
		logger.info("Student1 Object is created: " + student1);

		return student1;
	}
	
	@RequestMapping(value="/post",method=RequestMethod.POST)
	public String postStudent(@RequestBody Student1 student1) {
		logger.info("Student1 post Object is created: " + student1);
		studentDAO.update1(student1);
		return "successful";
	}
	
	@RequestMapping(value="/post2",method=RequestMethod.POST)
	public String postStudent2(@RequestBody Student2 student2) {
		logger.info("Student2 post Object is created: " + student2);
		return "successful";
	}
}
