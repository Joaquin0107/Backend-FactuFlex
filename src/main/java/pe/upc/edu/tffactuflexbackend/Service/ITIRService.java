package pe.upc.edu.tffactuflexbackend.Service;

import pe.upc.edu.tffactuflexbackend.Entities.Tasas;

import java.util.List;

public interface ITIRService {
    public void insert(Tasas.TIR tir);

    public List<Tasas.TIR> list();

    public void delete(Long id);

    public Tasas.TIR listarId(Long id);

    Tasas.TIR obtenerPorId(Long id);
}
