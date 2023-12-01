package de.thb.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UebungSpringBootApplicationIT {

	@Test
	void contextLoads() {

		int a = 2;
		int b = 3;
		System.out.println("This is a integration test!");
		assert a != b;

	}

}
