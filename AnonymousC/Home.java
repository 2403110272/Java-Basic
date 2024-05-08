package AnonymousC;

public class Home 
{
	private RemoteControl rc = new RemoteControl() 
	{
		@Override
		public void turnOn() 
		{
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() 
		{
			System.out.println("TV를 끕니다.");
		}
	};

	public void useMethod() 
	{
		rc.turnOn();
		rc.turnOff();
	}
	

	public void useLocalVariable()
	{

		RemoteControl rc = new RemoteControl() 
		{
			@Override
			public void turnOn()
			{
				System.out.println("에어컨을 켭니다.");
			}
			@Override
			public void turnOff()
			{
				System.out.println("에어컨을 끕니다.");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
	

	public void useParameter(RemoteControl rc) 
	{
		rc.turnOn();
		rc.turnOff();
	}
}