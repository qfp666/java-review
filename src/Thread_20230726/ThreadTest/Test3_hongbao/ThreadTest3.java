package Thread_20230726.ThreadTest.Test3_hongbao;

import java.util.Random;

public class ThreadTest3 extends  Thread
{

	 static double money = 100;
	 static int count = 3;
	 static Object obj = new Object();
	 static final  double MIN  =0.01;

	@Override
	public void run()
	{
		synchronized (obj){
			if(count==0){
				System.out.println(getName()+"没有抢到红包");
			}else{
				double prize = 0;
				if(count==1){
					prize = money;
				}else{
					Random rd = new Random();
					double bounds = money-(count-1)*MIN;
					//prize = rd.nextDouble(bounds);//jdk 17 才有这个方法现在没有所以报错
					if(prize<MIN){
						prize = MIN;
					}
				}
				money = money-prize;
				count--;
				System.out.println(getName()+"抢到了"+prize+"钱");
			}
		}
	}
}
