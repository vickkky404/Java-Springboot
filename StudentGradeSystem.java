import java.util.Scanner;

public class StudentGradeSystem {
    private String[] studentNames;
    private int[][] grades; // Jagged array to store grades
    private String[] subjectNames;
    private int numStudents;
    
    public StudentGradeSystem(int numStudents) {
        this.numStudents = numStudents;
        this.studentNames = new String[numStudents];
        this.grades = new int[numStudents][]; // Initialize jagged array
    }
    
    // Method to input student data
    public void inputStudentData() {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();
            
            System.out.print("How many subjects for " + studentNames[i] + "? ");
            int numSubjects = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            // Initialize the row with specific number of subjects
            grades[i] = new int[numSubjects];
            
            System.out.println("Enter grades for " + studentNames[i] + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + " grade: ");
                grades[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline
            System.out.println();
        }
    }
    
    // Calculate average grade for a student
    public double calculateAverage(int studentIndex) {
        if (grades[studentIndex].length == 0) return 0.0;
        
        int sum = 0;
        for (int grade : grades[studentIndex]) {
            sum += grade;
        }
        return (double) sum / grades[studentIndex].length;
    }
    
    // Find student with highest average
    public int findTopStudent() {
        int topStudent = 0;
        double highestAvg = calculateAverage(0);
        
        for (int i = 1; i < numStudents; i++) {
            double currentAvg = calculateAverage(i);
            if (currentAvg > highestAvg) {
                highestAvg = currentAvg;
                topStudent = i;
            }
        }
        return topStudent;
    }
    
    // Display all student information
    public void displayStudentInfo() {
        System.out.println("\n=== STUDENT GRADE REPORT ===");
        System.out.println("─".repeat(50));
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student: " + studentNames[i]);
            System.out.print("Grades: ");
            
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j]);
                if (j < grades[i].length - 1) System.out.print(", ");
            }
            
            System.out.printf("\nAverage: %.2f", calculateAverage(i));
            System.out.println("\nNumber of subjects: " + grades[i].length);
            System.out.println("─".repeat(30));
        }
        
        // Display top student
        int topStudent = findTopStudent();
        System.out.println("\n🏆 TOP STUDENT: " + studentNames[topStudent]);
        System.out.printf("Average Grade: %.2f\n", calculateAverage(topStudent));
    }
    
    // Method to add grades for existing student
    public void addGradeToStudent(int studentIndex, int newGrade) {
        if (studentIndex < 0 || studentIndex >= numStudents) {
            System.out.println("Invalid student index!");
            return;
        }
        
        // Create new array with one more slot
        int[] newGrades = new int[grades[studentIndex].length + 1];
        
        // Copy existing grades
        for (int i = 0; i < grades[studentIndex].length; i++) {
            newGrades[i] = grades[studentIndex][i];
        }
        
        // Add new grade
        newGrades[grades[studentIndex].length] = newGrade;
        
        // Update the jagged array
        grades[studentIndex] = newGrades;
        
        System.out.println("Grade added successfully to " + studentNames[studentIndex]);
    }
    
    // Display memory usage comparison
    public void displayMemoryComparison() {
        System.out.println("\n=== MEMORY USAGE ANALYSIS ===");
        
        // Calculate actual memory used by jagged array
        int actualSlots = 0;
        for (int i = 0; i < numStudents; i++) {
            actualSlots += grades[i].length;
        }
        
        // Calculate memory that would be used by regular 2D array
        int maxSubjects = 0;
        for (int i = 0; i < numStudents; i++) {
            if (grades[i].length > maxSubjects) {
                maxSubjects = grades[i].length;
            }
        }
        int regularArraySlots = numStudents * maxSubjects;
        
        System.out.println("Jagged Array Memory Usage: " + actualSlots + " slots");
        System.out.println("Regular 2D Array Would Use: " + regularArraySlots + " slots");
        System.out.println("Memory Saved: " + (regularArraySlots - actualSlots) + " slots");
        System.out.printf("Memory Efficiency: %.1f%%\n", 
            ((double) actualSlots / regularArraySlots) * 100);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== STUDENT GRADE MANAGEMENT SYSTEM ===");
        System.out.println("Using Jagged Arrays for Memory Efficiency\n");
        
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        StudentGradeSystem system = new StudentGradeSystem(numStudents);
        
        // Input student data
        system.inputStudentData();
        
        // Display initial report
        system.displayStudentInfo();
        
        // Demonstrate adding grades
        System.out.print("\nWould you like to add a grade to any student? (y/n): ");
        String choice = scanner.nextLine();
        
        if (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter student number (1-" + numStudents + "): ");
            int studentNum = scanner.nextInt() - 1;
            System.out.print("Enter new grade: ");
            int newGrade = scanner.nextInt();
            
            system.addGradeToStudent(studentNum, newGrade);
            
            // Display updated report
            system.displayStudentInfo();
        }
        
        // Show memory comparison
        system.displayMemoryComparison();
        
        scanner.close();
    }
}