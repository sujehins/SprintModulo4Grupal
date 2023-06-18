package org.example.curso;

public class VisitaEnTerreno {
    private int identificadorVisita;
    private int rutCliente;
    private String DiaAccidente;
    private int horaAcciente;
    private String lugarAccidente;
    private String comentarioAccidente;

    public VisitaEnTerreno(int identificadorVisita, int rutCliente, String diaAccidente, int horaAcciente, String lugarAccidente, String comentarioAccidente) {
        this.identificadorVisita = identificadorVisita;
        this.rutCliente = rutCliente;
        DiaAccidente = diaAccidente;
        this.horaAcciente = horaAcciente;
        this.lugarAccidente = lugarAccidente;
        this.comentarioAccidente = comentarioAccidente;
    }

    public int getIdentificadorVisita() {
        return identificadorVisita;
    }

    public void setIdentificadorVisita(int identificadorVisita) {
        this.identificadorVisita = identificadorVisita;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDiaAccidente() {
        return DiaAccidente;
    }

    public void setDiaAccidente(String diaAccidente) {
        DiaAccidente = diaAccidente;
    }

    public int getHoraAcciente() {
        return horaAcciente;
    }

    public void setHoraAcciente(int horaAcciente) {
        this.horaAcciente = horaAcciente;
    }

    public String getLugarAccidente() {
        return lugarAccidente;
    }

    public void setLugarAccidente(String lugarAccidente) {
        this.lugarAccidente = lugarAccidente;
    }

    public String getComentarioAccidente() {
        return comentarioAccidente;
    }

    public void setComentarioAccidente(String comentarioAccidente) {
        this.comentarioAccidente = comentarioAccidente;
    }
}
