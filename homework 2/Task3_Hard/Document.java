public class Document implements Printable, Savable, Exportable {
    private String title;

    public Document(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Печать документа: " + title);
    }

    @Override
    public void save() {
        System.out.println("Документ '" + title + "' сохранён на диск");
    }

    @Override
    public void export() {
        System.out.println("Документ '" + title + "' экспортирован в PDF");
    }
}
