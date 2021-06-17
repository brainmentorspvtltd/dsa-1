
public class PairSumApproach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//O(N)
		int arr[] = {2, 9, 6, 3, 1, 10, 4};
		int k = 9;
		
		int hash[] = new int[100];
		
		for(int i = 0; i < arr.length; i++)
		{
			int index = k - arr[i]; // 7
			
			if(hash[index] == 1) {
				System.out.println("Pair is "+arr[i]+" "+index);
				return;
			}
			
			hash[arr[i]] = 1;
		}

	}

}
