class Student {
    int rollNo;
    String name;
    double mark1, mark2, mark3;

    public Student(int rollNo, String name, double mark1, double mark2, double mark3) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public double calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    public double calculatePercentage() {
        return (calculateTotal() / 300.0) * 100;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: Subject 1 = " + mark1 + ", Subject 2 = " + mark2 + ", Subject 3 = " + mark3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.printf("Percentage: %.2f%%\n", calculatePercentage());
        System.out.println("---------------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Aarav Sharma", 85.5, 90.0, 78.0);
        Student student2 = new Student(102, "Isha Patel", 92.0, 88.5, 95.0);
        Student student3 = new Student(103, "Rohan Das", 65.0, 70.5, 72.0);

        System.out.println("--- Student Record System ---\n");
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
