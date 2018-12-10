package com.nit.logback;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nit.logback.model.Student1;

public class Test {
	public static void main(String[] args) {
        RestTemplate restTemplate =new RestTemplate();
        Student1 student1 = new Student1("ilyas", "abbasi", Timestamp.valueOf(LocalDateTime.now()));
         System.out.println(student1);
        HttpHeaders headers=new HttpHeaders();
        HttpEntity<Object> entity=new HttpEntity<Object>(student1,headers);
        
        restTemplate.exchange("http://localhost:8080/post",HttpMethod.POST,entity,String.class);
        
        
	}
}
