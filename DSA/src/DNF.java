
public class DNF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0, 1, 0, 1, 2, 1, 2};
		int c= 0, l = 0;
		int h = arr.length - 1;
		int temp;
		
		while(c < h) // c != h
		{
			if(arr[c] == 0)
			{
				temp = arr[c];
				arr[c] = arr[l];
				arr[l] = temp;
				
				c++;
				l++;
			}
			else if(arr[c] == 1)
			{
				c++;
			}
			else if(arr[c] == 2)
			{
				temp = arr[c];
				arr[c] = arr[h];
				arr[h] = temp;
				
				h--;
			}
		}
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}

	}

}
