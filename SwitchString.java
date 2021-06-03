import java.util.Scanner;

class SwitchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice:");
        String choice = sc.nextLine();

        switch(choice)
        {
        case "one":
        System.out.println("case 1");
        break;
        case "two":
        System.out.println("case 2");
        break;
        case "three":
        System.out.println("case 3");
        break;
        default:
        System.out.println("Invalid Choice");
        }
    }
}
