package Variables;

public class VariableArgument {

    public static void calculateList(int... nums){
        int sum = 0;
        for(int num: nums){
            sum += num;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        calculateList(1,2,3);
    }


}
