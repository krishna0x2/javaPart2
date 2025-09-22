public class StudentToString {
    private static final String Aryan = null;
    private static final int H = 0;
    String name;
    int age;
    String rollNumber;
    String house;

    public StudentToString(String name,int age, String rollNumber,String house){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;

    }
    public String toString(){
        return "Student details: {name:"+name+" , age:"+age+",roll Number:"+rollNumber+", house:"+house+"}";
    }
    
    public static void main(String[] args) {
        StudentToString stu = new StudentToString(Aryan, 12, "63 H section","gali no 18 D549 baprola vihar 110043" );
        System.out.println(stu);
    }
}
