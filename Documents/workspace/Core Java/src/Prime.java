import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,count=0,m=0;
		System.out.println("enter the no");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=n/2;
		for(i=2;i<=m;i++){
			if(n%i==0){
				System.out.println("not a prime no");
				count++;
				break;
			}
		}
			if(count==0)
				System.out.println("prime no");
			
			
		



	}
	}
