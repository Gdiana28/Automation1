package com.endava.day2;

public class Diveded {
	public static void main(String[] args)
	{
		int n=10;
		printDiveded(n);
	}
public static void
printDiveded(int n)
{
	for (int i=1; i<=n; i++)
	{
		if (i%3==0)
		{
			System.out.println("3M5M");
		} else if (i%3==0){
			System.out.println("3M");
		}
		else if (i%5==0){
			System.out.println("5M");
		}
		else{
			System.out.println(i);
		}
	}
}
}
