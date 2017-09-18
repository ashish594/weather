
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
//import java.util.List;

public class Demo {
	
	public static void main(String[] args) 
	{
	
		Set<Integer> values=new LinkedHashSet<Integer>();
	
			System.out.println(values.add(10));
			values.add(12);
			values.add(10);
			values.add(328);
			values.add(10);		
			values.add(328);
		values.add(231);
		values.add(126);
		values.add(149);
	values.add(15);
	List<Integer> s=new ArrayList<>();
		//Collections.sort(values);
	//	Comparator<Integer> com = new Comparator<Integer>()
		//		{
//	//	public int compare(Integer o1, Integer o2) {
//			// TODO Auto-generated method stub
//			if(o1%10>o2%10)
//			return 0;
//			else
//			return -1;
//		}
//				};
//		
//		Collections.sort(values, com);
		
		//values.forEach(System.out::println);
		
////		Iterator i = values.iterator();
////		while(i.hasNext())
////		System.out.println(i.next());
////		
		for(int i : values)
		{
		System.out.println(i);
		}
	}
}


	

