package com.itc.Dashboard.controller;

import com.itc.Dashboard.model.Blog;
import com.itc.Dashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class DashboardController {
    @Autowired
    public DashboardService service;

    @CrossOrigin(allowedHeaders = "*",origins = "http://localhost:4200")
    @PostMapping("/addBlog")
    public ResponseEntity<?> addBlog(@RequestBody Blog b)
    {
        return new ResponseEntity<>(service.addBlog(b),HttpStatus.CREATED);
    }
    @CrossOrigin(allowedHeaders = "*",origins = "http://localhost:4200")
    @GetMapping("/getBlog")
    public ResponseEntity<?> getBlog()
    {
        return new ResponseEntity<>(service.getBlog(),HttpStatus.OK);
    }
    @CrossOrigin(allowedHeaders = "*",origins = "http://localhost:4200")
    @GetMapping("/getBlogById/{id}")
    public ResponseEntity<?> getBlogById(@PathVariable int id)
    {
        return new ResponseEntity<>(service.getBlogById(id),HttpStatus.CREATED);
    }




}
