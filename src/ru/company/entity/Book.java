package ru.company.entity;

public abstract class Book {

    protected Integer cipher;
    protected String author;
    protected String title;
    protected Integer year;
    protected String publishingHouse;

    public Book(Integer cipher, String author, String title, Integer year, String publishingHouse) {
        this.cipher = cipher;
        this.author = author;
        this.title = title;
        this.year = year;
        this.publishingHouse = publishingHouse;
    }

    public Integer getCipher() {
        return cipher;
    }

    public void setCipher(Integer cipher) {
        this.cipher = cipher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

}
