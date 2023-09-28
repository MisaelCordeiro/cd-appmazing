package com.campusdual.appmazing.model.dto;




public class ContactDTO {
    private int id;
    private String name;
    private String first_surname;
    private String last_surname;
    private int phone_number;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_surname() {
        return first_surname;
    }

    public void setFirst_surname(String first_surname) {
        this.first_surname = first_surname;
    }

    public String getLast_surname() {
        return last_surname;
    }

    public void setLast_surname(String last_surname) {
        this.last_surname = last_surname;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
