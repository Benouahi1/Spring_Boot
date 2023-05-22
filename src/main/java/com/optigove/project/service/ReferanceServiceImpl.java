package com.optigove.project.service;

import com.optigove.project.model.Referance;
import com.optigove.project.repository.ReferanceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ReferanceServiceImpl implements ReferanceService{

    private final ReferanceRepository referanceRepository;

    @Override
    public Referance create(Referance referance) {
        return referanceRepository.save(referance);
    }

    @Override
    public List<Referance> lire() {
        return referanceRepository.findAll();
    }

    @Override
    public Referance modifier(Long id, Referance referance) {
        return referanceRepository.findById(id)
                .map(p-> {
                    p.setDeligataire(p.getDeligataire());
                    p.setSupport(p.getSupport());
                    p.setNumero(p.getNumero());
                    p.setObject(p.getObject());
                    p.setAdress(p.getAdress());
                    p.setLibelle(p.getLibelle());
                    p.setCin(p.getCin());
                    p.setMontant(p.getMontant());
                    return referanceRepository.save(p);
                }).orElseThrow(()-> new RuntimeException("Referance Non trouver"));
    }

    @Override
    public String supprimer(Long id) {

        referanceRepository.deleteById(id);
        return "Referance Suppremer";
    }
}
