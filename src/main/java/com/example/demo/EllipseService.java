package com.example.demo;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class EllipseService {

    @Autowired
    private EllipseRepository ellipseRepository;

    public void addMultipleEllipses() {
        Ellipse ellipse1 = new Ellipse(1, 4, 101, 200);
        Ellipse ellipse2 = new Ellipse(3, 2, 102, 180);
        Ellipse ellipse3 = new Ellipse(5, 8, 103, 220);
        Ellipse ellipse4 = new Ellipse(8, 2, 101, 200);
        Ellipse ellipse5 = new Ellipse(2, 9, 102, 180);
        Ellipse ellipse6 = new Ellipse(9, 7, 103, 220);
        Ellipse ellipse7 = new Ellipse(7, 6, 101, 200);
        Ellipse ellipse8 = new Ellipse(6, 6, 102, 180);
        Ellipse ellipse9 = new Ellipse(6, 3, 103, 220);
        Ellipse ellipse10 = new Ellipse(3, 8, 101, 200);
        ellipseRepository.saveAll(List.of(ellipse1, ellipse2, ellipse3,ellipse4, ellipse5, ellipse6,ellipse7, ellipse8, ellipse9,ellipse10));
    }
    @PostConstruct
    public void init(){
        {


        }

    }


    public List<Ellipse> getAllEllipses() {
        return ellipseRepository.findAll();
    }

    public Ellipse getEllipseById(Long id) {
        return ellipseRepository.findById(id).orElse(null);
    }

    public Ellipse saveEllipse(Ellipse ellipse) {
        return ellipseRepository.save(ellipse);
    }

    public void deleteEllipse(Long id) {
        ellipseRepository.deleteById(id);
    }
    
    public List<Ellipse> getEllipsesByRadius(int radius) {
        return ellipseRepository.findByRadius1OrRadius2(radius, radius);
    }

}
