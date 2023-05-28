package web.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.model.Book;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

  @EntityGraph(attributePaths = {"author", "genre"})
  List<Book> findAll();
  @EntityGraph(value = "bookEntityGraphWithAuthorAndGenre", type = EntityGraph.EntityGraphType.FETCH)
  Optional<Book> findById(Long id);
  @EntityGraph(attributePaths = {"authors", "genre"})
  List<Book> findAuthorGenre();

}
