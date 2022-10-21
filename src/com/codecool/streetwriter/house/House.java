package com.codecool.streetwriter.house;

import java.util.HashSet;
import java.util.Set;

public class House {
    private int address;
    private Person owner;
    private Set<Person> residents;

    public House(int address) {
        this.address = address;
        this.residents = new HashSet<>();
        this.owner = new Person("No owner");
    }

    public void moveIn(Person resident) {
        residents.add(resident);
    }

    public void purchaseBy(Person person){
        this.owner = person;
    }
}
