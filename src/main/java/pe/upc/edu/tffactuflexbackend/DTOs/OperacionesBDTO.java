package pe.upc.edu.tffactuflexbackend.DTOs;

import pe.upc.edu.tffactuflexbackend.Entities.Cliente;

import java.time.LocalDate;

public class OperacionesBDTO {
    private Long IdTransaccion;
    private Cliente IdCliente;
    private double montoOriginal;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private String divisa;
    private double tasaAsignada;
    private String tipoTasa;
    private String capitalizacion;
    private LocalDate fechaPago;

    public Long getIdTransaccion() {
        return IdTransaccion;
    }

    public void setIdTransaccion(Long idTransaccion) {
        IdTransaccion = idTransaccion;
    }

    public Cliente getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        IdCliente = idCliente;
    }

    public double getMontoOriginal() {
        return montoOriginal;
    }

    public void setMontoOriginal(double montoOriginal) {
        this.montoOriginal = montoOriginal;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    public double getTasaAsignada() {
        return tasaAsignada;
    }

    public void setTasaAsignada(double tasaAsignada) {
        this.tasaAsignada = tasaAsignada;
    }

    public String getTipoTasa() {
        return tipoTasa;
    }

    public void setTipoTasa(String tipoTasa) {
        this.tipoTasa = tipoTasa;
    }

    public String getCapitalizacion() {
        return capitalizacion;
    }

    public void setCapitalizacion(String capitalizacion) {
        this.capitalizacion = capitalizacion;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }
}
