class one extends Thread
{
	public one()
	{
		System.out.println("Welcome to one");
                start();
	}
	public void run()
	{
		try
		{
			int i;
			for(i=0;i<6;i++)
			{
				System.out.println("One"+i);
			}
		}
		catch(Exception z)
		{
                	System.out.println(z);
		}
	}
}
class two
{
	public static void main(String asd[])
	{
		System.out.println("Welcome to main");
		one o1=new one();
		System.out.println("Again to main");
		try
		{
			int i;
			for(i=0;i<5;i++)
			{
				System.out.println("Mai:"+i);
			}
		}
		catch(Exception z)
		{
			System.out.println(z);
		}
	}
}



