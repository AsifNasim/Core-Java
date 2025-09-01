package Enums;

public class WeekdaysClient {
    public static void main(String[] args) {

        /*
        * values(); - provide the ArrayList of Constants
        * ordinal(); - Provide the value associated with constant
        * valueOf(); - Retrieve a enum constants by its name
        * name()  - instance method that returns the name of the enum constants as a string
        * */

//        for(Weekdays sample: Weekdays.values() ){
//            System.out.println(sample.ordinal());
//        }
//
//        Weekdays weekdaysVariable = Weekdays.valueOf("TUESDAY");
//        System.out.println(weekdaysVariable.name());


        WeekdaysCustom days = WeekdaysCustom.getEnumFromValues(102);
        System.out.println(days.getValue() +"-" +days.getComment());


        WeekdaysOverride wdOverride = WeekdaysOverride.MONDAY;
        wdOverride.dummyMethod();

        WeekdaysOverride wdOverride2 = WeekdaysOverride.FRIDAY;
        wdOverride2.dummyMethod();

        WeekdaysAbstract wdAbstract = WeekdaysAbstract.MONDAY;
        wdAbstract.dummyMethod();

        WeekdaysAbstract wdAbstract2 = WeekdaysAbstract.FRIDAY;
        wdAbstract2.dummyMethod();

        /* what's the benefit of enum class when can create constants through "static" and "final" keyword  */

        System.out.println(isWeekend(2)); // wednesday, so it will return false
        System.out.println(isWeekend(6)); // Sunday, so it will return true
        System.out.println(isWeekend(100)); // this value is not expected, but still we are able to send this in parameter

//       // better readability and full control on what value we can pass in parameter
        System.out.println(isWeekend(Weekdays.SATURDAY)); // return true
        System.out.println(isWeekend(Weekdays.WEDNESDAY)); // return false

    }

    public static boolean isWeekend(int day){
        if(WeekConstants.SATURDAY == day || WeekConstants.SUNDAY ==  day){
            return true;
        }
        return false;
    }

    public static boolean isWeekend(Weekdays day){
        if(Weekdays.SATURDAY == day  || Weekdays.SUNDAY == day){
            return true;
        }

        return false;
    }
}
