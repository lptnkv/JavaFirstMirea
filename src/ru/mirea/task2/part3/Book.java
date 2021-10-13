package ru.mirea.task2.part3;

public class Book {
    String author;
    String name;
    int year;
    int n_pages;

    public Book(String name, String author, int year, int n_pages) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.n_pages = n_pages;
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String author) {
        this.author = author;
        this.name = name;
    }

    public Book(String name, String author, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getN_pages() {
        return n_pages;
    }

    public void setN_pages(int n_pages) {
        this.n_pages = n_pages;
    }

    @Override
    public String toString() {
        if (this.name != null && this.author != null && this.year != 0 && this.n_pages != 0){
            return "book: " + this.name + ", written by: " +
                    this.author + " in " + this.year + ", number of pages: "
                    + this.n_pages;
        }
        if (this.name != null && this.author != null && this.year != 0){
            return "book: " + this.name + ", written by: " +
                    this.author + " in " + this.year;
        }
        if (this.name != null && this.author != null){
            return "book: " + this.name + ", written by: " + this.author;
        }
        return "book: " + this.name + ", author: unknown";
    }
}
