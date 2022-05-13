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

    Student(int newId, 
            String newName, 
            String newGender,
            int newAge, 
            long newPhone, 
            double newGpa, 
            char newDegree, 
            boolean isInternational) {
        System.out.println("----------------");
        System.out.println("CONSTRUCTOR ON");
        id = newId;
        name = newName;
        gender = newGender;
        age = newAge;
        phone = newPhone;
        gpa = newGpa;
        degree = newDegree;
        international = isInternational;

        studentCount = studentCount + 1;
        if (international) {
            tuitionFees = tuitionFees + internationalFees;
            //return;
        }
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("GPA: " + gpa);
        System.out.println("Degree: " + degree);
        System.out.println("tuitionFees: " + tuitionFees);
        System.out.println("Student Number: " + studentCount + "\n");
    }

    Student() {}

    void compute() {
        
    }

    public static void main (String[] args) {
        System.out.println("STUDENTS\n");
        Student student1 = new Student(1000, "Marcelo", "male", 18, 987_654_321l, 3.8, '\u0042', false);

        Student student2 = new Student(1001, "Maya", "female", 28, 983_652_323l, 3.5, '\u0046', true);

        Student student3 = new Student(1002, "Anitta", "female", 29, 444_669_767l, 3.0, '\u0040', true);

        System.out.println("Student count: " + Student.studentCount);

    }
}