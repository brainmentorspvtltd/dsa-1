class CommandLineInput {
    public static void main(String[] args) {
        // String firstNumber = args[0];
        // String secondNumber = args[1];
        // String result;
        if(args.length == 2)
        {
            int firstNumber = Integer.parseInt(args[0]); 
            int secondNumber = Integer.parseInt(args[1]);
            int result;
            result = firstNumber + secondNumber;
            System.out.println("Sum is: "+result);
        }
        else {
            System.out.println("Invalid Input");
        }
    }    
}
