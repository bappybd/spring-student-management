package com.shaiful.Repository;

import com.shaiful.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User, Integer> {

}
