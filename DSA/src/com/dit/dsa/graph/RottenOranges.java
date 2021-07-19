package com.dit.dsa.graph;

public abstract class RottenOranges {
	
	static int row = 3;
	static int col = 5;
	
	public static boolean isSafe(int i, int j)
	{
		if(i >= 0 && i < row && j >= 0 && j < col)
		{
			return true;
		}
		
		return false;
	}
	
	public static int rotOrange(int v[][])
	{
		boolean changed = false;
		int num = 2;
		
		while(true)
		{
			for(int i = 0; i < row; i++)
			{
				for(int j = 0; j < col; j++)
				{
					//rot all oranges present at top, bottom, left, right
					if(v[i][j] == num)
					{
						// right
						if(isSafe(i + 1, j) && v[i+1][j] == 1)
						{
							v[i+1][j] = v[i][j] + 1;
							changed = true;
						}
						//bottom
						if(isSafe(i, j + 1) && v[i][j+1] == 1)
						{
							v[i][j+1] = v[i][j] + 1;
							changed = true;
						}
						//left
						if(isSafe(i - 1, j) && v[i-1][j] == 1)
						{
							v[i-1][j] = v[i][j] + 1;
							changed = true;
						}
						//top
						if(isSafe(i, j - 1) && v[i][j-1] == 1)
						{
							v[i][j-1] = v[i][j] + 1;
							changed = true;
						}
					}
				}
			}
			if(!changed)
			{
				break;
			}
			
			changed = false;
			num++;
		}
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				if(v[i][j] == 1)
				{
					return -1;
				}
			}
		}
		
		//because initial value for a rotten orange was 2
		return num - 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v[][] = {
				    {2, 1, 0, 2, 1},
				    {1, 0, 1, 2, 1},
				    {1, 0, 0, 2, 1}
		};
		
		System.out.println("Time Required "+rotOrange(v));

	}

}
