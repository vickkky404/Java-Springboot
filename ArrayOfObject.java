class Student{

    int rollno;
    String name;
    int marks;
}

public class ArrayOfObject {
    public static void main(String[] args) {
    
    Student s1 = new Student();
    s1.rollno = 1;
    s1.name = "Harsh";
    s1.marks = 20;  
    
    Student s2 = new Student();
    s2.rollno = 2;
    s2.name = "Naliniknt";
    s2.marks = 22;  

    Student s3 = new Student();
    s3.rollno = 2;
    s3.name = "Naliniknt";
    s3.marks = 22;  

// creating the array of the objects of the student
    Student student[] = new Student[3];
    student[0] = s1;
    student[1] = s2;
    student[2] = s3;

    for(int i = 0; i<student.length;i++){
        System.out.println(student[i].name + ":" + student[i].marks);
    }

    }

}
