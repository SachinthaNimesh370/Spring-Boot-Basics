package com.springbootacademy.point_of_sale.controller;


import com.springbootacademy.point_of_sale.dto.CustomerDTO;
import com.springbootacademy.point_of_sale.dto.updatedto.CustomerUpdateDTO;
import com.springbootacademy.point_of_sale.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {
    @Autowired//හදපු ඔබ්ජෙක්ට් එකේ reference එකක් සෑදීමට
    private CustomerService customerService;


    @PostMapping("/save")
    public String SaveCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.saveCustomer(customerDTO);
         return "Save";

    }

    @PutMapping("/update")
    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO){
        String massage= customerService.updateCustomer(customerUpdateDTO);
        return massage;

    }

    @GetMapping(
            path="/get",
            params="id"
    )
    public CustomerDTO getCustomer(@RequestParam(value = "id") int customerId){
        CustomerDTO customerDTO=customerService.getCustomer(customerId);
        return customerDTO;

    }

//    gGet All Data
    @GetMapping(path ="/get-all-data")
    public List<CustomerDTO> getAllCustomer(){
        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
        return allCustomers;
    }




}
