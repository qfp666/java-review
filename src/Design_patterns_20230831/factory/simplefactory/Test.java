package Design_patterns_20230831.factory.simplefactory;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 创建新模式:单例 工厂(简单工厂)
 * 结构性模式:适配器模式 代理模式
 * 行为模式:策略模式
 */
public class Test
{
	public static void main(String[] args)
	{
		Shape rectangle = ShaperFactory.createShape("rectangle");
		rectangle.draw();
		Shape circle = ShaperFactory.createShape("circle");
		circle.draw();
	}
}
