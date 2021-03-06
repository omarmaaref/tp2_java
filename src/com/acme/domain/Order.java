package com.acme.domain;
import com.acme.utils.MyDate;
public class Order {
    private MyDate orderDate;
    private double orderAmount = 0.00;
    private String customer;
    private String product;
    private int quantity;
    private static double taxRate = 0.05;

    public void setQuantity(int quantity) {
        if (quantity>0)
        this.quantity = quantity;
        else {
            System.out.println("Attempting to set the quantity to a value less than or equal to zero");
        }
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setOrderAmount(double orderAmount) {
        if (orderAmount>0)
            this.orderAmount = orderAmount;
        else {
            System.out.println("Attempting to set the orderAmount to a value less than or equal to zero");
        }

    }

    public void setOrderDate(MyDate orderDate) {
        this.orderDate = orderDate;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public static double getTaxRate() {
        return taxRate;
    }

    public int getQuantity() {
        return quantity;
    }

    public MyDate getOrderDate() {
        return orderDate;
    }

    public String getCustomer() {
        return customer;
    }

    public String getProduct() {
        return product;
    }

    public static void setTaxRate(double newRate) {taxRate = newRate;}
    public static void computeTaxOn(double anAmount){
        System.out.println("The tax for " + anAmount + " is: " + anAmount * Order.taxRate);}

    public double computeTax() {
        System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
    return orderAmount * Order.taxRate;}
    public Order(MyDate d, double amt, String c, String p, int q){
        orderDate=d;
        orderAmount=amt;
        customer=c;
        product=p;
        quantity=q;
    }

    public String toString(){

        return quantity + " ea. " + product + " for " + customer;
    }
    public char jobSize() {
        if (quantity <= 25) return 'S';
        if (quantity <= 75) return 'M';
        if (quantity <= 150) return 'L';
        if (quantity > 150) return 'X';
    return ' ';    }
    public double computeTotal(){
        double discount=0;
        switch(jobSize()) {
            case 'M':
                discount =  orderAmount * 0.01;break;
            case 'L':
                discount =  orderAmount * 0.02;break;
            case 'X':
                discount = orderAmount * 0.03;break;
        }
        double x=orderAmount-discount;
        //System.out.println(jobSize());

        if (x>1500)
            return x;
        else return x+Order.taxRate*orderAmount;

    }

}
