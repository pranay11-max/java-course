


public class ifelse {

    public static void main(String[] args) {
        int marks = 96;
       
        if (marks >= 95) {
            System.out.println(marks + "% O Grade");
        } else if (marks >= 85) {
            System.out.println(marks + "% A Grade");
        } else if (marks >= 65) {
            System.out.println(marks + "% B Grade");
        } else if (marks >= 35) {
            System.out.println(marks + "% C Grade");
        } else {
            System.out.println(marks + "% Fail");
        }
    }
}
