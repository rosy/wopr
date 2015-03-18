package com.floydware;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:**/hello-junit.xml")
public class TestExample {
	//@Resource
	private String testString;

	@Test
	public void test() {
		Assert.assertTrue(true);
	}
/*
	@Test
	public void testString() {
		Assert.assertTrue(true);
		Assert.assertEquals("Hello World", testString);
	}
*/

}
