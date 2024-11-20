package pe.upc.edu.tffactuflexbackend.Service;

import pe.upc.edu.tffactuflexbackend.Entities.Tasas;

import java.util.List;

public interface ITCEAService {
    public void insert(Tasas.TCEA tcea);

    public List<Tasas.TCEA> list();

    public void delete(Long id);

    public Tasas.TCEA listarId(Long id);

    Tasas.TCEA obtenerPorId(Long id);
}
