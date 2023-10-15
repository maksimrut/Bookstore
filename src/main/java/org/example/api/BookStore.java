package org.example.api;

import org.example.model.Book;
import org.example.service.BookService;

import java.util.Scanner;

public class BookStore {

    private final BookService serviceBook;
    private Scanner scanner;
    private boolean isFinished = false;

    public BookStore(BookService serviceBook) {
        this.serviceBook = serviceBook;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("THE PROGRAM IS RUNNING.");

        System.out.println("BookStore Application");
        System.out.println("---------------------");
        while (!isFinished) {
            showMainMenu();
        }
    }

    public void finish() {
        isFinished = true;
        System.out.println("Good bye!");
        System.out.println("THE PROGRAM SUCCESSFULLY FINISHED.");
    }

    public void showMainMenu() {
        System.out.println("Main menu:");
        System.out.println("----------");
        System.out.println("1. Book service");
        System.out.println("2. Order service");
        System.out.println("3. Exit application");
        actionMainMenu();
    }

    public void actionMainMenu() {
        System.out.print("Enter the number (1-3) to continue: \n");
        String number = scanner.nextLine();
        switch (number) {
            case "1":
                showBookServiceMenu();
                break;
            case "2":
                showOrderServiceMenu();
                break;
            case "3":
                finish();
                break;
            default:
                System.out.println("You've entered wrong number. Please, try again.\n");
        }
    }

    public void showBookServiceMenu() {
        boolean continueMenu = true;
        while (continueMenu) {
            System.out.println("BookServiceMenu");
            System.out.println("---------------");
            System.out.println("1. Register a new book to manage");
            System.out.println("2. List books");
            System.out.println("3. Back");

            System.out.print("Enter the number (1-3) to continue: \n");
            String number = scanner.nextLine();
            switch (number) {
                case "1":
                    showBookServiceCreateMenu();
                    break;
                case "2":
                    showBookServiceListMenu();
                    break;
                case "3":
                    continueMenu = false;
                    break;
                default:
                    System.out.println("You've entered wrong number. Please, try again.\n");
            }
        }

    }

    public void showBookServiceCreateMenu() {
        System.out.println("Enter the name of the book");
        String name = scanner.nextLine();

        System.out.println("Enter the price of the book");
        double price = scanner.nextDouble();

        System.out.println("Enter the quantity of the book");
        int quantity = scanner.nextInt();

        scanner.nextLine();

        Book book = new Book(name, price, quantity);
        serviceBook.save(book);

        System.out.println("The book has been successfully added.\n");
    }

    public void showBookServiceListMenu() {
        boolean continueMenu = true;
        while (continueMenu) {
            System.out.println("List of books:");
            System.out.println("---------------");
            System.out.println("Specify the sorting:");
            System.out.println("1. Sort by Id");
            System.out.println("2. Sort by name");
            System.out.println("3. Sort by price");
            System.out.println("4. Sort by availability");
            System.out.println("5. Back");

            System.out.print("Enter the number (1-5) to continue: \n");
            String number = scanner.nextLine();
            switch (number) {
                case "1":
                    serviceBook.findAllSortedById()
                            .forEach(System.out::println);
                    break;
                case "2":
                    serviceBook.findAllSortedByName()
                            .forEach(System.out::println);
                    break;
                case "3":
                    serviceBook.findAllSortedByPrice()
                            .forEach(System.out::println);
                    break;
                case "4":
                    serviceBook.findAllSortedByAvailability()
                            .forEach(System.out::println);
                    break;
                case "5":
                    continueMenu = false;
                    break;
                default:
                    System.out.println("You've entered wrong number. Please, try again.\n");
            }
        }
    }

    public void showOrderServiceMenu() {
        System.out.println("OrderServiceMenu");
    }
}
