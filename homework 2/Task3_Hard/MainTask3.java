import java.util.ArrayList;
import java.util.List;

public class MainTask3 {
    public static void main(String[] args) {
        Document doc = new Document("Договор №15");
        Image image = new Image("photo.png");
        Report report = new Report("Сентябрь 2026");

        // Каждый объект умеет печататься (общий интерфейс Printable)
        List<Printable> printables = new ArrayList<>();
        printables.add(doc);
        printables.add(image);
        printables.add(report);

        System.out.println("=== Печать всех объектов ===");
        for (Printable p : printables) {
            p.print();
        }

        System.out.println();
        System.out.println("=== Document умеет всё: печать, сохранение, экспорт ===");
        doc.print();
        doc.save();
        doc.export();

        System.out.println();
        System.out.println("=== Image умеет печать и экспорт (но НЕ сохранение) ===");
        image.print();
        image.export();

        System.out.println();
        System.out.println("=== Report умеет печать и сохранение (но НЕ экспорт) ===");
        report.print();
        report.save();

        // Проверка: Report НЕ реализует Exportable, значит следующая строка не скомпилируется:
        // report.export(); // ошибка компиляции, если раскомментировать
    }
}
