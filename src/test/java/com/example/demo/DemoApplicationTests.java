package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.pravaler.spring.DemoApplication;
import com.pravaler.spring.PhoneLister;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {

	@Autowired
	PhoneLister lister;

	@Test
	void contextLoads() {
		Object mock;

	}

	@Test
	void finderPRAVALER() {
		assertEquals(lister.phonesOwnedByCompany("PRAVALER").size(), 3);
	}

	@Test
	void finderOUTRO() {
		assertEquals(lister.phonesOwnedByCompany("OUTRO").size(), 0);
	}

}
