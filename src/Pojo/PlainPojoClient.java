package Pojo;

public class PlainPojoClient {
    public static void main(String[] args) {
        PlainPojo plPojo = new PlainPojo();

        plPojo.setRollNumber(11);
        System.out.println(plPojo.getRollNumber());
    }
}
