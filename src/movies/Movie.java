package movies;

public class Movie {

    // private fields for name and category✅
    private String name;
    private String category;


    // constructor sets both✅
    public Movie(String movieName, String categoryName) {
        this.name = movieName;
        this.category = categoryName;
    }
    //Constructor format - Method aka Function


    // create methods to access these properties and change them (getters and setters)✅
    public String getMovieName() {

        return name;
    }

    public void setMovieName(String movieName) {

        this.name = movieName;
    }

    public String getCategoryName() {

        return category;
    }

    public void setCategoryName(String categoryName) {

        this.category = categoryName;
    }
}
