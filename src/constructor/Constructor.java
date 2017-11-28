package constructor;

import constructor.*;

import static java.lang.System.*;

/**
 * Constructor class
 */
public class Constructor {
    public static void main(String[] arg) {

        //заполним масив staff тремя объектами типа Employee
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 4000);
        staff[1] = new Employee(4000);
        staff[2] = new Employee();

        //вывести данные обо всех объектах типа Employee
        for (Employee e : staff)
            out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
    }
}
