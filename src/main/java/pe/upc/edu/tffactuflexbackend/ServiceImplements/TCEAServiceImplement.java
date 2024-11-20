package pe.upc.edu.tffactuflexbackend.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.tffactuflexbackend.Entities.Tasas;
import pe.upc.edu.tffactuflexbackend.Repositories.ITCEARepository;
import pe.upc.edu.tffactuflexbackend.Service.ITCEAService;

import java.util.List;

@Service
public class TCEAServiceImplement implements ITCEAService {
    @Autowired
    private ITCEARepository tceaR;

    @Override
    public void insert(Tasas.TCEA tcea) {tceaR.save(tcea);}

    @Override
    public List<Tasas.TCEA> list() {return tceaR.findAll();}

    @Override
    public void delete(Long id) {tceaR.deleteById(id);}

    @Override
    public Tasas.TCEA listarId(Long id) {
        return null;
    }

    @Override
    public Tasas.TCEA obtenerPorId(Long id) {
        return null;
    }
}
