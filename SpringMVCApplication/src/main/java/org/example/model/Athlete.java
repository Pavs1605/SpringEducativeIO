package org.example.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.util.Date;

@Component
public class Athlete {
@NotNull(message = "This is required field")
@Max(value=100, message = "Value must be less than orequal to 100")
@Min(value=1, message = "Value must be greater than or equal to 1")
    private Integer rank;
    private String firstName;
    @NotEmpty(message = "This is a required field.")
    private String lastName;
    private String country;
    private String handedness;
    private String[] grandSlams;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date lastWon;

    @Pattern(regexp="^\\$[0-9]{1,3},[0-9]{3},[0-9]{3}$", message="Incorrect format" )
    private String prizeMoney;


    public Athlete() {

    }

    public Date getLastWon() {
        return lastWon;
    }

    public void setLastWon(Date lastWon) {
        this.lastWon = lastWon;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHandedness() {
        return handedness;
    }

    public void setHandedness(String handedness) {
        this.handedness = handedness;
    }

    public String[] getGrandSlams() {
        return grandSlams;
    }

    public void setGrandSlams(String[] grandSlams) {
        this.grandSlams = grandSlams;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(String prizeMoney) {
        this.prizeMoney = prizeMoney;
    }
}