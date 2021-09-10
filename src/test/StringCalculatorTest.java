package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.StringCalculator;
import main.exception.NegativeNumberException;

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
	
	@Test
	public void testAdd2Numbers()
	{
		Assert.assertEquals(6, stringCalculator.add("1, 5"));
	}
	
	@Test
	public void testAdd_n_Numbers()
	{
		Assert.assertEquals(40, stringCalculator.add("1, 2, 3, 8, 9, 2, 5, 10"));
	}
	
	@Test
	public void testAdd_2()
	{
		Assert.assertEquals(11, stringCalculator.add("1\n2, 3\n5"));
		Assert.assertEquals(12, stringCalculator.add("1\n2\n3\n6"));
	}
	
	@Test
	public void testAdd_3()
	{
		Assert.assertEquals(21, stringCalculator.add("//;\n1;2;5;6;7"));
		Assert.assertEquals(21, stringCalculator.add("//:\n1:2:5:6:7"));
		Assert.assertEquals(21, stringCalculator.add("//,\n1,2,5,6,7"));
	}
	
	@Test
	public void testAddNegativeNumbers()
	{
		try
		{
		Assert.assertEquals(5, stringCalculator.add("1, -4, -8, 2, -6"));
		}catch(NegativeNumberException nne)
		{
			System.out.println(nne.getMessage());
		}
	}
}
