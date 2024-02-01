package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EllipseRepository extends JpaRepository<Ellipse, Long> {
    List<Ellipse> findByRadius1OrRadius2(int radius1, int radius2);
}
