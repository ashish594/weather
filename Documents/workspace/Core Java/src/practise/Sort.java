package practise;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array1[]=new int[10];
		int i=0;
		while(i<5)
		{
			System.out.println("enter");
			array1[i]=sc.nextInt();
			i++;
		}
		for(int j=0;j<array1.length;j++)
		{
			System.out.println(array1[j]);
		}
		
			
	}

}
