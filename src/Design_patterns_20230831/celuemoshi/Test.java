package Design_patterns_20230831.celuemoshi;

/**
 * 策略模式 行为设计模式  我们代码里有大量的 if else switch 可以通过使用策略模式,避免大量条件语句的使用
 * 主要目的解耦多个策略,并方便在针对不同场景灵活切换不同的策略
 */
public class Test
{
	public static void main(String[] args)
	{
		User user = new User("A", "全福平");
		execute(user);
	}


	public static void execute(User user){
		String type = user.getType();
		Strategy strategy = StrategyFactory.getStrategy(type);
		 strategy.execute(user);
	}
}
