package com.springbootacademy.point_of_sale.service.impl;

import com.springbootacademy.point_of_sale.dto.CustomerDTO;
import com.springbootacademy.point_of_sale.dto.updatedto.CustomerUpdateDTO;
import com.springbootacademy.point_of_sale.entity.Customer;
import com.springbootacademy.point_of_sale.repo.CustomerRepo;
import com.springbootacademy.point_of_sale.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(
                customerDTO.getCustomerId(),
                customerDTO.getCustomerName(),
                customerDTO.getCustomerAddress(),
                customerDTO.getSalary(),
                customerDTO.getContactnumber(),
                customerDTO.getNic(),
                customerDTO.isActive()
        );

        customerRepo.save(customer);

        System.out.println(customerDTO.getCustomerName());
        return customerDTO.getCustomerName();
    }

    @Override
    public String updateCustomer(CustomerUpdateDTO customerUpdateDTO) {
        if(customerRepo.existsById(customerUpdateDTO.getCustomerId())){
            Customer customer = customerRepo.getReferenceById(customerUpdateDTO.getCustomerId());

            customer.setCustomerAddress(customerUpdateDTO.getCustomerAddress());
            customer.setSalary(customerUpdateDTO.getSalary());
            customer.setContactnumber(customerUpdateDTO.getContactnumber());

            customerRepo.save(customer);



        }
        else{
            throw new RuntimeException("No Data Found");
        }
        return "Sucssesful Update";
    }

    @Override
    public CustomerDTO getCustomer(int customerId) {
        if(customerRepo.existsById(customerId)){
            Customer customer =customerRepo.getReferenceById(customerId);
            CustomerDTO customerDTO= new CustomerDTO(
                    customer.getCustomerId(),
                    customer.getCustomerName(),
                    customer.getCustomerAddress(),
                    customer.getSalary(),
                    customer.getContactnumber(),
                    customer.getNic(),
                    customer.isActive()

            );
            return customerDTO ;

        }else{
            throw new RuntimeException("No Customer Found");
        }
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {

        List<Customer> getAllCustomer = customerRepo.findAll();

        List<CustomerDTO> customerDTOList =   new ArrayList<>();

         for(Customer customer:getAllCustomer){
             CustomerDTO customerDTO= new CustomerDTO(
                     customer.getCustomerId(),
                     customer.getCustomerName(),
                     customer.getCustomerAddress(),
                     customer.getSalary(),
                     customer.getContactnumber(),
                     customer.getNic(),
                     customer.isActive()

             );
             customerDTOList.add(customerDTO);

         }
        return customerDTOList;
    }

    @Override
    public String deleteCustomer(int customerId) {
        if(customerRepo.existsById(customerId)){
            customerRepo.deleteById(customerId);
            return "Sucssesful Delete Customer";
        }
        else{
            throw new RuntimeException("No Data Found");
        }

    }

    @Override
    public List<CustomerDTO> getAllActiveCustomers(boolean customerActiveStatus) {

        List<Customer> getAllCustomer = customerRepo.findAllByActiveEquals(customerActiveStatus);

        List<CustomerDTO> customerActiveDTOList =   new ArrayList<>();

        for(Customer customer:getAllCustomer){
            CustomerDTO customerDTO= new CustomerDTO(
                    customer.getCustomerId(),
                    customer.getCustomerName(),
                    customer.getCustomerAddress(),
                    customer.getSalary(),
                    customer.getContactnumber(),
                    customer.getNic(),
                    customer.isActive()

            );
            customerActiveDTOList.add(customerDTO);

        }
        return customerActiveDTOList;
    }


}
