package softuniBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.Category;

/**
 * Created by antfesenko on 31.03.2017.
 */
public interface CategoryRepository extends JpaRepository<Category,Integer>{

}
