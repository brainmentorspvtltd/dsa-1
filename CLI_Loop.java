class CLI_Loop {
    public static void main(String[] args) {
        int sum = 0;
        //Traditional Loop
        // for(int i = 0; i < args.length; i++)
        // {
        //     sum += Integer.parseInt(args[i]); // sum = sum + Integer.parseInt(args[i]);
        // }
        // System.out.println("Sum is: "+sum);

        //Enhanced for loop / for-each loop
        for(String i:args) {
            sum += Integer.parseInt(i);
        }
        System.out.println("Sum is: "+sum);

    }    
}
