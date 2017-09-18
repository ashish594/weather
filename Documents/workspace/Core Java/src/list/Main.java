package list;

public class Main {

	public static void main(String[] args) {
		Television product=new Television();
		Employee emp=new Employee();
		product.setSize(32);
		product.setColor("black");
		product.setType("plasma");
		System.out.println(product);
		// TODO Auto-generated method stub
		emp.update(product);
		System.out.println(product);

	}

}
