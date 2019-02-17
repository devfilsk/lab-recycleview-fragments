package com.example.labrecycleview.models;

import java.io.Serializable;

public class UserModel implements Serializable {

    private String name, city, text;
    private int age;

    public UserModel(){

    }

    public UserModel(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public UserModel(String name, String city, String text, int age) {
        this.name = name;
        this.city = city;
        this.text = text;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void incrementeAge() {
        this.age ++;
    }
}
