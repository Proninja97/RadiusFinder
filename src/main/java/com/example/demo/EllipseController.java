package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EllipseController {

    @Autowired
    private EllipseService ellipseService;

    @GetMapping("/findEllipses")
    public ResponseEntity<List<Ellipse>> findEllipsesByRadius(@RequestParam int radius) {
        List<Ellipse> ellipses = ellipseService.getEllipsesByRadius(radius);

        if (ellipses.isEmpty()) {
            return ResponseEntity.ok(new ArrayList<>());
        } else {
            return ResponseEntity.ok(ellipses);
        }
    }

    @PostMapping("/addMultipleEllipses")
    @ResponseBody
    public String addMultipleEllipses(Model model) {
        ellipseService.addMultipleEllipses();
        return " ";
    }
}
