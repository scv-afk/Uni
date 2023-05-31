package com.n3dev.socialmedia.models;

public class User {

    private String id;
    private String email;
    private String username;
    private String descri;
    private String phone;
    private String imageProfile;
    private String imageCover;
    private long timestamp;

    public User(){

    }

    public User(String id, String email, String username, String description, String phone, long timestamp, String imageProfile, String imageCover) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.descri = descri;
        this.phone = phone;
        this.timestamp = timestamp;
        this.imageProfile = imageProfile;
        this.imageCover = imageCover;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    //PHONE GETTER && SETTER

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //GETTER && SETTER TIMESTAMP

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }



    //IMAGENES de PERFIL y COVER
    public String getImageProfile() {
        return imageProfile;
    }

    public void setImageProfile(String imageProfile) {
        this.imageProfile = imageProfile;
    }

    public String getImageCover() {
        return imageCover;
    }

    public void setImageCover(String imageCover) {
        this.imageCover = imageCover;
    }
}
