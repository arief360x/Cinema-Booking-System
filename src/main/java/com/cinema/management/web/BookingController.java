package com.cinema.management.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @GetMapping("")
    public ResponseEntity<String> getBooking(){
        return new ResponseEntity<>("Testing controller", HttpStatus.OK);
    }
}
