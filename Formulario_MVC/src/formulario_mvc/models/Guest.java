/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario_mvc.models;

import java.text.SimpleDateFormat;

/**
 *
 * @author USUARIO
 */
public class Guest {
    
    //-----------------------------------------------------------------------
    //		Attributes
    //-----------------------------------------------------------------------
    private String name;
    private String phoneNumber;
    private String address;
    private String fullDate;
    private String day;
    private String month;
    private String year;
    private Genre genre;
    private boolean atc;


    //-----------------------------------------------------------------------
    //		Methods
    //-----------------------------------------------------------------------
    @Override
    public String toString()
    {
        //SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        fullDate = getMonth() + "/" + getDay() + "/" + getYear();

        return getName()+ ";" + getPhoneNumber() +  ";" +
                getGenre() + ";" + fullDate + ";" + getAddress() +
                ";" + (getAtc()== true ? "1" : "0");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean getAtc() { return atc; }

    public void setAtc(boolean atc) {
        this.atc = atc;
    }
    
    
    
}
