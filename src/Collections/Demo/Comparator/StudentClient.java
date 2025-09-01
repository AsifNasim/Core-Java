package Collections.Demo.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentClient {
    public static void main(String[] args) {
//        Student [] students = new Student[3];
//        Student listOfStudent = new Student(
//                new Student(3, "Asif", 27),
//                new Student(1, "Harshit", 26),
//                new Student(6, "Danish", 29),
//                );

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student(3, "Asif", 27));
        listOfStudents.add(new Student(1, "Harshit", 26));
        listOfStudents.add(new Student(6, "Danish", 29));

//        Collections.sort((listOfStudents, new StudentComparator()));

//        Collections.sort(listOfStudents, (Student obj1, Student obj2) -> obj2.name.compareTo(obj1.name));


//        Collections.sort(listOfStudents, (Student s1, Student s2) -> Integer.compare(s2.age, s1.age));


//            using explicit comparator Student class

        Collections.sort(listOfStudents, new StudentComparator());
        for(Student std: listOfStudents){
            System.out.println(std.name+ " : "+ std.age);
        }




//        students[0] = new Student(3, "Asif", 27);
//        students[1] = new Student(1, "Harshit", 26);
//        students[2] = new Student(6, "Danish", 29);

//        Collections.sort(students, (Student obj1, Student obj2) -> obj1.age.compareTo(obj2.age));
//        Arrays.sort(students, (Student obj1, Student obj2) -> obj1.age - obj2.age);

//        for (Student std: students){
//            System.out.println(std.name+" : "+ std.age);
//        }

//        Collections.sort(students, (Student o1, Student o2) -> o1.name.compareTo(o2.name));
    }
}
