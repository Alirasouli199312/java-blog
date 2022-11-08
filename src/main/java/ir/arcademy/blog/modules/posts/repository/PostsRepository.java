package ir.arcademy.blog.modules.posts.repository;

import ir.arcademy.blog.modules.posts.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Category, Long> {

}
