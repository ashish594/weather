package Matrimony;

import java.util.Arrays;

public class Method1 {
	

	int i,j;
	public String name[]={"ashish","ajay","jai","jai","",""};
	public long number[]={123,234,134,245,324,456};
	public String hobby[]={"play","play","read","fitness"};
	
	
	
	public void validateName()
	{
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(hobby));

		for (int i = 0; i < name.length; i++) {
			
			for (int k = i+1; k < name.length; k++) {
				if (name[i] != name[k]) {
				}
				else if(name[i]==name[k])
				System.out.println("Name is already taken");
			}
		}
	}	
		
		
		public void findMatch()
		{
			for (int i = 0; i < hobby.length; i++) {
				
				for (int k = i+1; k < hobby.length; k++) {
					if (hobby[i] != hobby[k]) {
						System.out.println("hobbies not matched");
					}
					else if((hobby[i])==hobby[k])
					System.out.println("Perfect match");
				//	System.out.println(Arrays.toString(name));
				}
			}
		}	
		}
		

	
	
	



