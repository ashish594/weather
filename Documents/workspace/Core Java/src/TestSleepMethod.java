
public class TestSleepMethod extends Thread{

	
		// TODO Auto-generated method stubclass TestSleepMethod1 extends Thread{  
		 public void run(){  
			  for(int i=1;i<5;i++){  
			    try{Thread.sleep(500);}
			    catch(InterruptedException e){System.out.println(e);}  
			    System.out.println(i);  
			  }  
			 }  
		 public static void main(String[] args) throws InterruptedException {
			  TestSleepMethod t1=new TestSleepMethod();  
			  TestSleepMethod t2=new TestSleepMethod();  
			   
			  t1.start();  
			  //t1.join();
			  t1.start();  
			 }  
		

	}

