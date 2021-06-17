
public class ZigZagArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//a < b > c < d > e
		
		int arr[] = {4, 3, 2, 8, 6, 7, 1};
		int temp = 0;
		boolean flag = true;
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			if(flag) {
				if(arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			else {
				if(arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			
			flag = !flag;
			
		}
		
		System.out.println("ZigZag Array ");
		for(int n : arr)
		{
			System.out.print(n+" ");
		}
		
	}

}
