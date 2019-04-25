package com.wilson.ratingservice;

public class Rating {
    private Long id;
    private Long bookId;
    private int stars;
    
    public Rating(Long id ,Long bookId ,Integer stars) {
    	this.id = id;
    	this.bookId = bookId;
    	this.stars = stars;
	}
 
    public Long getBookId() {
		return bookId;
	}
    public Long getId() {
		return id;
	}
    public int getStars() {
		return stars;
	}
    public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
    public void setId(Long id) {
		this.id = id;
	}
    public void setStars(int stars) {
		this.stars = stars;
	}
    
}