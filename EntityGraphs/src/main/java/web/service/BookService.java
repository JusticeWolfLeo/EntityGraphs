package web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.Book;
import web.repository.BookRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class BookService {
  private final BookRepository repo;
  public List<Book> findAuthorGenre(){
    return repo.findAuthorGenre();
  }

}
