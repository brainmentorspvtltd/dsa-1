
public class RotateArray {
	
	public static void reverse(int arr[], int index, int n)
	{
		for(int i = index; i < n; i++)
		{
			int temp = arr[i];
			arr[i] = arr[n];
			arr[n--] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {90, 1, 20, 2, 4, 6, 100};
		int rotateTimes = 2;
		
		
		reverse(arr, 0, rotateTimes-1); // 1, 90, 20, 2, 4, 6, 100
		
		System.out.println("Updated Array");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
		reverse(arr, rotateTimes, arr.length-1); // 1, 90, 100, 6, 4, 2, 20
		
		System.out.println("\nUpdated Array");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
		reverse(arr, 0, arr.length-1); // 20, 2, 4, 6, 100, 90, 1
		
		System.out.println("\nUpdated Array");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		

	}

}
