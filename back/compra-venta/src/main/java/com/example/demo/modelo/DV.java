package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dv")
public class DV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "f", nullable = false)
    private Integer f;

    @Column(name = "p", nullable = false)
    private Integer p;

    public DV() {
    }

    public DV(Integer f, Integer p) {
        this.p = p;
        this.f = f;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getC() {
        return p;
    }

    public void setC(Integer p) {
        this.p = p;
    }

    public Integer getF() {
        return f;
    }

    public void setF(Integer f) {
        this.f = f;
    }
}
