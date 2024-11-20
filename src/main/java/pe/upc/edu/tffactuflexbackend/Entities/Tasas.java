package pe.upc.edu.tffactuflexbackend.Entities;

import jakarta.persistence.*;

@Entity //Tasas en general, frecuencia
public class Tasas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double valor;
    @Enumerated(EnumType.STRING)
    private FrecuenciaTasa frecuencia;
    public Tasas() {
    }

    public Tasas(Long id, double valor, FrecuenciaTasa frecuencia) {
        this.id = id;
        this.valor = valor;
        this.frecuencia = frecuencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public FrecuenciaTasa getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(FrecuenciaTasa frecuencia) {
        this.frecuencia = frecuencia;
    }
    @Entity //Tasas Efectivas
    public class TEA {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        private Tasas tasaEfectivaAnual;

        public TEA() {
        }

        public TEA(Long id, Tasas tasaEfectivaAnual) {
            this.id = id;
            this.tasaEfectivaAnual = tasaEfectivaAnual;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Tasas getTasaEfectivaAnual() {
            return tasaEfectivaAnual;
        }

        public void setTasaEfectivaAnual(Tasas tasaEfectivaAnual) {
            this.tasaEfectivaAnual = tasaEfectivaAnual;
        }
    }
    @Entity // Tasas de Costo Efectivo
    public class TCEA {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        private Tasas tasaEfectivaAnual;

        private double comisiones;

        public TCEA() {
        }

        public TCEA(Long id, Tasas tasaEfectivaAnual, double comisiones) {
            this.id = id;
            this.tasaEfectivaAnual = tasaEfectivaAnual;
            this.comisiones = comisiones;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Tasas getTasaEfectivaAnual() {
            return tasaEfectivaAnual;
        }

        public void setTasaEfectivaAnual(Tasas tasaEfectivaAnual) {
            this.tasaEfectivaAnual = tasaEfectivaAnual;
        }

        public double getComisiones() {
            return comisiones;
        }

        public void setComisiones(double comisiones) {
            this.comisiones = comisiones;
        }
    }
    @Entity // Tasa Interna de Retorno
    public class TIR {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        private Tasas tasaInteres;

        private int periodos;

        public TIR() {
        }

        public TIR(Long id, Tasas tasaInteres, int periodos) {
            this.id = id;
            this.tasaInteres = tasaInteres;
            this.periodos = periodos;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Tasas getTasaInteres() {
            return tasaInteres;
        }

        public void setTasaInteres(Tasas tasaInteres) {
            this.tasaInteres = tasaInteres;
        }

        public int getPeriodos() {
            return periodos;
        }

        public void setPeriodos(int periodos) {
            this.periodos = periodos;
        }
    }
    @Entity // Tasa de Rendimiento Efectiva
    public class TREA {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        private Tasas tasaEquivalenteAnual;

        private int periodos;

        public TREA() {
        }

        public TREA(Long id, Tasas tasaEquivalenteAnual, int periodos) {
            this.id = id;
            this.tasaEquivalenteAnual = tasaEquivalenteAnual;
            this.periodos = periodos;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Tasas getTasaEquivalenteAnual() {
            return tasaEquivalenteAnual;
        }

        public void setTasaEquivalenteAnual(Tasas tasaEquivalenteAnual) {
            this.tasaEquivalenteAnual = tasaEquivalenteAnual;
        }

        public int getPeriodos() {
            return periodos;
        }

        public void setPeriodos(int periodos) {
            this.periodos = periodos;
        }
    }
}