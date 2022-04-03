class Student {
    int id = 1000;
    byte age = 18;
    short rank = 165;
    long phone = 987654321;
    int nextId = id + 1;

    void compute() {
        System.out.println("Id: " + id);
        System.out.println("Next Id: " + nextId);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Phone: " + phone);
    }

    public static void main (String[] args) {
        Student s = new Student();
        s.compute();
    }
}