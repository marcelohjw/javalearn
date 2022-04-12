class Student {
    static int computeCount;
    int id;
    String name;
    String gender;
    int age;
    long phone;
    double gpa = 3.8;
    char degree;
    boolean international;
    double tuitionFees = 12000.0;
    double internationalFees = 5000.0;

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
        Student student1 = new Student();
        // Sem constructor
        student1.id = 1000;
        student1.name = "Marcelo";
        student1.gender = "male";
        student1.age = 18;
        student1.phone = 987_654_321l;
        student1.gpa = 3.8;
        student1.degree = '\u0042'; //Unicode for B
        student1.international = false;
        student1.compute();

        Student student2 = new Student();
        // Sem constructor
        student2.id = 1001;
        student2.name = "Maya";
        student2.gender = "female";
        student2.age = 20;
        student2.phone = 983_652_323l;
        student2.gpa = 3.5;
        student2.degree = '\u0046'; //Unicode
        student2.international = true;
        student2.compute();

        Student student3 = new Student();
        student3.id = 1002;
        student3.name = "Anita";
        student3.gender = "female";
        student3.age = 21;
        student3.phone = 223_456_8888L;
        student3.gpa = 4.0;
        student3.degree = 'M';
        student3.international = true;
        student3.compute();
    }
}