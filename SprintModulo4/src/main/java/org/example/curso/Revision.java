package org.example.curso;

public class Revision {
    private int identificadorRevision;
    private int identificadorVisita;
    private String nombreRevision;
    private String detalleRevision;
    private int estadoRevision;

    public Revision(int identificadorRevision, int identificadorVisita, String nombreRevision, String detalleRevision, int estadoRevision) {
        this.identificadorRevision = identificadorRevision;
        this.identificadorVisita = identificadorVisita;
        this.nombreRevision = nombreRevision;
        this.detalleRevision = detalleRevision;
        this.estadoRevision = estadoRevision;
    }

    public int getIdentificadorRevision() {
        return identificadorRevision;
    }

    public void setIdentificadorRevision(int identificadorRevision) {
        this.identificadorRevision = identificadorRevision;
    }

    public int getIdentificadorVisita() {
        return identificadorVisita;
    }

    public void setIdentificadorVisita(int identificadorVisita) {
        this.identificadorVisita = identificadorVisita;
    }

    public String getNombreRevision() {
        return nombreRevision;
    }

    public void setNombreRevision(String nombreRevision) {
        this.nombreRevision = nombreRevision;
    }

    public String getDetalleRevision() {
        return detalleRevision;
    }

    public void setDetalleRevision(String detalleRevision) {
        this.detalleRevision = detalleRevision;
    }

    public int getEstadoRevision() {
        return estadoRevision;
    }

    public void setEstadoRevision(int estadoRevision) {
        this.estadoRevision = estadoRevision;
    }
}
