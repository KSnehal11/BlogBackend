package com.itc.CommentBlog.service;

import com.itc.CommentBlog.Repository.CommentRepo;
import com.itc.CommentBlog.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentService {
    @Autowired
    CommentRepo crepo;
    public Comment addComment(Comment c) {
        return crepo.save(c);
    }


    public List<Comment> getComment() {
        return crepo.findAll();
    }
}
