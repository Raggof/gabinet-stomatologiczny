package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.entity.APatient;

import java.util.List;


public interface APatientRepository extends JpaRepository<APatient, Long> {

}
