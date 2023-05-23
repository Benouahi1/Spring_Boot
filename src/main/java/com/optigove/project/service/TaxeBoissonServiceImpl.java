package com.optigove.project.service;

import com.optigove.project.model.TaxeBoisson;
import com.optigove.project.repository.TaxeBoissonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaxeBoissonServiceImpl implements TaxeBoissonService {

    private final TaxeBoissonRepository taxeBoissonRepository;

    @Override
    public TaxeBoisson create(TaxeBoisson taxeBoisson){
        return taxeBoissonRepository.save(taxeBoisson);
    }

    @Override
    public List<TaxeBoisson> lire(){
        return taxeBoissonRepository.findAll();
    }

    @Override
    public String Supprimer(Long id) {
        taxeBoissonRepository.deleteById(id);
        return "Referance Suppremer";
    }


}
