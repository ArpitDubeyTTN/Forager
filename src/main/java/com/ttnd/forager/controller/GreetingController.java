package com.ttnd.forager.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ttnd.forager.dao.SampleDao;
import com.ttnd.forager.entites.Greeting;

@RestController
public class GreetingController {
	
	 private static final String template = "Hello, %s!";
	 private final AtomicLong counter = new AtomicLong();
	 
	 @Autowired
	 private SampleDao sampleDao;

	 @RequestMapping("/greeting")
	 public  Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		 System.out.println("Name is : "+name);
		 Greeting user = new Greeting();
		 user.setId(counter.incrementAndGet());
		 user.setContent(name);
		 sampleDao.saveUser(user);
	     return user;
	 }

}
