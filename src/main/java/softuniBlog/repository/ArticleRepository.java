package softuniBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.Article;

/**
 * Created by antfesenko on 28.03.2017.
 */
public interface ArticleRepository extends JpaRepository<Article,Integer>{

}
