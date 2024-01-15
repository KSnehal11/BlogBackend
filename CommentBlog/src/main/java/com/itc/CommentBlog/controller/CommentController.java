package com.itc.CommentBlog.controller;

import com.itc.CommentBlog.model.Comment;
import com.itc.CommentBlog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    public CommentService service;
    @CrossOrigin(allowedHeaders = "*",origins = "http://localhost:4200")
    @PostMapping("/addComment")
    public ResponseEntity<?> addComment(@RequestBody Comment c)
    {
        return new ResponseEntity<>(service.addComment(c), HttpStatus.CREATED);
    }
    @CrossOrigin(allowedHeaders = "*",origins = "http://localhost:4200")
    @GetMapping("/getComment")
    public ResponseEntity<?> getComment()
    {
        return new ResponseEntity<>(service.getComment(),HttpStatus.OK);
    }
}
