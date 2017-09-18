package list;

import java.util.Scanner;

public class Restaurant {
	int pizza=10;
	int pasta=20;
	
	
	int Quantity;
	Scanner sc=new Scanner(System.in);
	public int takeOrders(int ItemID,int Quantity){
		
		System.out.println(pizza+ "  "+pasta);
		while(true)
		{
			System.out.println("enter 1.pizza 2.pasta");
			ItemID=sc.nextInt();
		switch(ItemID)
		{
	
		case 1:
			System.out.println("pizza");
			System.out.println("how many pizzas needed");
			Quantity=sc.nextInt();
			
			if(Quantity>=pizza)
				System.out.println("not available");
			else
				pizza=pizza-Quantity;
				System.out.println("requested pizzas to be delivered    "+Quantity);
			
			break;
		case 2:
			System.out.println("pasta");
			System.out.println("how many pastas needed");
			Quantity=sc.nextInt();
			if(Quantity>=pasta)
				System.out.println("not available");
			else
				pasta=pasta-Quantity;
				System.out.println("requested pastas to be delivered     " +Quantity);
			
			break;
		default:
			System.out.println("exit");
			break;
		}
		}
	}

}
