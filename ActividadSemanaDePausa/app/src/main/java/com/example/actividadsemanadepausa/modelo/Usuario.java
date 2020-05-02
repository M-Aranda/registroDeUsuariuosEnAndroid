package com.example.actividadsemanadepausa.modelo;

public class Usuario {

    private String nombre, apellido, rut, deporteFavorito;
    private boolean esHombre;
    private int edad;

    public Usuario(String nombre, String apellido, String rut, String deporteFavorito, boolean esHombre, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.deporteFavorito = deporteFavorito;
        this.esHombre = esHombre;
        this.edad = edad;
    }

    public Usuario(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDeporteFavorito() {
        return deporteFavorito;
    }

    public void setDeporteFavorito(String deporteFavorito) {
        this.deporteFavorito = deporteFavorito;
    }

    public boolean isEsHombre() {
        return esHombre;
    }

    public void setEsHombre(boolean esHombre) {
        this.esHombre = esHombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", rut='" + rut + '\'' +
                ", deporteFavorito='" + deporteFavorito + '\'' +
                ", esHombre=" + esHombre +
                ", edad=" + edad +
                '}';
    }
}
