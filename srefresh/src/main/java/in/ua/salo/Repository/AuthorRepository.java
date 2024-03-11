package in.ua.salo.Repository;

import in.ua.salo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository< Author, Long> {
}
