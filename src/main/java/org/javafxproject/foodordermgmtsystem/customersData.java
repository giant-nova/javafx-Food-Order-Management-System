package org.javafxproject.foodordermgmtsystem;

public class customersData {

    private Integer id;
    private Integer customerID;
    private Double total;
    private String date;
    private String emUsername;

    public customersData(Integer id, Integer customerID, Double total,
                         String  date, String emUsername) {
        this.id = id;
        this.customerID = customerID;
        this.total = total;
        this.date = date;
        this.emUsername = emUsername;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public Double getTotal() {
        return total;
    }

    public String getDate() {
        return date;
    }

    public String getEmUsername() {
        return emUsername;
    }

}
