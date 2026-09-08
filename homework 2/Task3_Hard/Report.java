public class Report implements Printable, Savable {
    private String period;

    public Report(String period) {
        this.period = period;
    }

    @Override
    public void print() {
        System.out.println("Печать отчёта за " + period);
    }

    @Override
    public void save() {
        System.out.println("Отчёт за " + period + " сохранён в базе данных");
    }
}
