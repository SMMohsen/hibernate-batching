package com.hibernate.demo.batching.controller;

import com.hibernate.demo.batching.model.Instructor;
import com.hibernate.demo.batching.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/instructors")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;


    @PostMapping
    public List<Instructor> create(@RequestBody List<Instructor> instructors) {

        return instructorService.create(instructors);
    }
}
