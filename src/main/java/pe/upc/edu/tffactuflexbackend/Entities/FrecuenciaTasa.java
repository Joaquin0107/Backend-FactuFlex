package pe.upc.edu.tffactuflexbackend.Entities;

public enum FrecuenciaTasa {
    ANUAL(1),
    SEMESTRAL(2),
    TRIMESTRAL(4),
    MENSUAL(12);

    private final int factor;
    FrecuenciaTasa(int factor){
        this.factor=factor;
    }
    public int getFactor(){
        return factor;
    }
}
