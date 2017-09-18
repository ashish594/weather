package airline;

public interface IReserve {
	public boolean book(Customers seat);

	public boolean cancels(int seat);

	public void swap();
}
