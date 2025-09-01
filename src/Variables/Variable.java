package Variables;

public class Variable {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("Hello");
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        s1 = "Hello World";
        System.out.println(s1);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
