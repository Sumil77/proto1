package com.prototype1.proto1.User;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "clients")
public class client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(
            name = "fname",
            length = 15
    )
    private String firstName;

    @Column(
            name = "lname",
            length = 15
    )
    private String lastName;

    @Column(unique = true)
    private String emailId;

    @Column(unique = true)
    private String phoneNumber;

    private Integer age;

    @NotBlank
    private String password;

    public client(String firstName, String lastName, String emailId, String phno, Integer age, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        phoneNumber = phno;
        this.age = age;
        this.password = password;
    }

    public client() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public @NotBlank String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank String password) {
        this.password = password;
    }
}
