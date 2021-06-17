
public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 2, 2, 3};
		int val = 3;
		
		int i = 0;
		
		for(int j = 0; j < arr.length; j++)
		{
			if(arr[j] != val)
			{
				arr[i] = arr[j];
				i++;
			}
		}
		
		System.out.println(i);
		
		/*
		for(int n : arr)
		{
			System.out.print(n+" ");
		}
		*/

	}

}
