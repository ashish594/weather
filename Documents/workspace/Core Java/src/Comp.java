import java.util.Comparator;

public class Comp implements Comparator<Integer>{
//	public int compare(int s1, int s2){
//		if(s1>s2)
//			return 1;
//		return -1;
//		
	
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1%10>o2%10)
		return 0;
		else
		return -1;
	}
}
