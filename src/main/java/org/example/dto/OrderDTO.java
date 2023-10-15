package org.example.dto;

import org.example.model.OrderStatus;

import java.util.Date;

public class OrderDTO {
    private int id;
    private double price;
    private Date openingDate;
    private Date completionDate;
    private Enum<OrderStatus> status;

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

    @Override
    public String toString() {
        return "orderDTO{" +
                "id=" + id +
                ", price=" + price +
                ", openingDate=" + openingDate +
                ", completionDate=" + completionDate +
                ", status=" + status +
                '}';
    }
}
