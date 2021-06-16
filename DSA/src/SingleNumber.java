
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4, 1, 2, 1, 2};
		int result = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			result ^= arr[i];
		}
		
		System.out.println("Single Number "+result);
		
		/*
		 * Approach - 2 , X-OR Based Approach, O(N)
		 * 1 ^ 1- 0
		 * 2 ^ 2- 0
		 * 4 ^ 1- 5
		 * 0100
		 * 0001
		 * 0101-5
		 * */
		
		/*
		 * Approach - 1, Brute Force Approach O(N ^ N)
		int count = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			
			if((count % 2) != 0) {
				System.out.println("Single Number "+arr[i]);
				return;
			}
		}
		*/

	}

}
