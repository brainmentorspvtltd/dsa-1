import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String Input
        String name = sc.nextLine();

        char gender = sc.next().charAt(0);
        int age = sc.nextInt();
        double cgpa = sc.nextDouble();
        long contactNo = sc.nextLong();

        System.out.println("Name is: "+name);
        System.out.println("Gender is: "+gender);
        System.out.println("Age is: "+age);
        System.out.println("CGPA is: "+cgpa);
        System.out.println("Contact Number is: "+contactNo);
    }
}
