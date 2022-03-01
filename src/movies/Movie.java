package movies;

public class Movie {

    // private fields for name and category✅
    private String movieName;
    private String categoryName;


    // constructor sets both
    public Movie(String movieName, String categoryName) {
        this.movieName = movieName;
        this.categoryName = categoryName;
    }

    // create methods to access these properties and change them (getters and setters)✅
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
