package com.codecool.streetwriter.house;

import java.util.HashSet;
import java.util.Set;

public class Person {
    private String name;
    private Set<House> properties;

    public Person(String name) {
        this.name = name;
        this.properties = new HashSet<>();
    }

    public void buy(House house) {
        properties.add(house);
        house.purchaseBy(this);
    }
}
