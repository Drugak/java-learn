package constructor;

import java.util.Random;

class Employee extends Person {
    private static int nextId;

    private int id;
    private double salary;
    private int year;
    private int month;
    private int day;


    //статический блок инициализации
    static {
        Random generator = new Random();
        //задать произвольное число 0-999 в поле nexId
        nextId = generator.nextInt(1000);
    }

    //блок иициализации объекта
    {
        id = nextId;
        nextId++;
    }

    //три перегруженых конструктора
    public Employee(String n, double s, int y, int m, int d) {
        super(n);
        salary = s;
        year = y;
        month = m;
        day = d;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
