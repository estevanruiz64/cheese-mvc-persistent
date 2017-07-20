package org.launchcode.models.data;

import org.launchcode.models.Category;
import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Data Access Object
 */
@Repository
@Transactional
public interface CheeseDao extends CrudRepository<Cheese, Integer> {
    List<Cheese> findByCategory(Category category);
}
/** this is saying that a data base called CrudRepository is storing Cheese objects with all their
 * fields and a corresponding integer which is the primary key */