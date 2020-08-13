package lesson1.task3;

import java.util.Date;

public class Order {
    private int orderNum;
    private Date date;
    private OrderType orderType;
    private Client client;
    private Passport passport;

    public Order() {
    }

    public Order(int orderNum, Date date, OrderType orderType, Client client, Passport passport) {
        this.orderNum = orderNum;
        this.date = date;
        this.orderType = orderType;
        this.client = client;
        this.passport = passport;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNum=" + orderNum +
                ", date=" + date +
                ", orderType=" + orderType +
                ", client=" + client +
                ", passport=" + passport +
                '}';
    }
}
