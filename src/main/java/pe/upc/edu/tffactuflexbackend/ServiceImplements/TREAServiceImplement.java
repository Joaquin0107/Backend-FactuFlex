package pe.upc.edu.tffactuflexbackend.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.tffactuflexbackend.Entities.Tasas;
import pe.upc.edu.tffactuflexbackend.Repositories.ITREARepository;
import pe.upc.edu.tffactuflexbackend.Service.ITREAService;

import java.util.List;

@Service
public class TREAServiceImplement implements ITREAService {
    @Autowired
    private ITREARepository treaR;

    @Override
    public void insert(Tasas.TREA trea) {treaR.save(trea);}

    @Override
    public List<Tasas.TREA> list() {return treaR.findAll();}

    @Override
    public void delete(Long id) {treaR.deleteById(id);}

    @Override
    public Tasas.TREA listarId(Long id) {
        return null;
    }

    @Override
    public Tasas.TREA obtenerPorId(Long id) {
        return null;
    }
}