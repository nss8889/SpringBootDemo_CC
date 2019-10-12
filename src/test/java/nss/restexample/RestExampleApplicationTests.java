package nss.restexample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestExampleApplicationTests {

	@Test
	public void contextLoads() {
		int fakeEx = 12345678/0; 
		System.out.println("contextLoads");
	}


	@Test
	public void check() {
		System.out.println("check");
	}

}
