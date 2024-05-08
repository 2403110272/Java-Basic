
package AnonymousC;

public class HomeDemo
{
	public static void main(String[] args)
	{
		Home home = new Home();

		home.useMethod();
		
		home.useLocalVariable();

		home.useParameter(new RemoteControl() 
		{
			@Override
			public void turnOn() 
			{
				System.out.println("난방을 켭니다.");
			}
			@Override
			public void turnOff()
			{
				System.out.println("난방을 끕니다.");
			}
		});
	}
}
