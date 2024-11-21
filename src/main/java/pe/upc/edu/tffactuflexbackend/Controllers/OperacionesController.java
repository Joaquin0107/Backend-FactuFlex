package pe.upc.edu.tffactuflexbackend.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.tffactuflexbackend.DTOs.OperacionesBDTO;
import pe.upc.edu.tffactuflexbackend.DTOs.OperacionesConsultaDTO;
import pe.upc.edu.tffactuflexbackend.DTOs.OperacionesDTO;
import pe.upc.edu.tffactuflexbackend.Service.IOperacionesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/operaciones")
public class OperacionesController {
    @Autowired
    private IOperacionesService oP;

    @PreAuthorize("hasRole('CLIENTE')")
    @PostMapping
    public OperacionesDTO insertar(@RequestBody OperacionesBDTO operacionBDTO) {
        return oP.procesarTransaccion(operacionBDTO);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public List<OperacionesDTO> listar() {
        return oP.listar().stream().map(op -> {
            ModelMapper mapper = new ModelMapper();
            return mapper.map(op, OperacionesDTO.class);
        }).collect(Collectors.toList());
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'CLIENTE')")
    @GetMapping("/{id}")
    public OperacionesDTO listarPorId(@PathVariable("id") Long id) {
        return oP.listarConCalculos(id);
    }

    @PreAuthorize("hasRole('CLIENTE')")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        oP.eliminar(id);
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'CLIENTE')")
    @GetMapping("/consulta/{idCliente}")
    public List<OperacionesConsultaDTO> consultarOperaciones(@PathVariable("idCliente") Long idCliente) {
        return oP.consultarOperacionesPorCliente(idCliente);
    }
}
