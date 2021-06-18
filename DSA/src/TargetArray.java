import java.util.ArrayList;

public class TargetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {0, 1, 2, 3, 4};
		int index[] = {0, 1, 2, 2, 1};
		
		ArrayList<Integer> target = new ArrayList<>();
		
		if(nums.length == index.length)
		{
			for(int i = 0; i < nums.length; i++)
			{
				target.add(index[i], nums[i]);
			}
			
			System.out.println(target);
		}	
	}

}
