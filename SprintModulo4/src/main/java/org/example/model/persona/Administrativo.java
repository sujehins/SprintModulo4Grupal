package org.example.model.persona;

import org.example.Interfas.Asesoria;

public class Administrativo extends Usuario implements Asesoria {

    private String area;
    private String experienciaPrevia;

    public Administrativo(String nombre, String fechaNacimiento, int rut) {
        super(nombre, fechaNacimiento, rut);
    }

    public Administrativo(String nombre, String fechaNacimiento, int rut, String area, String experienciaPrevia) {
        super(nombre, fechaNacimiento, rut);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public Administrativo() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }


    public String analizarUsuario(String nombre, int rut, String area, String experienciaPrevia) {
        return "El usuario "+nombre+" con RUT " +rut+" del area " + area+ " con experiencia "+experienciaPrevia+". ";
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                super.toString()+ " " +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }
}
