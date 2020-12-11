package pl.coderslab.services;

import pl.coderslab.entity.History;

import java.util.List;
import java.util.Optional;

public interface HistoryService {

    List<History> getHistory();

    void add(History history);

    Optional<History> get(Long id);

    void delete(Long id);

    void update(History history);
}
