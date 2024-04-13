package oop.composition_aggregation.lists.todoapp;

import java.time.LocalDateTime;

public class TodoItem {
    private String title;
    private boolean completed;
    private LocalDateTime createdAt = LocalDateTime.now();

    public TodoItem(String title, boolean completed, LocalDateTime createdAt) {
        this.title = title;
        this.completed = completed;
        this.createdAt = createdAt;
    }

    public TodoItem(String title, boolean completed) {
        this(title, completed, LocalDateTime.now());
    }

    public TodoItem(String title) {
        this(title, false);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // shko te halla - V (2024-04-10...)
    //<input type='checkbox' checked><p>title</p><label>daten</label>
    @Override
    public String toString() {
        return String.format("%s - %s (%s)",
                title,
                completed ? "YES" : "NO",
                createdAt.toLocalDate());
    }
}









