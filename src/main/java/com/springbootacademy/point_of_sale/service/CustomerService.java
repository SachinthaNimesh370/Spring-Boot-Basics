package com.springbootacademy.point_of_sale.service;

import com.springbootacademy.point_of_sale.dto.CustomerDTO;
import com.springbootacademy.point_of_sale.dto.updatedto.CustomerUpdateDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {
    public String saveCustomer(CustomerDTO customerDTO);


    String updateCustomer(CustomerUpdateDTO customerUpdateDTO);

    CustomerDTO getCustomer(int customerId);

    List<CustomerDTO> getAllCustomers();


    String deleteCustomer(int customerId);

    List<CustomerDTO> getAllActiveCustomers(boolean customerActiveStatus);

}
