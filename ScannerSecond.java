import java.util.Scanner;

class ScannerSecond {
    public static void main(String[] args) {

        //issue with Scanner when nextLine() is used after nextXYZ().

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Your Age: "+ age + " " + " and Name is: "+name);
    }
}
