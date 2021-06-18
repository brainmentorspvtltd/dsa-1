
public class SortArrayParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 1, 2, 4}; // sort-even-odd
		int output[] = new int[arr.length];
		int t = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i]%2 == 0)
			{
				output[t++] = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i]%2 == 1)
			{
				output[t++] = arr[i];
			}
		}
		
		System.out.println("Sorted Parity Array");
		for(int i : output)
		{
			System.out.print(i+" ");
		}

	}

}
