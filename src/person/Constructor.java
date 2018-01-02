package person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//
import static java.lang.System.*;

/**
 * Constructor class
 */
public class Constructor {
    public static void main(String[] arg) {

        /*
         * заполним масив staff тремя объектами типа Employee
         */
        Employee[] staff = {
            new Employee("Vitaliy", 7000),
            new Employee("Harry", 5000),
            new Employee("Abc", 5000),
            new Employee("Lona", 5000),
            new Employee("Igor", 4000)
        };

        for (Employee i:staff) {
            System.out.println("orign " + i.getName());
        }
        Arrays.sort(staff, Comparator.comparing(Employee::getName));
        System.out.println("================================================");
        for (Employee i:staff) {
            System.out.println("sorted " + i.getName());
        }

//        try {
//            Employee copy = origin.clone();
//            copy.setHireDay(1992, 11, 13);
//
//
//
//            System.out.println("origin:" + origin);
//            System.out.println("copy:" + copy);
//
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }


        /*
         * Повысить всем ЗП на 10
         */
//        for (Person e : staff)
//                e.raiseSalary(10);

        /*
         * вывести данные обо всех объектах типа Employee
         */
//        for (Person e : staff)
//            out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary() + "About Class: " + e.toString());
    }
}
