package com.repuestos.proyecto.repuestos;

public class Producto {
    private long id;
    private String nombre;
    private float precio;
    private Integer antiguedad;

    public Producto() {
    }

    public Producto(String nombre, float precio, Integer antiguedad) {
        this.nombre = nombre;
        this.precio = precio;
        this.antiguedad = antiguedad;
    }

    public Producto(long id, String nombre, float precio, Integer antiguedad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.antiguedad = antiguedad;


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }
}
