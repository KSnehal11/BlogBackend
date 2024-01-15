package com.itc.CommentBlog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Comment {
    @Id
    private String username;
    private String comment;

    public Comment() {
    }

    public Comment(String username, String comment) {
        this.username = username;
        this.comment = comment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
