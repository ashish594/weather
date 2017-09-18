package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo {

	public static void main(String[] args) {
		
		List<Integer> values= Arrays.asList(1,2,3,4,5);
		
//		for(int i: values){
//			System.out.println("array elements are:" +i);
//		}
		
		
		
//		Consumer<Integer> c=new Consumer<Integer>(){        // regular Consumer interface
//			
//					public void accept(Integer i){
//						System.out.println(i);
//					}
//				};
//		values.forEach(c);
		
		
		
		
//		Consumer<Integer> c=i -> System.out.println(i);    // consumer interface using Lambda expression
//		values.forEach(c);
		
		
		
//		values.forEach(i -> doubleit(i));		    	  // forEach method using Lambda expression
		
		
		values.forEach(LambdaDemo::doubleit);   		  //  forEach method using method reference with the function definition
		
		
//		values.forEach(System.out::println);  			  // forEach method using method reference
	}	
	
	public static void doubleit(int i){
		
		System.out.println(i*2);
	}
	
	

}
