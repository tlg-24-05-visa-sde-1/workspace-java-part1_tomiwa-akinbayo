package net.people;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Tomiwa", LocalDate.of(1994, 01, 19));

        // print: <name> is <age> years old
        System.out.printf("%s is %s years old\n", p1.name(), p1.age());

        System.out.println(p1);
        System.out.println(p1.age());
        System.out.println();

//        Person p2 = new Person();

//        System.out.printf("%s is %s years old\n", p2.name(), p2.age());

    }
}