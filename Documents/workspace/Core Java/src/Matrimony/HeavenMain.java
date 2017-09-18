package Matrimony;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class HeavenMain {

		static ArrayList<Customers> custList;

		public static void main(String[] args) {
			Customers customer;
			custList = new ArrayList<Customers>();

			System.out.println("Welcome To Made In Heaven Registration System!!!");

			while (custList.size() <2) {
				System.out.println("\nEnter The Customer First Name, LastName, Phone, Hobby seperated by commas(,) !!");
				String input = new Scanner(System.in).nextLine();
				String[] split = input.split(",");
				
				if(!compareName(split, custList)){
					customer = new Customers();
					customer.setFistName(split[0]);
					customer.setLastName(split[1]);
					customer.setTelephone(split[2]);
					customer.setHobby(split[3]);

					custList.add(customer);
				}else{
					System.out.println("\nCustomer Already Exist !!! Please Enter New Customer Details ");
					
				}
			}
			
			System.out.println("\n ***** Welcome to Find Match Feature !!! *******");
			System.out.println("\n Enter Hobby to Search !!");
			String search = new Scanner(System.in).nextLine();
			findMacth(search, custList);

		}

		private static void findMacth(String search, ArrayList<Customers> custList2) {
			System.out.println("Below is your customer match ");
			for (int i=0; i<custList2.size();i++){
				if(custList2.get(i).getHobby().equalsIgnoreCase(search)){
					System.out.println(custList2.get(i).getFistName()+" "+custList2.get(i).getLastName());
				}
				else{
					System.out.println("Sorry, No customer match found !!");
				}
			}
		}

		private static boolean compareName(String[] split,
				ArrayList<Customers> custList2) {

			if (custList2.size() == 0) {
				return false;
			} else {
				for (int i = 0; i < custList2.size(); i++) {
					if (custList2.get(i).getFistName().equalsIgnoreCase(split[0])
							&& custList2.get(i).getLastName()
									.equalsIgnoreCase(split[1])) {
						return true;
					}
				}

			}
			return false;

		}
	}

