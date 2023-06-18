package org.example.curso;

public class Accidente {

    private int identificadorAccidente;
    private int rutCliente;
    private String dia;
    private int hora;
    private String lugarAccidente;
    private String comentarios;

    public Accidente(int identificadorAccidente, int rutCliente, String dia, int hora, String lugarAccidente, String comentarios) {
        this.identificadorAccidente = identificadorAccidente;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugarAccidente = lugarAccidente;
        this.comentarios = comentarios;
    }

    public int getIdentificadorAccidente() {
        return identificadorAccidente;
    }

    public void setIdentificadorAccidente(int identificadorAccidente) {
        this.identificadorAccidente = identificadorAccidente;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getLugarAccidente() {
        return lugarAccidente;
    }

    public void setLugarAccidente(String lugarAccidente) {
        this.lugarAccidente = lugarAccidente;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
