package pl.coderslab.services;

import pl.coderslab.entity.Dentist;

import java.util.List;
import java.util.Optional;

public interface DentistService {

    List<Dentist> getDentists();

    void add(Dentist dentist);

    Optional<Dentist> get(Long id);

    void delete(Long id);

    void update(Dentist dentist);
}
