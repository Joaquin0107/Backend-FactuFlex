package pe.upc.edu.tffactuflexbackend.Service;

import pe.upc.edu.tffactuflexbackend.DTOs.OperacionesBDTO;
import pe.upc.edu.tffactuflexbackend.DTOs.OperacionesConsultaDTO;
import pe.upc.edu.tffactuflexbackend.DTOs.OperacionesDTO;
import pe.upc.edu.tffactuflexbackend.Entities.Operaciones;

import java.util.List;

public interface IOperacionesService {
    OperacionesDTO procesarTransaccion(OperacionesBDTO operacionBDTO);
    List<Operaciones> listar();
    OperacionesDTO listarConCalculos(Long id);
    void eliminar(Long id);
    List<OperacionesConsultaDTO> consultarOperacionesPorCliente(Long idCliente);
}
