package com.example.model;

public class User {

    private String userName;

    private String firstName;

    private String lastName;

    private int age;

    private String deactivatedDate;

    public User() {
    }

    public User(String userName, String firstName, String lastName, int age, String deactivatedDate) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.deactivatedDate = deactivatedDate;
    }

    /**
     * Retrieves the user name of the user.
     * 
     * @return the user name as a String
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDeactivatedDate() {
        return deactivatedDate;
    }

    public void setDeactivatedDate(String deactivatedDate) {
        this.deactivatedDate = deactivatedDate;
    }

}
