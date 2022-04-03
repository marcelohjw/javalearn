class Student {
    int id = 1000;
    int nextId = id + 1;

    void compute() {
        System.out.println("Id: " + id);
        System.out.println("Next Id: " + nextId);
    }

    public static void main (String[] args) {
        Student s = new Student();
        s.compute();
    }
}