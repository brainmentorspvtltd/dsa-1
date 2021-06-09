import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class MyFilter implements FilenameFilter {

	@Override
	public boolean accept(File dirPath, String fileName) {
		// TODO Auto-generated method stub
		return fileName.endsWith(".docx");
	}
	
}

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		
		String path = "E://JavaOutput/sample.txt";
		
		File file = new File(path);
		
		if(file.exists())
		{
			File file2= new File("E://JavaOutput/sample2.txt");
			file.renameTo(file2);
			
			//file.delete();
			System.out.println("File Deleted");
		}
		else {
			file.createNewFile();
			System.out.println("File Created");
		}
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		
		path = "E://JavaOutput/java/java2/java3/java4";
		file = new File(path);
		//file.mkdir();
		file.mkdirs();
		
		file = new File("E://JavaOutput");
		MyFilter filter = new MyFilter();
		//File files[] = file.listFiles(filter);
		
		//With Lambda Expression
		File files[] = file.listFiles((dirPath, fileName)->fileName.endsWith(".txt"));
		File files2[] = file.listFiles((dirPath, fileName)->fileName.endsWith(".docx"));
		File files3[] = file.listFiles((dirPath, fileName)->fileName.endsWith(".mp3"));
		
		System.out.println("No of files "+files.length);
		System.out.println("No of files "+files2.length);
		System.out.println("No of files "+files3.length);
		
		/*
		for(File f : files)
		{
			f.delete();
		}
		*/
	}
}
