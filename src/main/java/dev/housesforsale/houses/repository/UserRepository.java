package dev.housesforsale.houses.repository;

import dev.housesforsale.houses.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
