import java.io.*;

class Dog 
{
	transient int i=10;
	
}
class cat extends Dog implements Serializable
{
	 int j=20;
}
public class SerilazationDemo {

	public static void main(String[] args) throws Exception{
		cat d=new cat();
		d.i=111;
		d.j=222;
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		cat d2=(cat)ois.readObject();
		System.out.println(d2.i+"..."+d2.j);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
