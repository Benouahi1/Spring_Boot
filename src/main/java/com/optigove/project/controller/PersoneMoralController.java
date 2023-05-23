package com.optigove.project.controller;


import com.optigove.project.model.PersoneMoral;
import com.optigove.project.service.PersoneMoralService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personeMoral")
public class PersoneMoralController {

    private final PersoneMoralService personeMoralService;

    public PersoneMoralController(PersoneMoralService personeMoralService){
        this.personeMoralService = personeMoralService;
    }


    @PostMapping("/create")
    public PersoneMoral create(@RequestBody PersoneMoral personeMoral){
        return personeMoralService.create(personeMoral);
    }
    @GetMapping("/read")
    public List<PersoneMoral> read(){
        return personeMoralService.lire();
    }

    @PutMapping("/update/{id}")
    public PersoneMoral update(@PathVariable Long id,@RequestBody PersoneMoral personeMoral){
        return personeMoralService.moudifier(id, personeMoral);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return personeMoralService.suppremer(id);
    }

}
