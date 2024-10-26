package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview mr1 = new MovieReview();
        mr1.title = "인생은 아름다워";
        mr1.review = "9.8/10";

        MovieReview mr2 = new MovieReview();
        mr2.title = "인터스텔라";
        mr2.review = "9.6/10";

        MovieReview[] movieReviews = {mr1, mr2};

        for (MovieReview m : movieReviews) {
            System.out.println("영화이름 : " + m.title + " 영화평점 : " + m.review );
        }
    }





}
