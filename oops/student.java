
public class student {

    String studentName;
    int studentId;
    float height;
    String lastqualification;
    String admissiondate;

    student(String studentName, int studentId, float height, String lastqualification, String admissiondate) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.height = height;
        this.lastqualification = lastqualification;
        this.admissiondate=admissiondate;
    }

    void showDetails(){
        System.out.println("Student Name : "+studentName);
        System.out.println("Student ID : "+studentId);
        System.out.println("Student Height : "+height);
        System.out.println("Student Last Qualification : "+lastqualification);
        System.out.println("Student Admission Date : "+admissiondate);
        
    }

    public static void main(String[] args) {
        student s1;
        s1=new student("Pranay",2483049,155.5f,"12th Pass","11-2-2023");

        student s2;
        s2=new student("Sai",2483079,152.5f,"12th Pass","12-2-2023");
        
        student s3;
        s3=new student("Urvashi",2483074,152.0f,"12th Pass","15-2-2023");

        student s4;
        s4=new student("Jayesh",2483065,156.0f,"12th Pass","16-2-2023");
        
        s1.showDetails();
        System.out.println("\n");

        s2.showDetails();
        System.out.println("\n");

        s3.showDetails();
        System.out.println("\n");

        s4.showDetails();
        
    }
}
