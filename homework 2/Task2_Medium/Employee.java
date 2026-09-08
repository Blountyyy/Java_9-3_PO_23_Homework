public abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Абстрактный метод — каждый подкласс реализует по-своему
    public abstract double calculateSalary();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": " + calculateSalary() + " тг";
    }
}
