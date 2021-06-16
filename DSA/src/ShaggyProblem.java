
public class ShaggyProblem {
	
	public static boolean isReachToLeaf(int leaf)
	{
		int x = 1;
		
		if(x == leaf)
		{
			System.out.println("X is "+x+" and Leaf "+leaf);
			return true;
		}
		
		while(x < leaf)
		{
			x  = x * 2;
			
			if(x == leaf)
			{
				System.out.println("X is "+x+" and Leaf "+leaf);
				return true;
			}
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result = isReachToLeaf(64);
		
		System.out.println(result);

	}

}
