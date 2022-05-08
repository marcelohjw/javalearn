class Student {
    static int computeCount; // Static variable will hold values
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
        System.out.println("CONSTRUCTOR ON");
        System.out.println("----------------");
        id = newId;
        name = newName;
        gender = newGender;
        age = newAge;
        phone = newPhone;
        gpa = newGpa;
        degree = newDegree;
        international = isInternational;
    }

    Student() {}

    void compute() {
        computeCount = computeCount + 1;
        if (international) {
            tuitionFees = tuitionFees + internationalFees;
        }
        System.out.println("\nId: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("GPA: " + gpa);
        System.out.println("Degree: " + degree);
        System.out.println("tuitionFees: " + tuitionFees);
        System.out.println("compute count: " + computeCount);
    }

    public static void main (String[] args) {
        Student student1 = new Student( 
                                        1000,
                                        "Marcelo",
                                        "male",
                                        18,
                                        987_654_321l,
                                        3.8,
                                        '\u0042', // Unicode for B
                                        false
                                       );
        student1.compute();

        Student student2 = new Student(
                                        1001,
                                        "Maya",
                                        "female",
                                        28,
                                        983_652_323l,
                                        3.5,
                                        '\u0046',
                                        true
        );
        student2.compute();

        Student student3 = new Student();
        student3.compute();

        System.out.println("Student compute count: " + Student.computeCount);

    }
}