package pe.upc.edu.tffactuflexbackend.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.tffactuflexbackend.Entities.Tasas;
import pe.upc.edu.tffactuflexbackend.Service.ITIRService;

import java.util.List;

@RestController
@RequestMapping("/tir")
public class TIRController {

    @Autowired
    private ITIRService tirService;

    @PostMapping
    public void insertTIR(@RequestBody Tasas.TIR tir) {
        tirService.insert(tir);
    }

    @GetMapping
    public List<Tasas.TIR> listTIR() {
        return tirService.list();
    }

    @DeleteMapping("/{id}")
    public void deleteTIR(@PathVariable Long id) {
        tirService.delete(id);
    }

    @GetMapping("/{id}")
    public Tasas.TIR getTIRById(@PathVariable Long id) {
        return tirService.obtenerPorId(id);
    }
}