package pl.coderslab.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.coderslab.entity.History;
import pl.coderslab.repository.HistoryRepository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class JpaHistoryService implements HistoryService {

    private final HistoryRepository historyRepository;

    public JpaHistoryService(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    @Override
    public List<History> getHistory() {
        return historyRepository.findAll();
    }

    @Override
    public void add(History history) {
        historyRepository.save(history);
    }

    @Override
    public Optional<History> get(Long id) {
        return historyRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        historyRepository.deleteById(id);
    }

    @Override
    public void update(History history) {
        historyRepository.save(history);
    }
}
