package Thread_20230726.callable_runnable_02;

import java.util.concurrent.Callable;

public class CallableTest implements Callable
{
	@Override
	public Integer call() throws Exception
	{
		int sum  = 0;
		for(int i=0;i<10;i++){
			System.out.println("777");
			sum+=i;
		}
		return sum;
	}
}
