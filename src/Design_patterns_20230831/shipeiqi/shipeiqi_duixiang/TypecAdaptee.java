package Design_patterns_20230831.shipeiqi.shipeiqi_duixiang;

/**
 * 适配者类       我只有usb  但是有人拿着type-c的手机告诉我我也想充电
 */
public class TypecAdaptee
{
	public void typeC(){
		System.out.println("Type-C充电");
	}
}
