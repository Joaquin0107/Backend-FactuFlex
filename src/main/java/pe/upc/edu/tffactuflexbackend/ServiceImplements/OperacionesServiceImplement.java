package pe.upc.edu.tffactuflexbackend.ServiceImplements;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.edu.tffactuflexbackend.DTOs.OperacionesBDTO;
import pe.upc.edu.tffactuflexbackend.DTOs.OperacionesConsultaDTO;
import pe.upc.edu.tffactuflexbackend.DTOs.OperacionesDTO;
import pe.upc.edu.tffactuflexbackend.Entities.Operaciones;
import pe.upc.edu.tffactuflexbackend.Repositories.IOperacionesRepository;
import pe.upc.edu.tffactuflexbackend.Service.IOperacionesService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class OperacionesServiceImplement implements IOperacionesService {
    @Autowired
    private IOperacionesRepository oR;
    @Override
    public OperacionesDTO procesarTransaccion(OperacionesBDTO operacionBDTO) {
        ModelMapper mapper = new ModelMapper();
        Operaciones operacion = mapper.map(operacionBDTO, Operaciones.class);

        double tea = calcularTEA(operacion.getTipoTasa(), operacion.getTasaAsignada(), operacion.getCapitalizacion());
        double tasaDescuento = calcularTasaDescuento(tea);
        double descuento = operacion.getMontoOriginal() * tasaDescuento;
        double saldoFinal = operacion.getMontoOriginal() * Math.pow(1 + tea, operacion.getFechaVencimiento().toEpochDay() - operacion.getFechaEmision().toEpochDay() / 360);
        double tcea = calcularTCEA(tasaDescuento);

        operacion.setTep(tea);
        operacion.setTasaDescuento(tasaDescuento);
        operacion.setDescuento(descuento);
        operacion.setSaldoFinal(saldoFinal);
        operacion.setTcea(tcea);

        oR.save(operacion);

        return mapper.map(operacion, OperacionesDTO.class);
    }

    @Override
    public List<Operaciones> listar() {
        return oR.findAll();
    }

    @Override
    public OperacionesDTO listarConCalculos(Long id) {
        Operaciones operacion = oR.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Operación no encontrada"));
        ModelMapper mapper = new ModelMapper();
        return mapper.map(operacion, OperacionesDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        oR.deleteById(id);
    }

    @Override
    public List<OperacionesConsultaDTO> consultarOperacionesPorCliente(Long idCliente) {
        List<Object[]> resultados = oR.consultarOperacionesPorCliente(idCliente);
        List<OperacionesConsultaDTO> operacionesConsultaDTOs = new ArrayList<>();

        for (Object[] fila : resultados) {
            OperacionesConsultaDTO dto = new OperacionesConsultaDTO();
            dto.setIdOperacion((Long) fila[0]);
            dto.setNombreEmpresa((String) fila[1]);
            dto.setTipoTasa((String) fila[2]);
            dto.setTasaAsignada((Double) fila[3]);
            dto.setSaldoFinal((Double) fila[4]);
            dto.setFechaPago((LocalDate) fila[5]);
            dto.setMontoOriginal((Double) fila[6]);
            dto.setEstado((String) fila[7]);
            operacionesConsultaDTOs.add(dto);
        }

        return operacionesConsultaDTOs;
    }

    private double calcularTEA(String tipoTasa, double tasa, String capitalizacion) {
        if (tipoTasa.equalsIgnoreCase("tnm")) {
            int frecuencia = obtenerFrecuencia(capitalizacion);
            return Math.pow(1 + (tasa / 100) / frecuencia, frecuencia) - 1;
        } else if (tipoTasa.equalsIgnoreCase("tna")) {
            return Math.pow(1 + (tasa / 100) / 12, 12) - 1;
        } else {
            throw new IllegalArgumentException("Tipo de tasa no soportado.");
        }
    }

    private double calcularTasaDescuento(double tea) {
        return tea / (1 + tea);
    }

    private double calcularTCEA(double tasaDescuento) {
        return Math.pow(1 + tasaDescuento, 12) - 1;
    }

    private int obtenerFrecuencia(String capitalizacion) {
        switch (capitalizacion.toLowerCase()) {
            case "diario":
                return 365;
            case "quincenal":
                return 24;
            case "mensual":
                return 12;
            case "bimestral":
                return 6;
            case "trimestral":
                return 4;
            case "cuatrimestral":
                return 3;
            case "semestral":
                return 2;
            case "anual":
                return 1;
            default:
                throw new IllegalArgumentException("Capitalización no soportada.");
        }
    }
}
