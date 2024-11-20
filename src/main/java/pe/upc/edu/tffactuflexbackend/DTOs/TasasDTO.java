package pe.upc.edu.tffactuflexbackend.DTOs;
import pe.upc.edu.tffactuflexbackend.Entities.FrecuenciaTasa;

public class TasasDTO {
    private double valor;
    private FrecuenciaTasa frecuencia;

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
}