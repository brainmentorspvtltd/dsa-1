import java.util.Arrays;

public class PairSumApproach3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Two - pointer approach
		int arr[] = {2, 9, 6, 3, 1, 10, 4};
		int k = 9;
		int i = 0;
		int j = arr.length - 1;
		
		//sort
		Arrays.sort(arr);
		
		while(i < j)
		{
			if(arr[i]+arr[j] == k)
			{
				System.out.println("Pair is "+arr[i]+" "+arr[j]);
				return;
			}
			else if(arr[i]+arr[j] < k)
			{
				i++;
			}
			else if(arr[i]+arr[j] > k)
			{
				j--;
			}
		}
		
	}

}
