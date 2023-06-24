package com.ps20520;

import java.util.Date;

public class User_staff {
    private String username;
    private Date brith;
    private String password;
    private String photo_user;

    private boolean gender;
    private String nationality;
    private boolean married;
    private String[] favorites;
    private String note;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBrith() {
        return brith;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String[] getFavorites() {
        return favorites;
    }

    public void setFavorites(String[] favorites) {
        this.favorites = favorites;
    }

    public String getNote() {
        return note;
    }

    public String getPhoto_user() {
        return photo_user;
    }

    public void setPhoto_user(String photo_user) {
        this.photo_user = photo_user;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String[] getFavorite() {
        return favorites;
    }

    public void setFavorite(String[] favorite) {
        this.favorites = favorite;
    }

    public String getNotes() {
        return note;
    }

    public void setNotes(String notes) {
        this.note = notes;
    }

}
