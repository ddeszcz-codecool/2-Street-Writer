package com.codecool.streetwriter;

import com.codecool.streetwriter.house.House;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Street {
    private String name;
    private Set<House> houses;


    public Street(String name) {
        this.name = name;
        this.houses = new HashSet<>();
    }

    public Street(String name, House... houses) {
        this.name = name;
        this.houses = new HashSet<>(Arrays.asList(houses));
    }

    public void build(House house) {
        houses.add(house);
    }

    public boolean rename(String newName) {
        if(isStringOnlyLetters(newName)) {
            this.name = newName;
            return true;
        }
        return false;
    }

    private boolean isStringOnlyLetters(String str) {
        if(str == null)
            return false;
        char[] stringConvertedToCharactersArray = str.toCharArray();
        for (char character:stringConvertedToCharactersArray) {
            if(!Character.isAlphabetic(character))
                return false;
            }
        return true;
    }
}
