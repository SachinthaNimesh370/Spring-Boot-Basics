package com.springbootacademy.point_of_sale.service.impl;

import com.springbootacademy.point_of_sale.dto.CustomerDTO;
import com.springbootacademy.point_of_sale.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        System.out.println(customerDTO.getCustomerName());
        return customerDTO.getCustomerName();
    }


}
