package main;

public class StringCalculator {

	public int add(String numbers) {
		String n[]=numbers.split(", ");
		int sum;
		if(n[0].equals(""))
		{
			sum=0;
			return sum;
		}
		int i;
		i=0;
		sum=0;
		while(i<n.length)
		{
			sum+=Integer.parseInt(n[i]);
			i++;
		}
		return sum;
	}

}
