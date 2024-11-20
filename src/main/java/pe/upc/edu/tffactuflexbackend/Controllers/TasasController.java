package pe.upc.edu.tffactuflexbackend.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.tffactuflexbackend.Entities.Tasas;
import pe.upc.edu.tffactuflexbackend.Service.ITasasService;

import java.util.List;

@RestController
@RequestMapping("/tasas")
public class TasasController {

    @Autowired
    private ITasasService tasasService;

    @PostMapping
    public void insertTasas(@RequestBody Tasas tasas) {
        tasasService.insert(tasas);
    }

    @GetMapping
    public List<Tasas> listTasas() {
        return tasasService.list();
    }

    @DeleteMapping("/{id}")
    public void deleteTasas(@PathVariable Long id) {
        tasasService.delete(id);
    }

    @GetMapping("/{id}")
    public Tasas getTasasById(@PathVariable Long id) {
        return tasasService.obtenerPorId(id);
    }
}