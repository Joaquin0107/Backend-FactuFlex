package pe.upc.edu.tffactuflexbackend.Service;

import pe.upc.edu.tffactuflexbackend.Entities.Tasas;

import java.util.List;

public interface ITasasService {
    public void insert(Tasas tasas);

    public List<Tasas> list();

    public void delete(Long id);

    public Tasas listarId(Long id);

    Tasas obtenerPorId(Long id);
}
