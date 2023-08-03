package lk.IJSE.entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

public class Author {
    @Id
    String A_id;
    String First_name;
    String Last_name;


    @OneToOne
    private Book B_id;


    public Author() {

    }

    public Author(String A_id, String First_name, String Last_name) {
        this.A_id = A_id;
        this.First_name = First_name;
        this.Last_name = Last_name;

    }

    public void setA_id(String a_id) {
        A_id = a_id;
    }


    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }
}
