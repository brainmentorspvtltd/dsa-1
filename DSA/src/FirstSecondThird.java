
public class FirstSecondThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2, 13, 4, 1, 6, 28};
		
		int first = arr[0];
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > first)
			{
				third = second;
				second = first;
				first = arr[i];
			}
			else if(arr[i] > second)
			{
				third = second;
				second = arr[i];
			}
			else if(arr[i] > third)
			{
				third = arr[i];
			}
		}
		
		System.out.println("First Largest "+first);
		System.out.println("Second Largest "+second);
		System.out.println("Third Largest "+third);
		
	}

}
