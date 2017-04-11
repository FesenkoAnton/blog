package softuniBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.Tag;

/**
 * Created by antfesenko on 03.04.2017.
 */
public interface TagRepository extends JpaRepository<Tag,Integer> {
    Tag findByName(String name);
}
