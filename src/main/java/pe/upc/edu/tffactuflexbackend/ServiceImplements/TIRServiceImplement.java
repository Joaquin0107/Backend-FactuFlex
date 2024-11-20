package pe.upc.edu.tffactuflexbackend.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.tffactuflexbackend.Entities.Tasas;
import pe.upc.edu.tffactuflexbackend.Repositories.ITIRRepository;
import pe.upc.edu.tffactuflexbackend.Service.ITIRService;

import java.util.List;

@Service
public class TIRServiceImplement implements ITIRService {
    @Autowired
    private ITIRRepository tirR;

    @Override
    public void insert(Tasas.TIR tir) {tirR.save(tir);}

    @Override
    public List<Tasas.TIR> list() {return tirR.findAll();}

    @Override
    public void delete(Long id) {tirR.deleteById(id);}

    @Override
    public Tasas.TIR listarId(Long id) {
        return null;
    }

    @Override
    public Tasas.TIR obtenerPorId(Long id) {
        return null;
    }
}
