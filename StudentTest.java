class StudentTest {
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