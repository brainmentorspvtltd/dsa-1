import java.io.*;

class BufferedReaderClass {
    public static void main(String[] args) 
        throws IOException
    {
       
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your age:");
        int age = Integer.parseInt(bufferedReader.readLine()); 
        //Integer.parseInt(bufferedReader.readLine()); - String to int

        System.out.println("Enter your name:");
        String name = bufferedReader.readLine();

        System.out.println("Your Age: "+ age + " " + " and Name is: "+name);
    }    
}
