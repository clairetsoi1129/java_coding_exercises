package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        return "Manchester".equalsIgnoreCase(person.getCity());
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        return person.getAge()>=ageLimit;
    }
    
}
