public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateSalary() {
        // Базовая ставка + бонус за размер команды
        return salary + teamSize * 5000;
    }
}
