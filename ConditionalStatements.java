import java.util.Scanner;

class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number:");
        int num = sc.nextInt();

        // if((num % 2) == 0)
        // {
        //     System.out.println("Even");
        // }
        // else {
        //     System.out.println("Odd");
        // }

        // Ternary Operator - ?:
        // (condition) ? true : false;

        String result = ((num % 2) == 0) ? "Even" : "Odd";
        System.out.println("Number is: "+result);
    }    
}
