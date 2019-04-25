package com.wilson.bookservice;

public class Book {
    private Long id;
    private String author;
    private String title;
    
    public Book( Long id ,String title, String author) {
    	this.id = id;
		this.title = title;
    	this.author = author;
	}
 
    public String getAuthor() {
		return author;
	}
    public Long getId() {
		return id;
	}
    public String getTitle() {
		return title;
	}
    public void setAuthor(String author) {
		this.author = author;
	}
    public void setId(Long id) {
		this.id = id;
	}
    public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", title=" + title + "]";
	}
    
}