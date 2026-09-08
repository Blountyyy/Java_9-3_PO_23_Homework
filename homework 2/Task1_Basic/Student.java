public class Student {
    private String name;
    private int age;
    private String faculty;

    public Student(String name, int age, String faculty) {
        this.name = name;
        setAge(age); // проходит через проверку
        this.faculty = faculty;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16 || age > 100) {
            throw new IllegalArgumentException("Возраст должен быть от 16 до 100 лет, указано: " + age);
        }
        this.age = age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", faculty='" + faculty + "'}";
    }
}
