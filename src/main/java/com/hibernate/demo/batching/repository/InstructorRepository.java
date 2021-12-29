package com.hibernate.demo.batching.repository;

import com.hibernate.demo.batching.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor,Long> {
}
