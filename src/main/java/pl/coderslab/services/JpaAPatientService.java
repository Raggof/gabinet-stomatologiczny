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
        return null;
    }

    @Override
    public void add(APatient aPatient) {

    }

    @Override
    public Optional<APatient> get(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(APatient aPatient) {

    }
}
