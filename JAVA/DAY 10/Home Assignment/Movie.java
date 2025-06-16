public class Movie {
    String title;
    String director;
    int releaseyr;

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release year: " + releaseyr);
    }



    public static void main(String args[]) {
        Movie m1 = new Movie();
        m1.title = "Bahubali";
        m1.director = "Yash";
        m1.releaseyr = 2018;

        Movie m2 = new Movie();
        m2.title = "Bahubali 2";
        m2.director = "Yash";
        m2.releaseyr = 2022;

        m1.display();
        m2.display();
    }
}
