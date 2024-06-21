public class Main {

    public static void main(String[] args) {

        Author kurtVonnegut = new Author("Курт", "Воннегут");
        Author kanaeMinato = new Author("Канаэ", "Минато");

        Book catsCradle = new Book("Колыбель для кошки", 2001, kurtVonnegut);
        Book guilty = new Book("Виновен", 2022, kanaeMinato);
        guilty.setYearOfPublication(2015);

        System.out.println("Первая книга: " + "\"" + catsCradle.getTitle() + "\"" + ", написанна в " + catsCradle.getTitle() + " году. Автор: " + kurtVonnegut.getFirstName() + " " + kurtVonnegut.getSecondName());
        System.out.println("Вторая книга: " + "\"" + guilty.getTitle() + "\"" + ", написанна в " + guilty.getYearOfPublication() + " году. Автор: " + kanaeMinato.getFirstName() + " " + kanaeMinato.getSecondName());

    }
}