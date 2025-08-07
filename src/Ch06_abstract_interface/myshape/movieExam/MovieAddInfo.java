package Ch06_abstract_interface.myshape.movieExam;

public class MovieAddInfo extends Movie implements MovieDetail{
    String genre;
    double rating;

    public MovieAddInfo(String title, String director, int year, String genre, double rating) {
        super(title, director, year);
        this.genre = genre;
        this.rating = rating;
    }


    @Override
    public void showMovieDetailInfo() {

    }

    @Override
    public void showMovieInfo() {

    }
}
