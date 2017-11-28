package constructor;

import java.util.Random;

class Employee {
    private static int nextId;

    private int id;
    private String name = ""; //инициализация поля экземпляра
    private double salary;

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
    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(double s) {
        //вызвать конструктор Employee(String, double)
        this("Employee #" + nextId, s);
    }

    //конструктор без аргументов
    public Employee() {
        // поле name инициализируется пустой строкой ""
        // поле salary не устанавливается явно, а инициализируется нулем
        // поле id инициализируется в блоке инициализации
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
