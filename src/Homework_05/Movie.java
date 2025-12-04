package Homework_05;
public class Movie {
    /*  1. "Библиотека фильмов"
      Тема: Создание и использование классов
      Описание:
      Создай класс Movie с полями:
      title — название фильма
      rating — рейтинг фильма (от 0 до 10)
      Добавь:
      Конструктор, который принимает title и rating.
              Метод showInfo(), который выводит информацию о фильме.
      Метод isGoodMovie(), который возвращает true, если рейтинг больше или равен 8, иначе false
  */
    private String title;
    private double rating;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public void showInfo() {
        System.out.println("Title:" + title + " Rating: " + rating);
    }

    public double getRating() {
        return rating;
    }

    public void isGoodMovie() {
        if (rating >= 8 && rating <= 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}