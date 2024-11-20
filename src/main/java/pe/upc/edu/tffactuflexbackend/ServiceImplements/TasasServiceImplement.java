package pe.upc.edu.tffactuflexbackend.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.tffactuflexbackend.Entities.Tasas;
import pe.upc.edu.tffactuflexbackend.Repositories.ITasasRepository;
import pe.upc.edu.tffactuflexbackend.Service.ITasasService;

import java.util.List;

@Service
public class TasasServiceImplement implements ITasasService {
    @Autowired
    private ITasasRepository tR;

    @Override
    public void insert(Tasas tasas) {tR.save(tasas);}

    @Override
    public List<Tasas> list() {return tR.findAll();}

    @Override
    public void delete(Long id) {tR.deleteById(id);}

    @Override
    public Tasas listarId(Long id) {
        return tR.findById(id).orElse(new Tasas());
    }

    @Override
    public Tasas obtenerPorId(Long id) {
        return null;
    }
}