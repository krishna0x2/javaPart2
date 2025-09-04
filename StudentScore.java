public class StudentScore {
    public static void main(String[] args) {
        int score = 85;
        String grade = (score >= 90) ? "A Grade" :
                       (score >= 80) ? "B Grade" :
                       (score >= 70) ? "C Grade" :
                       (score >= 60) ? "D Grade" : "F Grade";
        System.out.println("The grade is: " + grade);
    }
    
}
