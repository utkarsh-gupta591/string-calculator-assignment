package main;

public class StringCalculator {

	public int add(String numbers) {
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
