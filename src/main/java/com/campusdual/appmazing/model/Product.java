package com.campusdual.appmazing.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

//importante decir que es una entidad.
@Entity
@Table(name = "PRODUCTS") // indicar nombre de la tabla de la bbdd

public class Product {
    // indicar columnas de la tabla como atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //esto para el id. Para la clave primaria. la strategy es para como generar los numeros, el incremental
    private int id;
    @Column // el resto de columnas con esto.
    private String name;
    @Column
    private int stock;
    @Column
    private BigDecimal price;
    @Column
    private boolean active;
    @Column
    private Date date_added;

//añadir getters y setters. aqui no hay constructores

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getDate_added() {
        return date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }
}
