package constructor;

import constructor.*;

import static java.lang.System.*;

/**
 * Constructor class
 */
public class Constructor {
    public static void main(String[] arg) {

        /*
         * заполним масив staff тремя объектами типа Employee
         */
        Person[] staff = new Person[2];

        staff[0] = new Employee("Harry", 5000, 2015, 12, 8);
        staff[1] = new Manager("Drugak", 5000, 2017, 11, 5);

        /*
         * вывести данные обо всех объектах типа Employee
         */
        for (Person e : staff)
            out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
    }
}
