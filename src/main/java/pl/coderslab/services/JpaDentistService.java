package pl.coderslab.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Dentist;
import pl.coderslab.repository.DentistRepository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class JpaDentistService implements DentistService{

    private final DentistRepository dentistRepository;

    public JpaDentistService(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    @Override
    public List<Dentist> getDentists() {
        return dentistRepository.findAll();
    }

    @Override
    public void add(Dentist dentist) {

    }

    @Override
    public Optional<Dentist> get(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Dentist dentist) {

    }
}
