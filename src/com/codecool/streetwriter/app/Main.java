package com.codecool.streetwriter.app;

import com.codecool.streetwriter.Street;
import com.codecool.streetwriter.house.House;
import com.codecool.streetwriter.house.Person;

public class Main {

    public static void main(String[] args) {
        House kossuth12 = new House(12); // Object creation
        House kossuth14 = new House(14); // Object creation

        Street kossuthStreet = new Street("Kossuth", kossuth12, kossuth14); // Object creation
        Street petofiStreet;
        new Street("Petofi"); // Object creation


        if (!kossuthStreet.rename("Square of 56ers")) {
            System.out.println("Great! Rename validation is working! :) ");
        }

        Person richieRich = new Person("Richie Rich"); // Object creation
        kossuth12.moveIn(richieRich);
        richieRich.buy(kossuth12);
        richieRich.buy(kossuth14);

        kossuth14.moveIn(new Person("Resident Evil")); // Object creation

        System.out.println("Check object relationships here! :)");
    }
}
