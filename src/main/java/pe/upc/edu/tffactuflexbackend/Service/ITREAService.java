package pe.upc.edu.tffactuflexbackend.Service;

import pe.upc.edu.tffactuflexbackend.Entities.Tasas;

import java.util.List;

public interface ITREAService {
    public void insert(Tasas.TREA trea);

    public List<Tasas.TREA> list();

    public void delete(Long id);

    public Tasas.TREA listarId(Long id);

    Tasas.TREA obtenerPorId(Long id);
}
