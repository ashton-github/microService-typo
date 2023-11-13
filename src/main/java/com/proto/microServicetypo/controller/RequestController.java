package com.proto.microServicetypo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Typo")
public class RequestController {


    @GetMapping("/getRequest")
    public ResponseEntity getRequest(){
         return ResponseEntity.ok("hello") ;
    }
}
