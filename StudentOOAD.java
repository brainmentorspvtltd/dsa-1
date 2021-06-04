class StudentOOAD {
    //member variables
    private int rollno;  // private member variales - Data Hiding
    private String name;
    private String phone;
    private String course;
    private double fees;
    private String collegeName;

    //default constructor
    StudentOOAD() {
        collegeName = "DIT";
    }

    //parameterized constructor
    StudentOOAD(int rollno, String name, String phone, String course, double fees)
    {
        this(); // call to the default constructor
        this.rollno = rollno; // member variable assign local variable
        this.name = name;
        this.phone = phone;
        this.course = course;
        this.fees = fees;
    }

    //public member methods

    //r, n, p, c, f - local variables
    //scope is with in the function
    //public void takeInput(int r, String n, String p, String c, double f)
    // public void takeInput(int rollno, String name, String phone, String course, double fees)
    // {
    //     this.rollno = rollno; // member variable assign local variable
    //     this.name = name;
    //     this.phone = phone;
    //     this.course = course;
    //     this.fees = fees;
    // }

    public void print()
    {
        System.out.println("Rollno: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phone);
        System.out.println("Course: "+course);
        System.out.println("Fees: "+fees);
        System.out.println("College Name: "+collegeName);
    }
    
    public static void main(String[] args) {
        StudentOOAD ram = new StudentOOAD(100, "brain", "389085370", "MCA", 1200.0);
        //ram.takeInput(100, "brain", "389085370", "MCA", 1200.0);
        ram.print();
        System.out.println("************************************");
        StudentOOAD shyam = new StudentOOAD(200, "geeta", "389078370", "BCA", 1400.0);
        shyam.print();
        /*
        System.out.println("Rollno: "+ram.rollno);
        System.out.println("Name: "+ram.name);
        System.out.println("Phone: "+ram.phone);
        System.out.println("Course: "+ram.course);
        System.out.println("Fees: "+ram.fees);
        */

        /*
        ram.rollno = 100;
        ram.name = "Ram Kumar";
        ram.course = "BCA";
        ram.phone = "834754380";
        ram.fees = 1200.0;
        */

        

        /*
        System.out.println("Rollno: "+ram.rollno);
        System.out.println("Name: "+ram.name);
        System.out.println("Phone: "+ram.phone);
        System.out.println("Course: "+ram.course);
        System.out.println("Fees: "+ram.fees);
        */

        //Student shyam = new Student();
        //int x;
    }
}