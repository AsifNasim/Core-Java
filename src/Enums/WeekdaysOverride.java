package Enums;

public enum WeekdaysOverride {
    MONDAY {
        @Override
        public void dummyMethod() {
            System.out.println("Monday Dummy method");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void dummyMethod(){
        System.out.println("Default dummy method");
    }
}
