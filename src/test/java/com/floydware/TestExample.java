package com.floydware;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:**/hello-junit.xml")
public class TestExample {
	//@Resource
	private String testString;

        @Before
        public void setup(){
          MockitoAnnotations.initMocks(this);
        }

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
