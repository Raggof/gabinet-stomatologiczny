package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.History;

public interface HistoryRepository extends JpaRepository<History, Long> {

}
