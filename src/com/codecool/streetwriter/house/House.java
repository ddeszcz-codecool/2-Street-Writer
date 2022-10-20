package com.codecool.streetwriter.house;

public class House {
    private int address;
    private Person owner;

    public House(int address) {
        this.address = address;
    }

    public void moveIn(Person resident) {
        residents.add(resident);
    }

}
