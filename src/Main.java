public class Main {

    public static void main(String[] args) {

        Author kurtVonnegut = new Author("Курт", "Воннегут");
        Author kanaeMinato = new Author("Канаэ", "Минато");

        Book catsCradle = new Book("Колыбель для кошки", 2001, kurtVonnegut);
        Book guilty = new Book("Виновен", 2022, kanaeMinato);
        guilty.setYearOfPublication(2015);

        System.out.println("Первая книга: " + "\"" + catsCradle.title + "\"" + ", написанна в " + catsCradle.yearOfPublication
                + " году. Автор: " + kurtVonnegut.firstName + " " + kurtVonnegut.secondName);
        System.out.println("Вторая книга: " + "\"" + guilty.title + "\"" + ", написанна в " + guilty.yearOfPublication +
                " году. Автор: " + kanaeMinato.firstName + " " + kanaeMinato.secondName);

    }
}