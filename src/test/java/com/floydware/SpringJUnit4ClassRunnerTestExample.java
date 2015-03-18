package com.floydware;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.floydware.controllers.SampleController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:**/hello-junit.xml")
public class SpringJUnit4ClassRunnerTestExample {

	@Test
	public void test() {
		Assert.assertTrue(true);
	}

	@Test
	public void mockTest() {
		final SampleController mock = spy(new SampleController());

		// will be called:
		Mockito.when(mock.doStuff()).thenReturn(1);

		// will not be called:
		doReturn(1).when(mock).doStuff();

		mock.doStuff();

		Mockito.verify(mock, times(1)).doStuff(); //works with either one.
	}
}
