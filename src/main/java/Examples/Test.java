package Examples;

/**
 * 1. Создать класс "Сотрудник" с полями:
 * ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит
 * информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 */

public class Test {

    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("Ivanov Ivan", "Engineer",
                "ivanov@mail.ru", "79514532681", 40000, 42);
        people[1] = new Person("Semenov Semen", "Product manager",
                "semenov@mail.ru", "7111111111", 50000, 28);
        people[2] = new Person("Petrov Petr", "Developer",
                "petrov@mail.ru", "72222222222", 60000, 35);
        people[3] = new Person("Smirnov Oleg", "Developer",
                "smirnov@mail.ru", "73333333333", 45000, 41);
        people[4] = new Person("Ivanova Anna", "Designer",
                "ivanova@mail.ru", "74444444444", 52000, 27);

        for (Person person : people) {
            if (person.getAge() > 40) {
                person.print();
            }
        }
        System.out.println("--------------------------");
        for (Person person : people) {
            if (person.getPayday() > 45000) {
                person.print();
            }
        }
    }
}
