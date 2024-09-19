package Design_patterns_20230831.shipeiqi.shipeiqi_duixiang;




public class Test
{
	public static void main(String[] args)
	{
		TypecAdaptee typecAdaptee = new TypecAdaptee();
		ClassAdapter classAdapter = new ClassAdapter(typecAdaptee);
		classAdapter.usb();
	}
}
