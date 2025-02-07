package com.codesquad.todo.web.domain;

public class User {
    private long id;
    private String name;
    private String userId;
    private String password;
    private String profileImage;

    public User(long id, String name, String userId, String password, String profileImage) {
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.profileImage = profileImage;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getProfileImage() {
        return profileImage;
    }
}
