package pl.olointeria.movieclub.genre;

import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface GenreRepository extends CrudRepository<Genre, Long> {
    Optional<Genre> findByNameIgnoreCase(String name);
}
