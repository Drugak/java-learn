package person;

//import java.util.ArrayList;
//
//import static java.lang.System.*;

/**
 * Constructor class
 */
public class Constructor {
    public static void main(String[] arg) {

        /*
         * заполним масив staff тремя объектами типа Employee
         */
//        ArrayList<Person> staff = new ArrayList<Person>();

//        staff.add(new Employee("Harry", 5000, 2015, 12, 8));
//        staff.add(new Manager("Drugak", 5000, 2017, 11, 5));

        Employee origin = new Employee("Vitaliy", 5000);
        origin.setHireDay(2017, 11, 13);

        try {
            Employee copy = origin.clone();
            copy.setHireDay(1992, 11, 13);

            System.out.println("origin:" + origin);
            System.out.println("copy:" + copy);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


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
