import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private String grade;

    // Constructor
    public Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    // Methods
    public void displayInfo() {
        System.out.println("Name: " + name + " | Roll No: " + rollNo + " | Grade: " + grade);
    }

    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }

    // Getter
    public int getRollNo() {
        return rollNo;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Update Student Grade");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1: 
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine(); 
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = sc.next();

                    Student s = new Student(name, rollNo, grade);
                    students.add(s);
                    System.out.println("✅ Student Added!");
                    break;

                case 2: 
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\nAll Students:");
                        for (Student st : students) {
                            st.displayInfo();
                        }
                    }
                    break;

                case 3: 
                    System.out.print("Enter Roll No to update grade: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;
                    for (Student st : students) {
                        if (st.getRollNo() == r) {
                            System.out.print("Enter new Grade: ");
                            String newGrade = sc.next();
                            st.updateGrade(newGrade);
                            System.out.println("✅ Grade Updated!");
                            st.displayInfo();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("❌ Student not found!");
                    }
                    break;

                case 4: 
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
