package com.shopping.jpa.controller;

import com.shopping.jpa.entity.Customer;
import com.shopping.jpa.service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /*@ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the book",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Book.class))}),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Book not found",
                    content = @Content)})*/

    @GetMapping("/customers")
    @Operation(summary = "List all available customers")
    @ApiResponse(description = "Fetch all customerss", responseCode = "200")
    public List<Customer> customers() {
        List<Customer> customerList = customerService.fetchAllCustomers();
        return customerList;
    }
/*
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the book",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Book.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Book not found",
                    content = @Content) })*/
    @PostMapping("/customer")
    public ResponseEntity<Customer> customer(@RequestBody Customer customer) {
        Customer newCustomer = customerService.saveCustomer(customer);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }

    @PutMapping("/customer/{customerId}")
    @Operation(summary = "Update given customer details")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Customer has been updated", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = Customer.class))
            }),
            @ApiResponse(responseCode = "404", description = "Customer is not found", content = @Content)
    })
    public ResponseEntity<Customer> customer(@RequestBody Customer customer, @PathVariable Integer customerId) {
        customer.setId(customerId);
        Customer newCustomer = customerService.saveCustomer(customer);
        if (newCustomer != null) {
            return new ResponseEntity<>(newCustomer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/customer/{customerId}")
    public ResponseEntity<Void> customer(@PathVariable Integer customerId) {
        boolean deleted = customerService.deleteCustomer(customerId);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
