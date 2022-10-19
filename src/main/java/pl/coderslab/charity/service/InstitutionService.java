package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.domain.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;

import java.util.List;

@Service
@Transactional
public class InstitutionService {
    private final InstitutionRepository institutionRepository;

    public InstitutionService(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }
    public Institution addInstitution(Institution institution){
        institutionRepository.save(institution);
        return institution;
    }
    public List<Institution> findAll(){
        return institutionRepository.findAll();
    }
}
