package com.pravaler.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	// ApplicationContext ctx = new FileSystemXmlApplicationContext("spring.xml");
	// PhoneLister lister = (PhoneLister) ctx.getBean("PhoneLister");

	@Autowired
	PhoneLister lister;

	@GetMapping("/hello")
	public List<Phone> hello(@RequestParam(value = "company", defaultValue = "World") String company) {
		List<Phone> phones = lister.phonesOwnedByCompany(company);
		return phones;
	}

}
