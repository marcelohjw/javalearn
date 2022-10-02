class Student {
    static int studentCount; // Static variable will hold values
    int id;
    String name;
    String gender;
    int age;
    long phone;
    double gpa = 3.8;
    char degree;
    boolean international;
    double tuitionFees = 12000.0, internationalFees = 5000.0;

    Student() {}

    Student(int id, String name, String gender,int age, long phone, double  gpa, char degree) {
        this(id, name, gender, age, phone, gpa, degree, false); // Invocation Statement
        /**
        System.out.println("----------------");
        System.out.println("SECONDARY CONSTRUCTOR\n");
        System.out.println("----------------");
        **/

    }

    Student(int id, String name, String gender,int age, long phone, double  gpa, char degree, boolean international) {
        /**
        System.out.println("----------------");
        System.out.println("PRIMARY CONSTRUCTOR");
        **/
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.gpa = gpa;
        this.degree = degree;
        this.international = international;

        studentCount = studentCount + 1;
        if (international) {
            tuitionFees = tuitionFees + internationalFees;
            //return;
        }

        studentCount = studentCount + 1;

        /*
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Age: " + this.age);
        System.out.println("Phone: " + this.phone);
        System.out.println("GPA: " + this.gpa);
        System.out.println("Degree: " + this.degree);
        System.out.println("tuitionFees: " + tuitionFees);
        System.out.println("Student Number: " + studentCount + "\n");
        */
    }

    boolean updateProfile(String name) {
        this.name = name;
        return true;
    }

    public static void main (String[] args) {
        System.out.println("STUDENTS INFO\n");
        Student student1 = new Student(1000, "Marcelo", "male", 18, 987_654_321l, 3.8, '\u0042');

        Student student2 = new Student(1001, "Maya", "female", 28, 983_652_323l, 3.5, '\u0046', true);

        Student student3 = new Student(1002, "Anitta", "female", 29, 444_669_767l, 3.0, '\u0040', true);

        System.out.println("\nNAMES");
        System.out.println("Student 1: " + student1.name);
        System.out.println("Student 2: " + student2.name);
        System.out.println("Student 3: " + student3.name);

        student1.updateProfile("John");

        System.out.println("Student 1: " + student1.name);



        System.out.println("Student count: " + Student.studentCount);

    }
}