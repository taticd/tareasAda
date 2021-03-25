package com.company;

public abstract class Persona {
    private String nombre;
    private String direccion;
    private String id;

    public Persona(String nombre, String direccion, String id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;
    }

    public Persona() {
        this.nombre = "";
        this.direccion = "";
        this.id = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
