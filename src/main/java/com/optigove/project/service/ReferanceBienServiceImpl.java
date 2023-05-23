package com.optigove.project.service;

import com.optigove.project.model.ReferanceBien;
import com.optigove.project.repository.ReferanceBienRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReferanceBienServiceImpl implements ReferanceBienService {

    private final ReferanceBienRepository referanceBienRepository;

    @Override
    public ReferanceBien create(ReferanceBien referanceBien){
        return referanceBienRepository.save(referanceBien);
    }

    @Override
    public List<ReferanceBien> lire(){
        return referanceBienRepository.findAll();

    }

    @Override
    public String Suppremer(Long id){
        referanceBienRepository.deleteById(id);
        return "Referance de bien Supremmer";
    }
}
