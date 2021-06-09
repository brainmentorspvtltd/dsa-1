import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the data to write in a file:");
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		
		FileOutputStream fo = new FileOutputStream("E://JavaOutput/sample.txt");
		
		fo.write(txt.getBytes());
		fo.close();
		System.out.println("Data write in a file");
	}

}
