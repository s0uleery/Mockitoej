package org.app;

import org.json.JSONObject;
import org.app.Book;

public class BookSearch {

    BookService rbs;

    public BookSearch(BookService rbs) {

        this.rbs= rbs;
    }

    public Book getBook(int isbn){

        String json = rbs.search(isbn);
        JSONObject obj = new JSONObject(json);
        String title = (String) obj.get("titulo");
        return new Book(title);
    }
}
