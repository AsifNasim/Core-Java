package Collections.Demo.Comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {


//    here you can explicitly say what you wanted
    @Override
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}
