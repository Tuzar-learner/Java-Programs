package Program;
class Char extends Thread
{
	public void run() 
	{
		for(char i='a';i<='e';i++)
		{
			try {
				System.out.println(i);
				Thread.sleep(100);
			}
			catch(Exception e) {}
			
		}
	}
}
class Num extends Thread
{ 
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				System.out.println(i);
				Thread.sleep(500);
			}
			catch(Exception e) {}
			
		}
	}
}

public class Multi_Threading_2 {

	public static void main(String[] args) {
		Char ch = new Char();
		Num num = new Num();
		try {
			 
			 ch.start();
			 num.start(); 
			 ch.join();
			 num.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		
		}

	}

}