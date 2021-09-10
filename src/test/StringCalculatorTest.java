package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.StringCalculator;

public class StringCalculatorTest {

	private StringCalculator stringCalculator;
	
	@Before
	public void setup()
	{
		stringCalculator=new StringCalculator();
	}
	
	@Test
	public void testAdd()
	{
		Assert.assertEquals(0, stringCalculator.add(""));
	}
	
	@Test
	public void testAddNumbers()
	{
		Assert.assertEquals(1, stringCalculator.add("1"));
	}
}
