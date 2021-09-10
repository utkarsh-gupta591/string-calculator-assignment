package main;

import java.util.*;

import main.exception.NegativeNumberException;

public class StringCalculator {

	public int add(String numbers) throws RuntimeException{
		int sum;
		String n[];
		if(numbers.startsWith("//"))
		{
			Character separator=numbers.charAt(2);
			n=numbers.substring(4).split(separator.toString());
		}
		else
		{
			n=numbers.split(", |\n");
			if(n[0].equals(""))
			{
				sum=0;
				return sum;
			}	
		}
		List<Integer> negativeNumbers=new ArrayList<Integer>();
		int i, m;
		int flag=0;
		i=0;
		sum=0;
		while(i<n.length)
		{
			m=Integer.parseInt(n[i]);
			if(m<0)
			{
				flag=1;
				negativeNumbers.add(m);
			}
			sum+=m;
			i++;
		}
		if(flag==1)
		{
			throw new NegativeNumberException("negatives not allowed - "+negativeNumbers.toString());
		}
		return sum;
	}

}
