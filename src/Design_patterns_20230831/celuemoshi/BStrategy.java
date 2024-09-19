package Design_patterns_20230831.celuemoshi;

public class BStrategy implements  Strategy
{
	@Override
	public void execute(User u)
	{
		System.out.println(u.getName()+"77777");
	}
}
