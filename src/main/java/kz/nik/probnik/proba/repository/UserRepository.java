package kz.nik.probnik.proba.repository;

import jakarta.transaction.Transactional;
import kz.nik.probnik.proba.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
