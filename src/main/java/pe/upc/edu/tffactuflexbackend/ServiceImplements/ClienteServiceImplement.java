package pe.upc.edu.tffactuflexbackend.ServiceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.tffactuflexbackend.Entities.Cliente;
import pe.upc.edu.tffactuflexbackend.Repositories.IClienteRepository;
import pe.upc.edu.tffactuflexbackend.Service.IClienteService;

import java.util.List;

@Service
public class ClienteServiceImplement implements IClienteService {

    @Autowired
    private IClienteRepository cR;
    @Override
    public void insert(Cliente cliente) {
        cR.save(cliente);
    }

    @Override
    public List<Cliente> list() {
        return cR.findAll();
    }

    @Override
    public void delete(Long idCliente) {
        cR.deleteById(idCliente);
    }

    @Override
    public Cliente listarId(Long idCliente) {
        return cR.findById(idCliente).orElse(new Cliente());
    }
}
