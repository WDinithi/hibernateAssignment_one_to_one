package lk.IJSE;

import lk.IJSE.entity.Author;
import lk.IJSE.entity.Book;
import lk.IJSE.utill.FactoryConfuguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author author= new Author();
        author.setA_id("A001");
        author.setFirst_name("Dinithi");
        author.setLast_name("Chethana");

        author.setA_id("A002");
        author.setFirst_name("Chethana");
        author.setLast_name("purnima");


        Book book = new Book();
        book.setB_id("B001");
        book.setB_name("Sister");
        book.setISBN("1234");
        book.setAuthor(author);


        Book book1=new Book();
        book1.setB_id("B002");
        book1.setB_name("hallooo");
        book1.setISBN("1234");
        List<Book> bookList=new ArrayList<>();
        bookList.add(book);
        bookList.add(book1);
        Session session= FactoryConfuguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

        session.persist(author);
        session.persist(book);
        session.persist(book1);

        transaction.commit();
        session.close();

    }
}
