package org.example.model.persona;

import org.example.Interfas.Asesoria;

public class Cliente extends Usuario implements Asesoria {

    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private int numeroTelefono;
    private String nombreAFP;
    private int sistemaSalud;
    private String direccion;
    private String comuna;

    public Cliente() {
    }

    public Cliente(String nombre, String fechaNacimiento, int rut) {
        super(nombre, fechaNacimiento, rut);
    }

    public Cliente(String nombre, String fechaNacimiento, int rut, String segundoNombre, String primerApellido, String segundoApellido, int numeroTelefono, String nombreAFP, int sistemaSalud, String direccion, String comuna) {
        super(nombre, fechaNacimiento, rut);
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.numeroTelefono = numeroTelefono;
        this.nombreAFP = nombreAFP;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;

    }


    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombreAFP() {
        return nombreAFP;
    }

    public void setNombreAFP(String nombreAFP) {
        this.nombreAFP = nombreAFP;
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String obtenerNombre(String nombre, String segundoNombre, String primerApellido, String segundoApellido){
        String nombreCompleto= nombre+" "+segundoNombre+" "+primerApellido+" "+segundoNombre;
        return "NOMBRE COMPLETO: " +nombreCompleto;
    }
    public String obtenerSistemaSalud(int elSistemaEs){
        if(elSistemaEs==1){
            return "Su sistema de salud es Fonasa.";
        } else if (elSistemaEs==2) {
            return "Su sistema de salud es Isapre.";
        }else{
            return "valor ingresado no valido";

        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                super.toString()+ " " +
                "segundoNombre='" + segundoNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                ", nombreAFP='" + nombreAFP + '\'' +
                ", sistemaSalud=" + sistemaSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }
}
