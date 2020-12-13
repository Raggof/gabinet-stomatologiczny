package pl.coderslab.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Visit;
import pl.coderslab.repository.VisitRepository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class JpaVisitService implements VisitService{

    private VisitRepository visitRepository;

    public JpaVisitService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public List<Visit> getVisit() {
        return visitRepository.findAll();
    }

    @Override
    public void add(Visit visit) {
        visitRepository.save(visit);
    }

    @Override
    public Optional<Visit> get(Long id) {
        return visitRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        visitRepository.deleteById(id);
    }
}
