import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Test3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		while(true){
			int i = scanner.nextInt();
			if((i&1)==1){
				System.out.println("奇数");
			}else{
				System.out.println("偶数");
			}
		}
	}
}
