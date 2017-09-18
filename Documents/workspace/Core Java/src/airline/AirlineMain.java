package airline;

import java.util.Scanner;

public class AirlineMain {

	public static void main(String[] args) {

		Reserve res = new Reserve();

		Scanner input = new Scanner(System.in);

		Customers cust[] = new Customers[5];

		int i = 0;
		
		while (i < 5) {
			cust[i] = new Customers();
			System.out.println("please select the option");
			System.out.println("1.book 2.cancel 3.swap 4.display 5.exit");
			int select = input.nextInt();

			switch (select) {
			case 1:
				System.out.println("please enter your name");
				String name = input.next();
				
				

				int seatno = typeseat(input);
				boolean doesseatexist = res.validateSeat(seatno, cust);
				if (doesseatexist) {
					System.out.println("seat already booked");
					System.out.println("please select another seat");
					continue;
				}
				

				System.out.println("please enter your passport number");
				String passport = input.next();
				
				break;
				
			case 2:
				System.out.println("please enter the seat to be cancelled");
				int cancelseat = input.nextInt();
				boolean canseat = res.cancels(cancelseat, cust);
				if (canseat)
					System.out.println("you have successfully cancelled the ticket ");
				break;

			case 3:
				System.out.println("select the current seat");
				int curseat = input.nextInt();
				System.out.println("select the required seat");
				int reseat = input.nextInt();
				res.swap(curseat, reseat, cust);
				break;

			case 4:
				for (int j = 0; j < cust.length; j++) {
					if (cust[j]!=null&&cust[j].getSeatnumber() !=0 ) {
						System.out.println("customer details are:\n" + cust[j].toString());
					}
				}
				break;
				
			case 5:
				System.exit(0);
			}
			i++;

		}

	}

	private static int typeseat(Scanner input) {
		int seatno=0;
		try{
		System.out.println("please enter your seat number");
		seatno = input.nextInt();
		seatno++;
		}
		catch(Exception e)
		{
			System.out.println("invalid seatno");
		}
		return seatno;
	}
}
