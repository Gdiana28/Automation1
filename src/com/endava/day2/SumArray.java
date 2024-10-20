package com.endava.day2;

public class SumArray
{
	public static void main(String[] args)
	{
		int[] numbers={1,2,3,4,5,6,7,8,9,10};
		System.out.println("Sum for-loop: " + sumForLoop(numbers));
		System.out.println("Sum for-each-loop: " + sumForEachLoop(numbers));
		System.out.println("Sum while-loop: " + sumWileLoop(numbers));
	}
	public static int sumForLoop(int[] array)
	{
		int sum=0;
		for (int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		return sum;
	}
	public static int sumForEachLoop(int[] array)
	{
		int sum=0;
		for (int num:array)
		{
			sum+=num;
		}
		return sum;
	}
	public static int sumWileLoop(int[] array)
	{
		int sum=0;
		int i=0;
		while(i<array.length)
		{
			sum+=array[i];
			i++;
		}
		return sum;
	}

}
