package Enums;

public enum WeekdaysAbstract {
    MONDAY{
        public void dummyMethod() {
            System.out.println("inside Monday");
        }
    },
    TUESDAY{
        public void dummyMethod() {
            System.out.println("inside Tuesday");
        }
    },
    FRIDAY {
        public void dummyMethod() {
            System.out.println("inside Friday");
        }
    };

    public abstract void dummyMethod();



}
