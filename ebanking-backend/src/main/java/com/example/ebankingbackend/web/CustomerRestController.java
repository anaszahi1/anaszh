package com.example.ebankingbackend.web;


import com.example.ebankingbackend.dtos.CustomerDTO;
import com.example.ebankingbackend.entities.Customer;
import com.example.ebankingbackend.services.BankAccountServices;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j

public class CustomerRestController {
    private BankAccountServices bankAccountServices;
@GetMapping("/customers")
    public List<CustomerDTO> customerList(){
        return bankAccountServices.lisCustomers();
    }
}
