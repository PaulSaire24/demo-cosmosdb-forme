package com.example.democosmosdb.generics;

public class Book implements Boxable {
    private String title;
    private String author;
    private Integer weight;

    public Book(String author, String title, Integer weight) {
        this.author = author;
        this.title = title;
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", weight=" + weight +
                '}';
    }
}
