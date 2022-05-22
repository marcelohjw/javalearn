class StudentTest {
    public static void main (String[] args) {
        System.out.println("NEW STUDENTS\n");
        Student student1 = new Student(1000, "Marcelo", "male", 18, 987_654_321l, 3.8, '\u0042');

        Student student2 = new Student(1001, "Maya", "female", 28, 983_652_323l, 3.5, '\u0046', true);

        Student student3 = new Student(1002, "Anitta", "female", 29, 444_669_767l, 3.0, '\u0040', true);

        System.out.println("Student count: " + Student.studentCount);


        System.out.println("\nNAMES");
        System.out.println("Student 1: " + student1.name);
        System.out.println("Student 2: " + student2.name);
        System.out.println("Student 3: " + student3.name);

        student1.updateProfile("John");
        System.out.println("Updated Student 1: " + student1.name);

        Student student4 = student1;
        System.out.println("Student 4: " + student4.name);

        student4.updateProfile("Mike");
        System.out.println("Updated Student 4: " + student4.name);

        student4 = new Student();
        student4.updateProfile("Alex");
        System.out.println("Student 4: " + student4.name);

        Student[] students = {student1, student2, student3};

        swap(students, 0, 2);

        System.out.println("\nArray 1: " + students[0].name);
        System.out.println("Array 2: " + students[1].name);
        System.out.println("Array 3: " + students[2].name);
    }

    static void swap(Student[] students, int firstIndex, int secondaryIndex) {
            Student temp = students[firstIndex];
            students[firstIndex] = students[secondaryIndex];
            students[secondaryIndex] = temp;
        }
}