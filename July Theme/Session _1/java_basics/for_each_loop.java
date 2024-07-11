class Student
{//these are instance varibales
    int rollno;
    String name;
    int marks;
}
public class for_each_loop {
    // this loop specific for arrays
    
    public static void main(String[] args) {
        int nums[]= {4,7,2,9};
        for(int n : nums){
            System.out.println(n);
        }

        // using class for an array of different types, hence creating multiple objects
        Student s1=new Student();
        s1.rollno=1;
        s1.name="Navin";
        s1.marks=88;
        Student s2=new Student();
        s2.rollno=2;
        s2.name="Harsh";
        s2.marks=67;
        Student s3=new Student();
        s3.rollno=3;
        s3.name="Kiran";
        s3.marks=97;
        // System.out.println(s1.name + ":"+ s1.marks);
        // to create array of Student, hence instead of refernece variable we can create reference array
        Student students[]=new Student[3];
        students[0]=s1;// hence we can create the array and add object into it
        students[1]=s2;
        students[2]=s3;

        for(Student stud : students){
            System.out.println(stud.name+ " : "+stud.marks);
        }
    }
}
