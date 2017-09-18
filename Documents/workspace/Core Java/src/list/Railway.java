package list;

import java.util.Scanner;

public class Railway {
	int tickets=15;
	public void reservation() throws Exception
	{	
		try{
		int reqtick;
		int t;
		Scanner c=new Scanner(System.in);
		System.out.println("Select the train");
		System.out.println("1.Rajadhani 2.Visaka");
		t=c.nextInt();
		
		if(t==1 || t==2)
		{
			System.out.println("Number of tickets:   "+tickets);
			reqtick=c.nextInt();
			while(true)
			{	
				if(reqtick<=0)
				System.out.println("please enter valid no. of tickets   " );			
				else if(reqtick>tickets)
				{
					System.out.println("SORRY! Requested No. of tickets are not avialble");
					System.out.println("Tickets available are:   "+tickets);
				}
				else
				{
					System.out.println("Requested Tickets   "+reqtick);
					tickets=tickets-reqtick;
					System.out.println("Available tickets are:   "+tickets);
				}
				reqtick=c.nextInt();
				
			}
			
		}
		
		else
		{
			System.out.println("Sorry!! please select the correct train");
			System.out.println("Currently, the only available trains are Rajadhani & Visaka");
		}
		
		t=c.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("invalid number: " +e);
		}
		
	}
	
}