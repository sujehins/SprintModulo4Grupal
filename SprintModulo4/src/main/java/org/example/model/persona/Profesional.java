package org.example.model.persona;

import org.example.Interfas.Asesoria;

public class Profesional extends Usuario implements Asesoria {

    private String titulo;
    private String fechaIngreso;

    public Profesional(String nombre, String fechaNacimiento, int rut) {
        super(nombre, fechaNacimiento, rut);
    }

    public Profesional(String nombre, String fechaNacimiento, int rut, String titulo, String fechaIngreso) {
        super(nombre, fechaNacimiento, rut);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public Profesional() {
    }

    public String analizarUsuario(String nombre, int rut, String titulo, String fechaIngreso) {
        return "El usuario "+nombre+" con RUT " +rut+" con titulo " + titulo+ " con ingreso "+fechaIngreso+". ";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                super.toString()+ " " +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }
}
