package com.example.demozes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demozes.domain.VoorbeeldClass;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemozesApplicationTests {

	@Test
	public void contextLoads() {
		VoorbeeldClass vc = new VoorbeeldClass();
		Assert.assertEquals(vc.returnOne(), 1);
	}

}
