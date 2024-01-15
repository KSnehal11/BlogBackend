package com.itc.CommentBlog.Repository;

import com.itc.CommentBlog.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<Comment,String> {
}
