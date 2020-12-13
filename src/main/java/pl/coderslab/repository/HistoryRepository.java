package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.entity.History;

import java.util.List;


public interface HistoryRepository extends JpaRepository<History, Long> {

    @Query(value = "SELECT h FROM History h WHERE h.patId = ?1")
    List<History> findByHistoryByPatientId(Long patientID);

    @Query(value = "SELECT h FROM History h WHERE h.patId = ?1")
    List<History> findByHistoryByDate(Long patientID);
}
