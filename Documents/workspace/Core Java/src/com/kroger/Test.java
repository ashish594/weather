package com.kroger;




import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Test {

	public static void getString(int x) {

		LinkedHashMap<Integer, Integer> posMap = new LinkedHashMap<Integer, Integer>();
		int pos = 1;
		while (x > 0) {
			posMap.put(pos, x % 10);
			x = x / 10;
			pos++;
		}

//		System.out.println("posMap " + posMap);
		
		ArrayList<Integer> positions = new ArrayList<Integer>(posMap.keySet());
		Collections.reverse(positions);
	
		for (Integer posit: positions) {
			int posi = posMap.get(posit);
			switch (posit) {
			case 6:
				System.out.print(getNumbers(posi) + " hundred and ");
				break;
			case 5:
		
					System.out.print(ge10tNumbers(posi) + " ");
					break;
			
			case 4:
					System.out.print(getNumbers(posi) + " thousand");
					break;
			case 3:
					System.out.print(getNumbers(posi) + " hundred and ");
					break;
			
			case 2:
					System.out.print(ge10tNumbers(posi) + " ");
					break;
				
			case 1:
					System.out.print(getNumbers(posi));
				
			}
		}

	}

	public static String getNumbers(int x) {
		switch(x) {
		case 9: return "Nine";
		case 8: return "Eight";
		case 7: return "Seven";
		case 6: return "Six";
		case 5: return "Five";
		case 4: return "Four";
		case 3: return "Three";
		case 2: return "Two";
		case 1: return "One";
		default: return "Zero";
		}
	}
	
	public static String ge10tNumbers(int x) {
		switch(x) {
		case 9: return "Ninty";
		case 8: return "Eighty";
		case 7: return "Seventy";
		case 6: return "Sixty";
		case 5: return "Fifty";
		case 4: return "Forty";
		case 3: return "Thirty";
		case 2: return "Twenty";
		case 1: return "Ten";
		default: return "Zero";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getString(654321);
		getString(600321);
	}

}

