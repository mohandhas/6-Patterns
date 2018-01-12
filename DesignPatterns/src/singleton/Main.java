package singleton;

public class Main extends Thread{
	
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			Singleton obj= Singleton.objCreation();
			System.out.println(obj);
			
		}
	}

	public static void main(String[] args)
	{
		Main th1= new Main();
		Main th2= new Main();
		th1.start();
		th2.start();
	}
			
}
