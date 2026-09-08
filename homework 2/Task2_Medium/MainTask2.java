public class MainTask2 {
    public static void main(String[] args) {
        Employee dev = new Developer("Айдос", 300000, 2000);
        Employee manager = new Manager("Гульнара", 400000, 5);
        Employee designer = new Designer("Ерлан", 250000, 3);

        System.out.println(dev);
        System.out.println(manager);
        System.out.println(designer);
    }
}
