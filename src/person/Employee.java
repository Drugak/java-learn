package person;

import java.util.*;
import java.util.Random;

class Employee implements Cloneable {
//    private static int nextId;

//    private int id;
    private String name;
    private double salary;
    private Date hireDay;
//    private int year;
//    private int month;
//    private int day;


    //статический блок инициализации
//    static {
//        Random generator = new Random();
//        //задать произвольное число 0-999 в поле nexId
//        nextId = generator.nextInt(1000);
//    }

    //блок иициализации объекта
//    {
//        id = nextId;
//        nextId++;
//    }

    //три перегруженых конструктора
    public Employee(String n, double s ) {
//        super(n);
        this.name = n;
        this.salary = s;
        hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }

    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double newSalary) {
//        this.salary = newSalary;
//    }
//
//    public void raiseSalary(int value) {
//        this.salary = salary + value;
//    }
//
//    public int getId() {
//        return id;
//    }
}
