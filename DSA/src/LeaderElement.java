
public class LeaderElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach - 1 Brute Force Approach -O(N ^ N)
		/*
		int arr[] = {16, 19, 4, 7, 3};
		int j;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(j = i + 1; j < arr.length; j++)
			{
				if(arr[i] <= arr[j])
				{
					break;
				}
			}
			
			if(j == arr.length) {
				System.out.println("This is Leader "+arr[i]);
			}
		}*/
		
		//Approach - 2 - O(N)
		int arr[] = {16, 19, 4, 7, 3};
		int max = 0;
		
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] > max)
			{
				System.out.println("This is Leader "+arr[i]);
				max = arr[i];
			}
		}

	}

}
