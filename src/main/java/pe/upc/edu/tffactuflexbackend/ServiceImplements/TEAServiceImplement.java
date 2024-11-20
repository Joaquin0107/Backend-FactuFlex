package pe.upc.edu.tffactuflexbackend.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.tffactuflexbackend.Entities.Tasas;
import pe.upc.edu.tffactuflexbackend.Repositories.ITEARepository;
import pe.upc.edu.tffactuflexbackend.Service.ITEAService;

import java.util.List;

@Service
public class TEAServiceImplement implements ITEAService {
    @Autowired
    private ITEARepository teaR;

    @Override
    public void insert(Tasas.TEA tea) {teaR.save(tea);}

    @Override
    public List<Tasas.TEA> list() {return teaR.findAll();}

    @Override
    public void delete(Long id) {teaR.deleteById(id);}

    @Override
    public Tasas.TEA listarId(Long id) {
        return null;
    }

    @Override
    public Tasas.TEA obtenerPorId(Long id) {
        return null;
    }
}