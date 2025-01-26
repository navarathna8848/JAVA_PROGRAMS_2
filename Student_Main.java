import java.util.Scanner;

class Student_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        Student_[] students = new Student_[size];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student_(); // Initialize each Student_ object

            System.out.println("Enter the data for student " + (i + 1) + ":");

            System.out.print("Enter the name: ");
            String name = sc.next();

            System.out.print("Enter the phone number: ");
            long ph_no = sc.nextLong();

            System.out.print("Enter the roll number: ");
            int roll_no = sc.nextInt();

            System.out.print("Enter the age: ");
            int age = sc.nextInt();

            System.out.println("-----------------------------------------------------------");

            students[i].setName(name);
            students[i].setPhNo(ph_no);
            students[i].setRollNo(roll_no);
            students[i].setAge(age);
        }

        System.out.println("Student Details:");
        for (Student_ student : students) {
            student.displayDetails();
            System.out.println("-----------------------------------------------------------");
        }

        sc.close();
    }
}
