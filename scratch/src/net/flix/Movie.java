package net.flix;

public class Movie {
    // instance variables or fields
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;


    // constructors

    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear, Double revenue) {
        this(title);        // delegate to ctor above that handles title
        setReleaseYear(releaseYear);
        setRevenue(revenue);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre){
        this(title, releaseYear, revenue);  // delegate to ctor above
        setRating(rating);
        setGenre(genre);
    }

    // business methods - play(), stop() ...

    // accessor methods aka get/set


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    // If revenue is null, use %s else use %,.2f
    public String toString() {
        return String.format("Movie: title= %s, release year=%s, revenue=%,.2f, rating=%s, genre=%s",
                getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());

//        return "Movie: title= " + getTitle() + ", release year= "
//                + getReleaseYear() + ", revenue = " + getRevenue()
//                + ", rating: " + getRating() + " genre: " + getGenre();
    }
}