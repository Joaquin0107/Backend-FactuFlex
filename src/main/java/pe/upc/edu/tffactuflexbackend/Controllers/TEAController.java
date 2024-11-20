package pe.upc.edu.tffactuflexbackend.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.tffactuflexbackend.Entities.Tasas;
import pe.upc.edu.tffactuflexbackend.Service.ITEAService;

import java.util.List;

@RestController
@RequestMapping("/tea")
public class TEAController {

    @Autowired
    private ITEAService teaService;

    @PostMapping
    public void insertTEA(@RequestBody Tasas.TEA tea) {
        teaService.insert(tea);
    }

    @GetMapping
    public List<Tasas.TEA> listTEA() {
        return teaService.list();
    }

    @DeleteMapping("/{id}")
    public void deleteTEA(@PathVariable Long id) {
        teaService.delete(id);
    }

    @GetMapping("/{id}")
    public Tasas.TEA getTEAById(@PathVariable Long id) {
        return teaService.obtenerPorId(id);
    }
}