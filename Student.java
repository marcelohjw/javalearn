class Student {
    int id = 1000;
    byte age = 18;
    short rank = 165;
    long phone = 987_654_321l;

    double gpa = 3.8;

    char degree = '\u0042'; //Unicode for B

    void compute() {
        System.out.println("Id: " + id);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Phone: " + phone);
        System.out.println("GPA: " + gpa);
        System.out.println("Degree: " + degree);
    }

    public static void main (String[] args) {
        Student s = new Student();
        s.compute();
    }
}