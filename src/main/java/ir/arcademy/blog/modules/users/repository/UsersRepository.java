package ir.arcademy.blog.modules.users.repository;

import ir.arcademy.blog.modules.users.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    // select * from users where email = "...."
    Users findByEmail(String email);
}
