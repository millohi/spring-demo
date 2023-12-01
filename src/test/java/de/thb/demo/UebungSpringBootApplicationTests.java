package de.thb.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class UebungSpringBootApplicationTests {
	@Test
	void contextLoads() {
		int x = 0;
		int y = 1+1;
		System.out.println("This is a unit test!");
		assert x != y;
	}

}
