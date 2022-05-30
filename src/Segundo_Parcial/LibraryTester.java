package Segundo_Parcial;

import java.time.LocalDate;

public class LibraryTester {
    public static void main(String[] args) {
        // Ejemplo de uso para determinar si una fecha está después que otra fecha
        System.out.println(LocalDate.of(2018,12,3).isAfter(LocalDate.of(2018,12,1)));

        Library library = new Library().addBook("Book 1", 1).addBook("Book 2", 1).addBook("Book 3", 3);

        // El estudiante Student 1 pide el libro Book 1
        PersonToLend s1 = new PersonToLend("Student 1",TimesForLend.STUDENT);
        library.borrowBook(s1, "Book 1", LocalDate.of(2018, 12, 1));
        // El estudiante Student 2 pide el libro Book 3

       PersonToLend s2 = new PersonToLend("Student 2",TimesForLend.STUDENT);;
        library.borrowBook(s2, "Book 3", LocalDate.of(2018, 12, 1));
        // El estudiante Student 3 pide el libro Book 3

        PersonToLend s3 = new PersonToLend("Student 3",TimesForLend.STUDENT);
        library.borrowBook(s3, "Book 3", LocalDate.of(2018, 12, 2));

        // Lista los préstamos vencidos para la fecha recibida
        library.printDueLoansBooks(LocalDate.of(2018, 12, 4));
        library.returnBook(s1); // El estudiante Student 1 devuelve el libro que pidió
        library.returnBook(s2); // El estudiante Student 2 devuelve el libro que pidió
        library.returnBook(s3); // El estudiante Student 3 devuelve el libro que pidió

        // El profesor Professor 1 es Responsable y pide el libro Book 1

       PersonToLend p1 = new PersonToLend("Profesor 1",TimesForLend.RESPONSABLE);
        library.borrowBook(p1, "Book 1", LocalDate.of(2018, 12, 4));

        // El profesor Professor 2 es Jefe de Trabajos Prácticos y pide el libro Book 3

       PersonToLend p2 =new PersonToLend("Profesor 2",TimesForLend.JEFETP);
        library.borrowBook(p2, "Book 3", LocalDate.of(2018, 12, 4));

        // El profesor Professor 3 es Ayudante y pide el libro Book 3

       PersonToLend p3 = new PersonToLend("Profesor 3",TimesForLend.AYUDANTE);
        library.borrowBook(p3, "Book 3", LocalDate.of(2018, 12, 4));

        library.printDueLoansBooks(LocalDate.of(2018, 12, 10));
        library.printDueLoansBooks(LocalDate.of(2018, 12, 15));
        library.printDueLoansBooks(LocalDate.of(2018, 12, 16));
        library.printDueLoansBooks(LocalDate.of(2018, 12, 17));

        try {
            library.borrowBook(s1, "Other Book", LocalDate.of(2018,12,3));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
