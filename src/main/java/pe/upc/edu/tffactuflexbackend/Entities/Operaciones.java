package pe.upc.edu.tffactuflexbackend.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Operaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdTransaccion;
    @ManyToOne
    @JoinColumn(name = "IdCliente")
    private Cliente IdCliente;          // Cliente
    @Column(length = 20, nullable = false)
    private double montoOriginal;    // Monto Original
    @Column(nullable = false)
    private LocalDate fechaEmision;     // Fecha Emisión
    @Column(nullable = false)
    private LocalDate fechaVencimiento; // Fecha Vencim.
    @Column(length = 10, nullable = false)
    private String divisa;           // Divisa
    @Column(length = 5, nullable = false)
    private double tasaAsignada;     // Tasa asignada
    @Column(length = 30, nullable = false)
    private String tipoTasa;         // Tipo de Tasa
    @Column(length = 30, nullable = true)
    private String capitalizacion;   // Capitalización
    @Column(nullable = false)
    private LocalDate fechaPago;        // Fecha de pago
    @Column(length = 5,nullable = false)
    private double tep;
    @Column(length = 5,nullable = false)
    private double tasaDescuento;
    @Column(length = 20,nullable = false)
    private double Descuento;
    @Column(length = 20,nullable = false)
    private double saldoFinal;
    @Column(length = 5,nullable = false)
    private double tcea;
    @Column(length = 10, nullable = false)
    private String estado;

    public Operaciones(Long idTransaccion, Cliente idCliente, double montoOriginal, LocalDate fechaEmision, LocalDate fechaVencimiento, String divisa, double tasaAsignada, String tipoTasa, String capitalizacion, LocalDate fechaPago, double tep, double tasaDescuento, double descuento, double saldoFinal, double tcea, String estado) {
        IdTransaccion = idTransaccion;
        IdCliente = idCliente;
        this.montoOriginal = montoOriginal;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.divisa = divisa;
        this.tasaAsignada = tasaAsignada;
        this.tipoTasa = tipoTasa;
        this.capitalizacion = capitalizacion;
        this.fechaPago = fechaPago;
        this.tep = tep;
        this.tasaDescuento = tasaDescuento;
        Descuento = descuento;
        this.saldoFinal = saldoFinal;
        this.tcea = tcea;
        this.estado = estado;
    }

    public Operaciones() {
    }

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

    public double getTep() {
        return tep;
    }

    public void setTep(double tep) {
        this.tep = tep;
    }

    public double getTasaDescuento() {
        return tasaDescuento;
    }

    public void setTasaDescuento(double tasaDescuento) {
        this.tasaDescuento = tasaDescuento;
    }

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double descuento) {
        Descuento = descuento;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public double getTcea() {
        return tcea;
    }

    public void setTcea(double tcea) {
        this.tcea = tcea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
