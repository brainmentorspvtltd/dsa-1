package com.dit.dsa.dp;

public class SubsetSumRecursive {
	
	public static boolean subsetSum(int set[], int n, int sum)
	{
		//reach to the end of the sum (so subset sum exist)
		if(sum == 0)
		{
			return true;
		}
		
		//if n is 0 but still sum not 0 so no subset exist
		if(sum > 0 && n == 0)
		{
			return false;
		}
		
		//If the last element is greater than sum, then ignore it
		if(set[n - 1] > sum)
		{
			return subsetSum(set, n - 1, sum);
		}
		//else check sum is obtained or not
		return subsetSum(set, n - 1, sum) || subsetSum(set, n - 1, sum - set[n- 1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int set[] = {2, 1, 3, 5};
		int sum = 4;
		
		System.out.println(subsetSum(set, set.length, sum));

	}

}
