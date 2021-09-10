package main;

public class StringCalculator {

	public int add(String numbers) {
		String n[]=numbers.split(", ");
		int a, b, sum;
		try
		{
			a=Integer.parseInt(n[0]);
			if(n.length>1) b=Integer.parseInt(n[1]);
			else b=0;
		}catch(NumberFormatException nfe)
		{
			a=0;
			b=0;
		}
			sum=a+b;
		return sum;
	}

}
