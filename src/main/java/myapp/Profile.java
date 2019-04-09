package myapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Profile {

    private String id;
    private Boolean active;
    private Boolean blocked;
    private String balance;
    private String picture; 
    private int age;
    private Name name;
    private String email;
    private String phone;
    private String address;
    private String profile;
    private String dateRegistered;

    public Profile() {
    }

    //getters
    public String getId() {
        return id;
    }

    public Boolean getActive() {
        return active;
    }

    public Boolean getBlocked() {
        return blocked;
    }
    
    public String getBalance() {
        return balance;
    }

    public String getPicture() {
        return picture;
    }
    
    public int getAge() {
        return age;
    }
    
    public Name getName(){
        returen name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getProfile() {
        return profile;
    }
    
    public String getDateRegistered() {
        return dateRegistered;
    }

    //setters
    public void setId(String id) {
        this.id = id;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void setName(Name name) {
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setProfite(String profile) {
        this.profile = profile;
    }
    
    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    // @Override
    // public String toString() {
    //     return "Quote{" +
    //             "type='" + type + '\'' +
    //             ", value=" + value +
    //             '}';
    // }
}