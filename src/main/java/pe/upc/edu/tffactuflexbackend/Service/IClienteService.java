package pe.upc.edu.tffactuflexbackend.Service;

import pe.upc.edu.tffactuflexbackend.Entities.Cliente;
import java.util.List;

public interface IClienteService {
    public void insert(Cliente cliente);

    public List<Cliente> list();

    public void delete(Long idCliente);

    public Cliente listarId(Long idCliente);
}
