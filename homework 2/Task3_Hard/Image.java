public class Image implements Printable, Exportable {
    private String fileName;

    public Image(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void print() {
        System.out.println("Печать изображения: " + fileName);
    }

    @Override
    public void export() {
        System.out.println("Изображение '" + fileName + "' экспортировано в JPG");
    }
}
