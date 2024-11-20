package pe.upc.edu.tffactuflexbackend.Service;

import pe.upc.edu.tffactuflexbackend.Entities.Tasas;

import java.util.List;

public interface ITEAService {
    public void insert(Tasas.TEA tea);

    public List<Tasas.TEA> list();

    public void delete(Long id);

    public Tasas.TEA listarId(Long id);

    Tasas.TEA obtenerPorId(Long id);
}
