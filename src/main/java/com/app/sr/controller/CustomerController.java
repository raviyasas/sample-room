package com.app.sr.controller;

import com.app.sr.service.CustomerService;
import com.app.sr.util.model.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * Find all customers
     * @return ApiResponse object
     */
    @GetMapping("/")
    public ResponseEntity<ApiResponse> getEmployees(){
        return customerService.findAll();
    }
}
