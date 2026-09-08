public class Designer extends Employee {
    private int projectsCompleted;

    public Designer(String name, double salary, int projectsCompleted) {
        super(name, salary);
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    public double calculateSalary() {
        // Базовая ставка + бонус за завершённые проекты
        return salary + projectsCompleted * 15000;
    }
}
