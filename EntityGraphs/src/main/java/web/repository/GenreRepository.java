package web.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.model.Genre;

import java.util.List;


@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

    @EntityGraph(attributePaths = {"genre"})
    List<Genre> findAllgenre();
}
