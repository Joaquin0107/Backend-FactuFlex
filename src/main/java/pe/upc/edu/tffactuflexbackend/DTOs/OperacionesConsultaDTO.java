package pe.upc.edu.tffactuflexbackend.DTOs;

import java.time.LocalDate;

public class OperacionesConsultaDTO {
    private Long idOperacion;
    private String nombreEmpresa;
    private String tipoTasa;
    private Double tasaAsignada;
    private Double saldoFinal;
    private LocalDate fechaPago;
    private Double montoOriginal;
    private String estado;

    public Long getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(Long idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTipoTasa() {
        return tipoTasa;
    }

    public void setTipoTasa(String tipoTasa) {
        this.tipoTasa = tipoTasa;
    }

    public Double getTasaAsignada() {
        return tasaAsignada;
    }

    public void setTasaAsignada(Double tasaAsignada) {
        this.tasaAsignada = tasaAsignada;
    }

    public Double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(Double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Double getMontoOriginal() {
        return montoOriginal;
    }

    public void setMontoOriginal(Double montoOriginal) {
        this.montoOriginal = montoOriginal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
