public class Book {
    String title;
    int yearOfPublication;
    private Author author;

    public Book(String title, int yearOfPublication, Author author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;

    }

    public String getTitle() {
        return this.title;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;

    }
}
