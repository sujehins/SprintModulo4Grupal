package org.example.model.persona;

import org.example.Interfas.Asesoria;

public class Persona implements Asesoria {

    private String nombre;
    private String fechaNacimiento;
    private int rut;

    public Persona() {
    }

    public Persona(String nombre, String fechaNacimiento, int rut) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", rut=" + rut +
                '}';
    }

    @Override
    public void analizarUsuario() {

    }
}
