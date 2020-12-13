package pl.coderslab.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.coderslab.entity.APatient;
import pl.coderslab.repository.APatientRepository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class JpaAPatientService implements APatientService{

    private final APatientRepository aPatientRepository;

    public JpaAPatientService(APatientRepository aPatientRepository) {
        this.aPatientRepository = aPatientRepository;
    }

    @Override
    public List<APatient> getAPatient() {
        return aPatientRepository.findAll();
    }

    @Override
    public void add(APatient aPatient) {
        aPatientRepository.save(aPatient);
    }

    @Override
    public Optional<APatient> get(Long id) {
        return aPatientRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        aPatientRepository.deleteById(id);
    }

    @Override
    public void update(APatient aPatient) {
        aPatientRepository.save(aPatient);
    }
}
