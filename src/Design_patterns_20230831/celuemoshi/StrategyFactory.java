package Design_patterns_20230831.celuemoshi;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory
{
	private static final Map<String,Strategy> strategies = new HashMap();
	static{
		strategies.put("A",new AStrategy());
		strategies.put("B",new BStrategy());
	}

	public static Strategy getStrategy(String type){
		return strategies.get(type);
	}
}
