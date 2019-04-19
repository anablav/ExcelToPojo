package com.example.exceltopojo.model;

//@Sheet
public class Employee {
    //@SheetColumn("Name")
    private String name;

    //@SheetColumn("Age")
    private Integer age;


    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
