package mianshi;

import java.util.Arrays;

public class mianshiTest1
{
	public static void main(String[] args){
		int[] ls = {58,55,57,58,60};
		int t = 174;
		int k = 3;
		System.out.println(chooseBaseSum(t,k,ls));
	}

	private static int  chooseBaseSum(int t, int k, int[] ls)
	{
		int maxSum = 0;
		for(int i=0; i<ls.length; i++){
			for(int j=i+1; j<ls.length; j++){
				for(int c=j+1; c<ls.length; c++){
					int sum = ls[i]+ls[j]+ls[c];
					if(sum<t){
						maxSum = Math.max(maxSum,sum);
					}
				}
			}
		}
		return maxSum;
	}

}
