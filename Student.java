class Student {
    int roll;

    Student(int roll) {
        this.roll = roll;   // this keyword
    }

    void display() {
        System.out.println("Roll Number: " + this.roll);
    }

    public static void main(String[] args) {
        Student s = new Student(101);
        s.display();
    }
}
