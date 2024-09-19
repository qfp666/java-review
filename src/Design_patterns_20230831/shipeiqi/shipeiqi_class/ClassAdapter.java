package Design_patterns_20230831.shipeiqi.shipeiqi_class;

/**
 * 类适配器
 */
public class ClassAdapter extends TypecAdaptee implements UsbTarget
{

	@Override
	public void usb()
	{
		//拿到typeC数据做下转换处理
		super.typeC();
		System.out.println("typeC-usb");
	}
}
