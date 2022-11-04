class loop extends Thread
{
	public static void main(String asd[])
	{
		System.out.println("Welcom to main");
		int i;
		Thread T=new Thread();
		T=Thread.currentThread();
		System.out.println(T);
		try
		{
			for(i=0;i<60;i++)
			{
				System.out.println(i);
				Thread.sleep(2);
			}
		}
		catch(Exception x)
		{
			System.out.println(x);
		}
	}
}
