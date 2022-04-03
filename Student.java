class Student {
    int id = 1000;
    byte age = 18;
    short rank = 165;
    long phone = 987_654_321l;
    int nextId = id + 1;

    int minValue = Integer.MIN_VALUE;
    int maxValue = Integer.MAX_VALUE;

    void compute() {
        System.out.println("Id: " + id);
        System.out.println("Next Id: " + nextId);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Phone: " + phone);
        System.out.println("Minimum Value: " + minValue);
        System.out.println("Maximum Value: " + maxValue);
    }

    public static void main (String[] args) {
        Student s = new Student();
        s.compute();
    }
}