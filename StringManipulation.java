public class StringManipulation {
    public static void main(String[] args) {
        String firstname = "Krishna";
        String lastname = "Kumar";
        String fullname = firstname.concat(" ").concat(lastname);
        System.out.println(fullname);
        System.out.println(fullname.toUpperCase());
        System.out.println(fullname.toLowerCase());
    }
}
