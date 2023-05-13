
package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "co")
public class CO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "c", nullable = false)
    private Integer c;

    @Column(name = "p", nullable = false)
    private Integer p;

    public CO() {
    }

    public CO(Integer c, Integer p) {
        this.c = c;
        this.p = p;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public Integer getF() {
        return p;
    }

    public void setF(Integer p) {
        this.p = p;
    }
}
