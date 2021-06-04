class Student {
    //member variables
    int rollno; // private member variables
    String name;
    String phone;
    String course;
    double fees;

    //public member methods
    public static void main(String[] args) {
        Student ram = new Student();
        System.out.println("Rollno: "+ram.rollno);
        System.out.println("Name: "+ram.name);
        System.out.println("Phone: "+ram.phone);
        System.out.println("Course: "+ram.course);
        System.out.println("Fees: "+ram.fees);

        ram.rollno = 100;
        ram.name = "Ram Kumar";
        ram.course = "BCA";
        ram.phone = "834754380";
        ram.fees = 1200.0;

        System.out.println("************************************");

        System.out.println("Rollno: "+ram.rollno);
        System.out.println("Name: "+ram.name);
        System.out.println("Phone: "+ram.phone);
        System.out.println("Course: "+ram.course);
        System.out.println("Fees: "+ram.fees);

        //Student shyam = new Student();
        //int x;
    }
}