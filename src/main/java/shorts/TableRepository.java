package shorts;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TableRepository extends CrudRepository<TableStorage, Long> {

    List<TableStorage> findByFirstName(String firstName);

    TableStorage findById(long id);
}