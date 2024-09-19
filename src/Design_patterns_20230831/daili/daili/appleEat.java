package Design_patterns_20230831.daili.daili;

public class appleEat implements  apple
{
	private Integer num;

	public appleEat(Integer num)
	{
		this.num = num;
	}

	@Override
	public void eatApple()
	{
		System.out.println("i eat"+num+"个苹果");

	}
}
