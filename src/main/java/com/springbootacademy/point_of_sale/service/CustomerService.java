package com.springbootacademy.point_of_sale.service;

import com.springbootacademy.point_of_sale.dto.CustomerDTO;
import org.springframework.stereotype.Service;


public interface CustomerService {
    public String saveCustomer(CustomerDTO customerDTO);


}
