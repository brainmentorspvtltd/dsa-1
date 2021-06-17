
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5};
		//output- {0, 1, 2, 3, 4, 5,_,_,_,_,_};
		
		if(arr.length == 0)
		{
			return;
		}
		
		int i = 0;
		for(int j = 1; j < arr.length; j++)
		{
			if(arr[j] != arr[i])
			{
				i++;
				arr[i] = arr[j]; 
			}
		}
		
		System.out.println("Output is "+(i + 1));
		
		/*for(int n : arr) {
			System.out.print(n+" ");
		}*/

	}

}
