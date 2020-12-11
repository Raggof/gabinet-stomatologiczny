package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.Dentist;

public interface DentistRepository extends JpaRepository<Dentist, Long> {
}
