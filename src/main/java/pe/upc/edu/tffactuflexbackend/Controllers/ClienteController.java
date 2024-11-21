package pe.upc.edu.tffactuflexbackend.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.tffactuflexbackend.Entities.Cliente;
import pe.upc.edu.tffactuflexbackend.Service.IClienteService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private IClienteService cS;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public void insertarCliente(@RequestBody Cliente cliente) {
        cS.insert(cliente);
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<Cliente> listarClientes() {
        return cS.list();
    }

    @GetMapping("/{idCliente}")
    @PreAuthorize("hasRole('ADMIN') or (hasRole('CLIENTE') and #idCliente == principal.id)")
    public Cliente listarClientePorId(@PathVariable Long idCliente) {
        return cS.listarId(idCliente);
    }

    @DeleteMapping("/{idCliente}")
    @PreAuthorize("hasRole('ADMIN')")
    public void eliminarCliente(@PathVariable Long idCliente) {
        cS.delete(idCliente);
    }
}
