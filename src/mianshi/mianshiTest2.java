package mianshi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;

public class mianshiTest2
{
	static List<List<Integer>> result = new ArrayList<>();
	static LinkedList<Integer> path = new LinkedList<>();
	public static void main(String[] args)
	{
		int[] distances = {58, 55, 57, 58, 60};
		int l = distances.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输出最多旅行几个城市");
		int k = sc.nextInt();
		int MaxSum = 174;
		int maxDistance = getMaxDistance(distances, l, k, MaxSum);
		System.out.println("旅行最大距离为"+maxDistance);
	}

	public static int getMaxDistance(int a[],int n,int k,int MaxSum){
		        backTracking(a,n,k,0);
				int sum=0;
				int MaxSum2 = 0;
				for(List<Integer> list: result){
					for(int i=0;i<list.size();i++){
							sum+=list.get(i);
					}
					if(sum<MaxSum){
					       MaxSum2 = Math.max(MaxSum2,sum);
						   sum=0;
					}
				}
				return MaxSum2;
	}

	private static void backTracking(int[] a, int n, int k, int startIndex)
	{
		   if(path.size()==k){
			   result.add(new ArrayList<Integer>(path));
			   return ;
		   }
		   for(int i=startIndex;i<n-(k- path.size())+1;i++){
			   path.add(a[i]);
			   backTracking(a,n,k,i+1);
			   path.removeLast();
		   }
	}

}
