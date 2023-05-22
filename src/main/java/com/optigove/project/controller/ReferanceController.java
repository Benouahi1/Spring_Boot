package com.optigove.project.controller;


import com.optigove.project.model.Referance;
import com.optigove.project.service.ReferanceService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/referance")

public class ReferanceController {
    private final ReferanceService referanceService;

    public ReferanceController(ReferanceService referanceService) {
        this.referanceService = referanceService;
    }

    @PostMapping("/create")
    public Referance create(@RequestBody Referance referanc){
        return referanceService.create(referanc);
    }


    @GetMapping("/read")
    public List<Referance> read(){
        return referanceService.lire();
    }
    @PutMapping("/update/{id}")
    public Referance update(@PathVariable Long id,@RequestBody Referance referance){
        return referanceService.modifier(id, referance);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return referanceService.supprimer(id);
    }

}
