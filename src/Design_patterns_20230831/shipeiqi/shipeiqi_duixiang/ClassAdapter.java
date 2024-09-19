package Design_patterns_20230831.shipeiqi.shipeiqi_duixiang;

/**
 * 对象适配器
 */
public class ClassAdapter  implements UsbTarget
{

	private TypecAdaptee typecAdaptee;

	public ClassAdapter(TypecAdaptee typecAdaptee)
	{
		this.typecAdaptee = typecAdaptee;
	}

	@Override
	public void usb()
	{
		//拿到typeC数据做下转换处理
		this.typecAdaptee.typeC();
		System.out.println("typeC-usb");
	}
}
