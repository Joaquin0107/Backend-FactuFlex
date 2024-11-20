package pe.upc.edu.tffactuflexbackend.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.tffactuflexbackend.Entities.Tasas;
import pe.upc.edu.tffactuflexbackend.Service.ITREAService;

import java.util.List;

@RestController
@RequestMapping("/trea")
public class TREAController {

    @Autowired
    private ITREAService treaService;

    @PostMapping
    public void insertTREA(@RequestBody Tasas.TREA trea) {
        treaService.insert(trea);
    }

    @GetMapping
    public List<Tasas.TREA> listTREA() {
        return treaService.list();
    }

    @DeleteMapping("/{id}")
    public void deleteTREA(@PathVariable Long id) {
        treaService.delete(id);
    }

    @GetMapping("/{id}")
    public Tasas.TREA getTREAById(@PathVariable Long id) {
        return treaService.obtenerPorId(id);
    }
}