package com.blogs.dashboard.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Document(collection = "blogs")
public class dashboardModel {
   @Id
   private int id;
   private String img;
   private String title;
   private String author;
   private String desp;




   public dashboardModel(int id, String img , String title , String author, String desp ) {
      this.id = id;
      this.author = author;
      this.desp = desp;
      this.title = title;
      this.img=img;
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
      return desp;
   }

   public void setDescription(String description) {
      this.desp = description;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getImage() {
      return img;
   }

   public void setImage(String image) {
      this.img=image;
   }


}