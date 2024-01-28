package com.blogs.dashboard.model;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;


import java.util.List;

@Entity
public class dashboardModel {
   @Id
   private int id;
   private String author;
   private String description;
   private String title;
   private String image;


   public dashboardModel(int id, String author, String description, String title , String image) {
      this.id = id;
      this.author = author;
      this.description = description;
      this.title = title;
      this.image=image;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getImage() {
      return image;
   }

   public void setImage(String image) {
      this.image=image;
   }


}