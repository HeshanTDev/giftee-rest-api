package com.heshant.giftshop.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin
public class TestController {
    @Autowired
    private TestRepository testRepository;

    @PostMapping("addTest")
    public ResponseEntity<Test> addTest(@RequestBody @Valid Test test){
        Test save = testRepository.save(test);
        return ResponseEntity.ok().body(save);
    }
}
