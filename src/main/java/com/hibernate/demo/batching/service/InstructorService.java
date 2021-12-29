package com.hibernate.demo.batching.service;

import com.hibernate.demo.batching.model.Instructor;
import com.hibernate.demo.batching.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    public List<Instructor> create(List<Instructor> instructors) {

        return instructorRepository.saveAll(instructors);
    }
}
