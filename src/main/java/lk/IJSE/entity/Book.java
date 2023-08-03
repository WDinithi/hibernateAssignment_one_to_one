package lk.IJSE.entity;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class Book {
    @Id
    String B_id;
    String B_name;
    String ISBN;

    public void setB_id(String b_id) {
        B_id = b_id;
    }
    public void setAuthor(Author author){
        this.author=author;

    }

    @OneToOne
    public Author author;

    public void setB_name(String b_name) {
        B_name = b_name;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Book(){

    }
    public Book(String B_id, String B_name, String ISBN){

    }

}
