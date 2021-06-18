import java.util.Arrays;
import java.util.HashMap;

public class SmallerNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {8, 1, 2, 2, 3};
		int org[] = arr.clone(); //keep the clone in org[]
		
		//sort Array
		Arrays.sort(arr);
		
		//arr: 1, 2, 2, 3, 8
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++)
		{
			if(map.get(arr[i]) == null)
			{
				map.put(arr[i], i);
			}
		}
		
		int output[] = new int[arr.length];
		
		for(int i = 0; i < org.length; i++)
		{
			output[i] = map.get(org[i]);
		}
		
		int result[] = new int[arr.length];
		int index = 0;
		
		for(int i : output)
		{
			result[index] = i;
			index++;
		}
		
		for(int i : output)
		{
		System.out.print(i+" ");
		}
				
		/*
		 * //O(N ^ 2)
		int count= 0;
		int index = 0;
		
		int output[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++, index++)
		{
			count = 0;
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					count++;
				}
			}
			
			output[index] = count;
		}
		
		System.out.println("Array ");
		for(int i : output)
		{
			System.out.print(i+" ");
		}
		*/
	}

}
