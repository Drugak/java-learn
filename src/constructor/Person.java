package constructor;

public abstract class Person {

    public abstract int getId();
    public abstract double getSalary();

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
