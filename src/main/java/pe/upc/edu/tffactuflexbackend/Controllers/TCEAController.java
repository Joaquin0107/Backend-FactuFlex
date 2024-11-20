package pe.upc.edu.tffactuflexbackend.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.upc.edu.tffactuflexbackend.Entities.Tasas;
import pe.upc.edu.tffactuflexbackend.Service.ITCEAService;

import java.util.List;

@RestController
@RequestMapping("/tcea")
public class TCEAController {

    @Autowired
    private ITCEAService tceaService;

    @PostMapping
    public void insertTCEA(@RequestBody Tasas.TCEA tcea) {
        tceaService.insert(tcea);
    }

    @GetMapping
    public List<Tasas.TCEA> listTCEA() {
        return tceaService.list();
    }

    @DeleteMapping("/{id}")
    public void deleteTCEA(@PathVariable Long id) {
        tceaService.delete(id);
    }

    @GetMapping("/{id}")
    public Tasas.TCEA getTCEAById(@PathVariable Long id) {
        return tceaService.obtenerPorId(id);
    }
}