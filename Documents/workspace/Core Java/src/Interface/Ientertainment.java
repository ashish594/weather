package Interface;

public interface Ientertainment {
	public void audio();
	public void movie();
	default void sound(){
		System.out.println("Entertainment Sound");
	}
}
