package com.codesquad.todo.web.domain;

public class User {
    private final long id;
    private final String name;
    private final String userId;
    private final String password;
    private final String profileImage;

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
