package myapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Name {

    private String firstName;
    private String midName;
    private String lastName;

    public Name() {
    }

    //getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getMidName() {
        return this.midName;
    }

    public String getLastName() {
        return this.lastName;
    }

    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setMidName(String midName) {
        this.midName = midName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + midName + " " + lastName;
    }
}