package Design_patterns_20230831.celuemoshi;

public class AStrategy implements Strategy
{
	@Override
	public void execute(User u)
	{
		System.out.println(u.getName()+"6666");
	}
}
