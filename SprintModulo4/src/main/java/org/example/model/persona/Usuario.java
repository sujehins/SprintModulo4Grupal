package org.example.model.persona;

import org.example.Interfas.Asesoria;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Usuario extends Persona implements Asesoria {

    public Usuario(String nombre, String fechaNacimiento, int rut) {
        super(nombre, fechaNacimiento, rut);
    }

    public Usuario() {
    }

    public String mostrarEdad(String fechaNaciento){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaActual= LocalDate.now();
        LocalDate fecheNac = LocalDate.parse(fechaNaciento,formato);
        Period periodo= Period.between(fecheNac,fechaActual);
        int edad=periodo.getYears();
        return "El usuario tiene " +edad;
    }

    public String analizarUsuario(String nombre, int rut) {
        return "el nombre del usuario es " +nombre+ " y su rut es "+rut;

    }

}
