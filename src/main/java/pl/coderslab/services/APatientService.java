package pl.coderslab.services;

import pl.coderslab.entity.APatient;

import java.util.List;
import java.util.Optional;

public interface APatientService {

    List<APatient> getAPatient();

    void add(APatient aPatient);

    Optional<APatient> get(Long id);

    void delete(Long id);

    void update(APatient aPatient);
}
