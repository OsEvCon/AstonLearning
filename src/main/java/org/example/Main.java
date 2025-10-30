package org.example;

import module1.Book;
import module1.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivanov Ivan");
        Student student2 = new Student("Petrov Petr");
        Student student3 = new Student("Sidorov Sidor");

        student1.addBook(new Book("Война и мир", 1225, 1869));
        student1.addBook(new Book("Преступление и наказание", 430, 1866));
        student1.addBook(new Book("Мастер и Маргарита", 480, 1967));
        student1.addBook(new Book("1984", 328, 1949));
        student1.addBook(new Book("Код да Винчи", 454, 2003));

        student2.addBook(new Book("Улисс", 730, 1922));
        student2.addBook(new Book("Властелин колец", 1178, 1954));
        student2.addBook(new Book("Анна Каренина", 864, 1877));
        student2.addBook(new Book("Сто лет одиночества", 448, 1967));
        student2.addBook(new Book("Девушка в паутине", 432, 2015));

        student3.addBook(new Book("Гарри Поттер и философский камень", 320, 1997));
        student3.addBook(new Book("Маленький принц", 96, 1943));
        student3.addBook(new Book("Атлант расправил плечи", 1168, 1957));
        student3.addBook(new Book("Портрет Дориана Грея", 254, 1890));
        student3.addBook(new Book("Три товарища", 384, 2021));

        List<Student> students = new ArrayList<>(List.of(student1, student2, student3));

        students.stream()
                .peek(student -> System.out.println(student.toString()))
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparing(Book::getPages))
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println("Год выпуска: " + year),
                        () -> System.out.println("Книга отсутствует")
                );

    }
}