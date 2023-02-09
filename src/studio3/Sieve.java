package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Input a number");
		int n = in.nextInt();

		boolean[] arrayOne = new boolean[n];

		for (int k = 2; k < Math.sqrt(n); k++) 
		{
			if (arrayOne[k] == false)
			{
				for (int j = k * k; j < arrayOne.length; j+=k) 
				{
					arrayOne[j] = true;
				}
			}
		}
		for (int i = 2; i < arrayOne.length; i++)
		{
			if (arrayOne[i] == false)
			{
				System.out.println(i);
			}
		}
	
	}

}
