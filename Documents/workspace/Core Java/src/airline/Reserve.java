package airline;

public class Reserve {

	public boolean validateSeat(int seatno, Customers[] cust) {
		for (int i = 0; i < cust.length; i++) {
			Customers checkseat = cust[i];
			if (checkseat != null && checkseat.getSeatnumber() == seatno)
				return true;
			else
				return false;
		}
		return true;
	}

	public boolean book(Customers[] cust) {
		for (int i = 0; i < cust.length; i++) {
			Customers checkseat = cust[i];
			if (checkseat != null) {
				System.out.println("Sorry!!  This seat is already taken");
				System.out.println("please select the another seat");
				return false;
			} else {
				checkseat.setSeatnumber(checkseat.getSeatnumber());
				checkseat.setName(checkseat.getName());
				checkseat.setPassport(checkseat.getPassport());
			}
		}

		return true;
	}

	public boolean cancels(int selectseat, Customers[] cust) {
		for (int i = 0; i < cust.length; i++) {
			Customers checkseat = cust[i];
			if (checkseat != null && checkseat.getSeatnumber() == selectseat) {
				
				System.out.println("Your seat booking has been cancelled with details: \n" + checkseat.toString());
				System.out.println("Thank you for contcatcing our Airlines");
				cust[i] = null;
				return true;
			} else
				System.out.println("This seat is not booked yet");
		}
		return true;
	}

	public void swap(int currentseat, int reqseat, Customers[] cust) {
		int count = 0;
		for (int i = 0; i < cust.length; i++) {
			if (cust[i] != null && cust[i].getSeatnumber() == reqseat) {
				System.out.println("seat is already taken");
				System.out.println("please select another seat");
				count++;
			}
		}

		if (count != 0)
			System.out.println("seat" + reqseat + "is already taken!! ");
		else {
			for (int i = 0; i < cust.length; i++) {
				if (cust[i] != null && cust[i].getSeatnumber() == currentseat) {
					cust[i].setSeatnumber(reqseat);
					System.out.println("The seat number  " + currentseat + "is changed to   " + reqseat);
				}
					System.out.println(cust[i].toString());
					
			}
		}
	}
}
