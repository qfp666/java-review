package Design_patterns_20230831.daili.daili;

public class appleTestProxy implements apple
{

	private appleEat appleEat;

	private Integer num;

	private static Integer count = 10;

	public appleTestProxy(Integer num)
	{
		this.num = num;
	}

	@Override
	public void eatApple()
	{
		if(appleEat != null){
			appleEat  = new appleEat(num);
		}
		appleEat.eatApple();
		System.out.println("还剩下"+(count-num)+"苹果");
	}
}
