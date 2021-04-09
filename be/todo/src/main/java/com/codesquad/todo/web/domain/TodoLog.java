package com.codesquad.todo.web.domain;

import java.time.LocalDateTime;

public class TodoLog {
    private final long id;
    private final String action;
    private final User author;
    private final LocalDateTime createdDateTime;

    public TodoLog(long id, String action, User author) {
        this.id = id;
        this.action = action;
        this.author = author;
        this.createdDateTime = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public String getAction() {
        return action;
    }

    public User getAuthor() {
        return author;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }
}
