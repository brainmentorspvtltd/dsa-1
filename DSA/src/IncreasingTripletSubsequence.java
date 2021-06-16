
public class IncreasingTripletSubsequence {
	
	public static boolean findSortedTriplet(int arr[])
	{
		int num1, num2;
		
		num1 = num2 = Integer.MAX_VALUE;
		
		for(int num : arr)
		{
			if(num <= num1)
			{
				num1 = num; // 5, 4, 3, 1
			}
			else if(num <= num2) 
			{
				num2 = num; // 7, 6
			}
			else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5, 4, 3, 7, 6, 1, 9};
		//1, 6, 9
		
		boolean result = findSortedTriplet(arr);
		
		System.out.println(result);

	}

}
