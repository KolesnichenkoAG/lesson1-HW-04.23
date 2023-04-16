package gb.ru.lesson1.person;

import gb.ru.lesson1.person.Person;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("Ivanov", "Vladimir").setMiddleName("Ivanovich").setAddress("Isaeva 13").setAge(45).build();
        System.out.println(person.getAddress());
    }
}
