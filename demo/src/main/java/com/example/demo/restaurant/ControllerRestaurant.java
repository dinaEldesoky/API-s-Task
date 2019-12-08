package com.example.demo.restaurant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.security.x509.RDN;

import javax.validation.Valid;
import java.util.List;

@RestController

@RequestMapping(value = {"/api/restaurant"})
public class ControllerRestaurant {
    @Autowired
    private ServiceRestaurant serviceRestaurant;

    @GetMapping
    public ResponseEntity<List<Data>> getAllRestaurant() {
        return new ResponseEntity<>( serviceRestaurant.findAll(),HttpStatus.OK);
    }

    @GetMapping("{closed}")

    public List<Data> getOpenRestaurant( @PathVariable("closed") Boolean parameter){
        return serviceRestaurant.openRestaurant(parameter);
    }


    @PostMapping
    public ResponseEntity<Data>createNewRestaurant(@RequestBody Data restaurant){
        if(serviceRestaurant.save(restaurant))
           return new ResponseEntity<>( restaurant,HttpStatus.CREATED);
        return null;
    }


    @PutMapping("/{uuid}")
    public ResponseEntity<Data> updateNewRestaurant(@RequestBody Data data , @Valid @PathVariable("uuid") String uuid){
        if(serviceRestaurant.updRes(uuid))
           return new ResponseEntity<>(data,HttpStatus.CREATED);
        return null;
    }


}
