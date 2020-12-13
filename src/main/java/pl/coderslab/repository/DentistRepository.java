package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.entity.Dentist;

import java.util.List;

public interface DentistRepository extends JpaRepository<Dentist, Long> {
}
