package com.ebay.interview.common.controller;

import com.ebay.interview.common.payload.TestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebay.interview.StringUtils;
@RestController
@RequestMapping("/api/v1/test")
public class testController {

    @GetMapping("/shiftString")
    public ResponseEntity<String> getString(@RequestBody TestDTO testDTO){

        // just to make it simple, directly call shiftString;
        String response = StringUtils.shiftString(testDTO.getInput(), testDTO.getTimes());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
