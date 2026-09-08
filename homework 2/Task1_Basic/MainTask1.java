public class MainTask1 {
    public static void main(String[] args) {
        System.out.println("=== Student ===");
        Student student = new Student("Руслан", 19, "Программное обеспечение");
        System.out.println(student);

        // Проверка валидации возраста
        try {
            student.setAge(19); // невалидный возраст
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println();
        System.out.println("=== Animal / Dog / Cat ===");
        Animal[] animals = { new Animal("Существо"), new Dog("Бобик"), new Cat("Мурка") };
        for (Animal a : animals) {
            a.makeSound(); // полиморфизм: вызывается переопределённый метод
        }
    }
}
