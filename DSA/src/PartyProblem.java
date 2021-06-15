import java.util.HashMap;

public class PartyProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Approach - 1 (O(N ^ N))
		/*int arr[] = {1, 2, 3, 4, 2, 7, 55, 1000, 444};
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("Boys Party");
					return;
				}
			}
			
		}
		
		System.out.println("Girls Party");*/
		
		//Approach - 2 O(N)
		
		/*int arr[] = {1, 2, 3, 4, 7, 55, 1000, 444};
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++)
		{
			if(map.get(arr[i]) != null)
			{
				System.out.println("Boys Party");
				return;
			}
			
			map.put(arr[i], true);
		}
		
		System.out.println("Girls Party");*/
		
		//Approach - 3 O(N)
		
		int arr[] = {1, 2, 3, 4, 2, 7, 55, 1000, 444};
		int hash[] = new int[1001];	// 1001 default 0	
		
		for(int i = 0; i < arr.length; i++)
		{
			if(hash[arr[i]] != 0)
			{
				System.out.println("Boys Party");
				return;
			}
			hash[arr[i]] = 1;
		}
		
		System.out.println("Girls Party");

	}

}
