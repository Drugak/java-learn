package person;

public abstract class Person implements Cloneable {

    public abstract int getId();
    public abstract double getSalary();

    @SuppressWarnings("unchecked")
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void raiseSalary(int value);

    public String toString () {
        return getClass().getName()
            + "[name=" + name + "]";
    }
}
