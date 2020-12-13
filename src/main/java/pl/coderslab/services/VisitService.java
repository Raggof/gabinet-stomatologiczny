package pl.coderslab.services;

import pl.coderslab.entity.Visit;

import java.util.List;
import java.util.Optional;

public interface VisitService {

    List<Visit> getVisit();

    void add(Visit visit);

    Optional<Visit> get(Long id);

    void delete(Long id);
}
