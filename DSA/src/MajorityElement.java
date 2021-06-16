
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 2, 3};
		int m = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(count == 0)
			{
				m = arr[i];
				count += 1;
			}
			else {
				if(m == arr[i])
				{
					count++;
				}
				else {
					count--;
				}
			}
		}
		
		count = 0; // reassign
		
		for(int i = 0; i < arr.length; i++)
		{
			if(m == arr[i])
			{
				count++;
			}
			if(count > (arr.length)/2)
			{
				System.out.println("Majority Element "+m);
				return;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Approach -1 , O(N ^ N)
		int mCount = arr.length/2;
		
		for(int i : arr)
		{
			int count = 0;
			for(int element : arr)
			{
				if(element == i)
				{
					count += 1;
				}
			}
			
			if(count > mCount)
			{
				System.out.println("Majority Element "+i);
				break;
			}
		}
		*/
		
	}

}
