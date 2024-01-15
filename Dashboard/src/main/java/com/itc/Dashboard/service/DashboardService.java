package com.itc.Dashboard.service;

import com.itc.Dashboard.model.Blog;
import com.itc.Dashboard.repository.BlogRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService implements DService{
    @Autowired
    public BlogRepo brepo;


    @Override
    public Blog addBlog(Blog b) {
        System.out.println(b.getDescription());
        return brepo.save(b);
    }

    @Override
    public List<Blog> getBlog() {
        return brepo.findAll();
    }

    @Override
    public Blog getBlogById(int id) {
        return brepo.findById(id).get();
    }




}
