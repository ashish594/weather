
public class StaticDemo 
{
	static int i ;
	static {
		m();
		System.out.println("first static block");
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticDemo obj = new StaticDemo();
		obj.n();
		System.out.println("main block");
m();
	}

	public static void m() {
		//System.out.println(i);
		System.out.println(j);
	}

	public void n() {
		System.out.println("ashish");
	}

	static {
		System.out.println("second static block");
		//System.out.println(j);
	}
	static int j = 20;
}
