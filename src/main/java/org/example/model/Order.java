package org.example.model;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private double price;
    private Date openingDate;
    private Date completionDate;
    private Enum<OrderStatus> status;
    private List<Book> bookList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public Enum<OrderStatus> getStatus() {
        return status;
    }

    public void setStatus(Enum<OrderStatus> status) {
        this.status = status;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", openingDate=" + openingDate +
                ", completionDate=" + completionDate +
                ", status='" + status + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
