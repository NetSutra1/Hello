package mypack;

import java.util.Arrays;

public class ArrayListSort
{
	public static void main(String[] args) 
	{
		int array[]={12,55,32,0,78,-85,-99,101,-65};
		Arrays.sort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println();
			System.out.println(array[i]);
		}
	}
}
