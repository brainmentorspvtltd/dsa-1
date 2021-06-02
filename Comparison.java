class Comparison {
    public static void main(String[] args) {
        // == vs equals()
        // String str1 = new String("Hello");
        // String str2 = new String("Hello");
        // System.out.println(str1 == str2); // == reference comparison(address comparison)
        // System.out.println(str1.equals(str2)); // equals() - content comparison

        //equals() vs equalsignorecase()
        // String str1 = new String("hello");
        // String str2 = new String("Hello");
        // System.out.println(str1.equals(str2)); 
        // System.out.println(str1.equalsIgnoreCase(str2));

        //comapreTo() - first way
        // String str1 = "hello world";
        // String str2 = new String("hello world");
        // String str3 = new String("brain");
        // System.out.println(str1.compareTo(str2));
        // System.out.println(str1.compareTo(str3));

        //comapreTo() - second way
        String str1 = "hello world";
        String str2 = "hello world";
        String str3 = "brain";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));

    }    
}
