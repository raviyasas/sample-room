package com.app.sr.service;

import com.app.sr.entity.Customer;
import com.app.sr.repository.CustomerRepository;
import com.app.sr.util.model.ApiResponse;
import com.app.sr.util.model.ResponseBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerService {

    private CustomerRepository customerRepository;
    private ResponseBuilder responseBuilder;

    public CustomerService(CustomerRepository customerRepository,ResponseBuilder responseBuilder){
        this.customerRepository = customerRepository;
        this.responseBuilder = responseBuilder;
    }

    public ResponseEntity<ApiResponse> findAll() {
        List<Customer> customers = customerRepository.findAll();
        return responseBuilder.buildResponse(HttpStatus.OK.value(),"Customer details",customers);
    }
}
