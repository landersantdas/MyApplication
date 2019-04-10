package myapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Name {

    private String first;
    private String middle;
    private String last;

    public Name() {
    }

    //getters
    public String getFirst() {
        return this.first;
    }

    public String getMiddle() {
        return this.middle;
    }

    public String getLast() {
        return this.last;
    }

    //setters
    public void setFirst(String first) {
        this.first = first;
    }
    
    public void setMiddle(String middle) {
        this.middle = middle;
    }
    
    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return first + 
                " " + middle + 
                ". " + last;
    }
}