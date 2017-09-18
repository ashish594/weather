package Interface;

public interface Icar {
	public void start();
	public void stop();
	public void turn();
	public void reverse();
	default void sound(){
		System.out.println("Car Sound");
	}
	static void color()
	{
		System.out.println("car color");
	}
}
