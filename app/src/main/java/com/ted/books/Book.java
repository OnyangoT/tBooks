package com.ted.books;

import java.lang.ref.SoftReference;

public class Book {
    public String id;
    public String title;
    public String subTitle;
    public String[] authors;
    public String publisher;
    public String publishedDate;

    public Book(String id, String title, String subTitle, String[] authors, String publisher, String publishDate) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.authors = authors;
        this.publisher = publisher;
        this.publishedDate = publishDate;
    }
}
