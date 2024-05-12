package com.LiteThinking.masterspringbootbaseprojectfinal.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.LiteThinking.masterspringbootbaseprojectfinal.domain.User;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User save(User user);

}
