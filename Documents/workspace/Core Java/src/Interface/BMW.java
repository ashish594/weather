package Interface;

public  class BMW implements Icar,Ientertainment{
	public void start()
	{
		System.out.println("BMW Start");
	}
	public void stop()
	{
		System.out.println("BMW stop");
	}
	public void turn()
	{
		System.out.println("BMW turn");
	}
	 public void reverse()
	{
		System.out.println("BMW reverse");
	}
	public void ac()
	{
		System.out.println(" BMW Air conditioning");
	}
	public void audio()
	{
		System.out.println("BMW audio");
	}
	public void movie()
	{
		System.out.println(" BMW movie");
	
	}
	public void sound()
	{
		Ientertainment.super.sound();
		System.out.println("beats sound");
	}

}
