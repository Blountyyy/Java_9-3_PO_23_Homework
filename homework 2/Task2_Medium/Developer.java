public class Developer extends Employee {
    private int linesOfCode;

    public Developer(String name, double salary, int linesOfCode) {
        super(name, salary);
        this.linesOfCode = linesOfCode;
    }

    @Override
    public double calculateSalary() {
        // Базовая ставка + бонус за строки кода
        return salary + linesOfCode * 0.5;
    }
}
