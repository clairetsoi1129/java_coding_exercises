package com.techreturners.exercise002;

public class Person {
    @SuppressWarnings("FieldMayBeFinal")
    private String firstName;
    @SuppressWarnings("FieldMayBeFinal")
    private String lastName;
    @SuppressWarnings("FieldMayBeFinal")
    private String city;
    @SuppressWarnings("FieldMayBeFinal")
    private int age;

    public Person(String firstName, String lastName, String city, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }

    @SuppressWarnings("unused")
    public String getFirstName() {
        return firstName;
    }

    @SuppressWarnings("unused")
    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}
