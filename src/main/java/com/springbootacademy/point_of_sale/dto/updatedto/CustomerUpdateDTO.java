package com.springbootacademy.point_of_sale.dto.updatedto;

import java.util.ArrayList;

public class CustomerUpdateDTO {
    private int customerId;
    private String customerAddress;
    private double salary;
    private ArrayList contactnumber;

    public CustomerUpdateDTO() {
    }

    public CustomerUpdateDTO(int customerId, String customerAddress, double salary, ArrayList contactnumber) {
        this.customerId = customerId;
        this.customerAddress = customerAddress;
        this.salary = salary;
        this.contactnumber = contactnumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(ArrayList contactnumber) {
        this.contactnumber = contactnumber;
    }

    @Override
    public String toString() {
        return "CustomerUpdateDTO{" +
                "customerId=" + customerId +
                ", customerAddress='" + customerAddress + '\'' +
                ", salary=" + salary +
                ", contactnumber=" + contactnumber +
                '}';
    }
}
