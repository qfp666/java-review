package Design_patterns_20230831.factory.simplefactory;

public class ShaperFactory
{
	public static Shape createShape(String type){
		if(type.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}else if(type.equalsIgnoreCase("Circle")){
			return new Circle();
		}else{
			throw new IllegalArgumentException("Shape type not recognized");
		}
	}
}
