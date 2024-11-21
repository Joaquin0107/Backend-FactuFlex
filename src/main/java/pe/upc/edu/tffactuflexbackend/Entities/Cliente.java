package pe.upc.edu.tffactuflexbackend.Entities;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdCliente;
    @Column(length = 30, nullable = false)
    private String nombreEmpresa;     // Nombre de la empresa
    @Column(length = 10, nullable = false)
    private String ruc;               // RUC
    @Column(length = 50, nullable = false)
    private String direccion;         // Dirección
    @Column(length = 9, nullable = false)
    private String telefonoEmpresa;   // Teléfono de la empresa
    @Column(length = 30, nullable = false)
    private String nombreResponsable; // Nombre del responsable
    @Column(length = 30, nullable = false)
    private String apellidos;         // Apellidos del responsable
    @Column(length = 9, nullable = false)
    private String telefonoResponsable; // Teléfono del responsable
    @Column(length = 8, nullable = false)
    private String dni;               // DNI del responsable
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Users idUsuario;          // Cliente

    public Cliente(Long idCliente, String nombreEmpresa, String ruc, String direccion, String telefonoEmpresa, String nombreResponsable, String apellidos, String telefonoResponsable, String dni, Users idUsuario) {
        IdCliente = idCliente;
        this.nombreEmpresa = nombreEmpresa;
        this.ruc = ruc;
        this.direccion = direccion;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nombreResponsable = nombreResponsable;
        this.apellidos = apellidos;
        this.telefonoResponsable = telefonoResponsable;
        this.dni = dni;
        this.idUsuario = idUsuario;
    }

    public Cliente() {
    }

    public Long getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Long idCliente) {
        IdCliente = idCliente;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefonoResponsable() {
        return telefonoResponsable;
    }

    public void setTelefonoResponsable(String telefonoResponsable) {
        this.telefonoResponsable = telefonoResponsable;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Users getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Users idUsuario) {
        this.idUsuario = idUsuario;
    }
}
