package Matrimony;

import java.util.Scanner;

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalcust=0;
		Dto d=new Dto();
		while(totalcust<2)
		{
		Scanner input=new Scanner(System.in);
		String name=input.next();
		d.setName(name);
		if(name==null || d.getName().equalsIgnoreCase(name))
			continue;
		else
		{
			System.out.println("please enter the name");
		}
		totalcust++;
		}
		
	}
	

}
