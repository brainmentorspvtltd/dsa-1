import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = "E:\\JavaPrograms_Eclipse\\FileHandling\\src\\ReadDemo.java" ;
		
		File file = new File(path);
		final int EOF = -1;
		
		if(file.exists())
		{
			FileInputStream fs = new FileInputStream(file);
			int singleByte = fs.read(); // read-byte data
			
			while(singleByte != EOF)
			{
				System.out.print((char)singleByte);
				singleByte = fs.read();
			}
			
			fs.close();
		}

	}

}
