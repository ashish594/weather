package list;

import java.util.Scanner;

public class Lottery {
	
	public int  random(int a){
		int randomNo1=(int)(Math.random()*5);
		int randomNo2=(int)(Math.random()*5);
		int randomNo3=(int)(Math.random()*5);
		int randomNo4=(int)(Math.random()*5);
		int randomNo5=(int)(Math.random()*5);
		int i;
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		switch(i)
		{
		case 1:
			System.out.println("pays customer $5");
			System.out.println(randomNo1);
			break;
		case 2:
			System.out.println("pays customer $10");
			System.out.println(randomNo2);
			break;
		case 3:
			System.out.println("pays customer $15");
			System.out.println(randomNo3);
			break;
		case 4:
			System.out.println("pays customer $20");
			System.out.println(randomNo4);
			break;
		case 5:
			System.out.println("pays customer $25");
			System.out.println(randomNo5);
			break;
		case 6:
			System.out.println("Sorry! You didn't win");
		}
		return i;
	
	}
	
}
