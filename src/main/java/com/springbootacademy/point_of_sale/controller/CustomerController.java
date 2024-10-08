package com.springbootacademy.point_of_sale.controller;


import com.springbootacademy.point_of_sale.dto.CustomerDTO;
import com.springbootacademy.point_of_sale.dto.updatedto.CustomerUpdateDTO;
import com.springbootacademy.point_of_sale.service.CustomerService;
import com.springbootacademy.point_of_sale.util.StandardResponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
//    public CustomerDTO getCustomer(@RequestParam(value = "id") int customerId){
//        CustomerDTO customerDTO=customerService.getCustomer(customerId);
//        return customerDTO;
//
//    }
    public ResponseEntity<StandardResponce> getCustomer(@RequestParam(value = "id") int customerId){
        CustomerDTO customerDTO=customerService.getCustomer(customerId);
        ResponseEntity<StandardResponce> response=
                new ResponseEntity<StandardResponce>(
                new StandardResponce(201,"Save",customerDTO)
                ,HttpStatus.CREATED);
        return response;

    }

//    gGet All Data
    @GetMapping(path ="/get-all-data")
    public List<CustomerDTO> getAllCustomer(){
        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
        return allCustomers;
    }

    @DeleteMapping(
            path = "delete/{id}"
    )
    public String deleteCustomer(@PathVariable (value = "id") int customerId){
        String deleted= customerService.deleteCustomer(customerId);
        return deleted;

    }

    @GetMapping(path ="/getAllDataActive/{status}")
    public List<CustomerDTO> getAllCustomerActive(@PathVariable (value = "status") boolean customerActiveStatus){
        List<CustomerDTO> allCustomersActive = customerService.getAllActiveCustomers(customerActiveStatus);
        return allCustomersActive;
    }





}
