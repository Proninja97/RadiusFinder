package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ellipse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int radius1;
    private int radius2;
    private int materialID;
    private int ym;

    // Constructors, getters, and setters

    public Ellipse() {
        // Default constructor required by JPA
    }

    public Ellipse(int radius1, int radius2, int materialID, int ym) {
        this.radius1 = radius1;
        this.radius2 = radius2;
        this.materialID = materialID;
        this.ym = ym;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRadius1() {
        return radius1;
    }

    public void setRadius1(int radius1) {
        this.radius1 = radius1;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }

    public int getMaterialID() {
        return materialID;
    }

    public void setMaterialID(int materialID) {
        this.materialID = materialID;
    }

    public int getym() {
        return ym;
    }

    public void setym(int ym) {
        this.ym = ym;
    }
    
}
