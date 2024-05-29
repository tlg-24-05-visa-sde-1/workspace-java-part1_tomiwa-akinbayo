package net.people;

import java.time.LocalDate;
import java.time.Period;

// Immutable class. written in such a way that instances of this class once created can not have their
// properties changes. No public methods available to do this.

class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
    Returns the person age in whole years
    HInt: this is the period of time between birthDate and todays date in whole years.
     */
    public int age() {
        return Period.between(birthDate(), LocalDate.now()).getYears();
    }

    public String name() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person: name=%s, birthDate=%s", name(), birthDate());
    }
}