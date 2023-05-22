package com.optigove.project.service;

import com.optigove.project.model.PersoneMoral;
import com.optigove.project.repository.PersonMoralRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersoneMoralServiceImpl implements PersoneMoralService{


    private final PersonMoralRepository personMoralRepository;

    @Override
    public PersoneMoral create(PersoneMoral personeMoral){
        return personMoralRepository.save(personeMoral);
    }

    @Override
    public List<PersoneMoral> lire(){
        return personMoralRepository.findAll();
    }

    @Override
    public PersoneMoral moudifier(Long id,PersoneMoral personeMoral){
        return personMoralRepository.findById(id)
                .map(p -> {
                    p.getNom();
                    p.getAdress();
                    p.getEmail();
                    p.getActivite();
                    p.getIdentifiant();
                    p.getTelephone();
                    p.getTelgsm();
                    p.getCnss();
                    p.getPatente();
                    p.getRemarque();
                    p.getRc();
                    p.getIce();
                    return personMoralRepository.save(p);
                }).orElseThrow(()->new RuntimeException("Persone Moral Non trouver"));
    }



    @Override
    public String suppremer(Long id){
        personMoralRepository.deleteById(id);
        return "Personne Moral Supremmer";
    }


}
