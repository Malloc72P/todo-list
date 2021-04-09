package com.codesquad.todo.web.service.dto;

import com.codesquad.todo.web.domain.Task;

import java.time.LocalDateTime;

public class TaskDto {
    private final long id;
    private final String taskTitle;
    private final String taskContent;
    private final String authorName;
    private final LocalDateTime createdDateTime;

    public TaskDto(Task task) {
        this.id = task.getId();
        this.taskTitle = task.getTaskTitle();
        this.taskContent = task.getTaskContent();
        this.authorName = task.getAuthor().getName();
        this.createdDateTime = task.getCreatedDateTime();
    }

    public long getId() {
        return id;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public String getAuthorName() {
        return authorName;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }
}
