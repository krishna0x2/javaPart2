import java.util.Scanner;
public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Marks::");
        int score = sc.nextInt();
        String grade = (score >= 90) ? "A Grade" :
                       (score >= 80) ? "B Grade" :
                       (score >= 70) ? "C Grade" :
                       (score >= 60) ? "D Grade" : "F Grade";
        System.out.println("The grade is: " + grade);
        // using ternary oprater inside ternary operator
        String possibelGrade = (score > 80) ? "High" : (score > 60 ? "Medium" : "Low") ;

        System.out.println("Now the possible grade type is::" +possibelGrade);


    }
    
}
