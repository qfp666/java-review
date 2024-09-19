package Design_patterns_20230831.singleton;

/**
 * 懒汉式
 */
public class SingleTon
{
	public static SingleTon singleTon;

	public SingleTon(){

	}

	public static SingleTon getInstance(){
		 if(singleTon ==null){
			 synchronized (SingleTon.class){
				 if(singleTon ==null){
					 singleTon = new SingleTon();
				 }
			 }
		 }
		 return singleTon;
	}
}
