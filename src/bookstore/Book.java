package bookstore;

import java.sql.Date;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Book {
	
    private int id;
    private String title;
    private String Author;
    private double Price;
    private Date ReleaseDate;
    

    // constructeur vide
    public Book() {
    	super();
    }

 
    // constructeur avec parametres
    public Book(String title, String Author, double Price, Date ReleaseDate) {

        this.title = title;
        this.Author = Author;
        this.Price = Price;
        this.ReleaseDate = ReleaseDate;
      
    }


    //getters
    public int getId() {
        return id;
    }
    public Date getReleaseDate() {
        return ReleaseDate;
    }


    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return Price;
    }

    public String getAuthor() {
        return Author;
    }

    //setters
    public void setAuthor(String Author) {
        this.Author = Author;
    }


    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(Date ReleaseDate) {
        this.ReleaseDate = ReleaseDate;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    //string toString method
    
   @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", Author=" + Author + ", Price=" + Price + ", ReleaseDate=" + ReleaseDate + "}";
    }
     
    
}


