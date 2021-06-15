
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Approach - 1 Summation Formula / Addition - Based Solution
		/*
		int arr[] = {2, 1, 3, 5, 6};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		
		int n = arr.length + 1;
		int total = n * (n + 1)/2;
		
		System.out.println("Missing Number "+(total - sum));*/
		
		//Approach - 2 X-OR Based Approach
		
		int arr[] = {2, 1, 3, 5, 6};
		int x = 0;
		int y = 0;
		int min = 1;
		int max = 6;
		
		for(int i = 0; i < arr.length; i++) {
			x = x ^ arr[i];
		}
		
		for(int i = min; i <= max; i++)
		{
			y = y ^ i;
		}
		
		System.out.println("Missing Number "+(x ^ y));
		
				
	}

}
