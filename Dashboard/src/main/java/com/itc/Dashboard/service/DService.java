package com.itc.Dashboard.service;


import com.itc.Dashboard.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DService {

    public Blog addBlog(Blog b);
    public List<Blog> getBlog();
    public Blog getBlogById(int id);


};
