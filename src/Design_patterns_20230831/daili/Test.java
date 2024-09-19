package Design_patterns_20230831.daili;

import jdk.nashorn.internal.ir.CallNode;

public class Test
{
	public static void main(String[] args)
	{
		DocumentProxy helloWorld = new DocumentProxy("hello world");
		helloWorld.displayContent();
		helloWorld.displayContent();
	}

}
