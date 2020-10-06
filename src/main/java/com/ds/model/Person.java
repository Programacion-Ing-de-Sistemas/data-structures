package com.ds.model;

public class Person {

    private String personName;
    private int personAge;
    private int personDni;

    public Person(String name, int age, int dni) {
        this.setName(name);
        this.setAge(age);
        this.setDni(dni);
    }

    public String getName() {
        return this.personName;
    }

    public void setName(String name) {
        this.personName = name;
    }

    public int getAge() {
        return this.personAge;
    }

    public void setAge(int age) {
        this.personAge = age;
    }

    public int getDni() {
        return this.personDni;
    }

    public void setDni(int dni) {
        this.personDni = dni;
    }

}
