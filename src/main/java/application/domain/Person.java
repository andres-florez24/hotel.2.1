package application.domain;

import application.domain.enums.PersonState;

public abstract class Person {



    private int id ;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private PersonState state;

    public Person(){

    }

    public Person(int id , String name, String lastName, String email, String password, PersonState state) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.state = state;
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PersonState getState() {
        return state;
    }

    public void setState(PersonState state) {
        this.state = state;
    }


    @Override
    public String toString() {
        return "person{" +
                "id : " + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", state=" + state +
                '}';
    }
}




