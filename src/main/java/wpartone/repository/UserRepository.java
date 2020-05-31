package wpartone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wpartone.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
