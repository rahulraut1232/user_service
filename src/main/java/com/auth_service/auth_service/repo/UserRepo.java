package com.auth_service.auth_service.repo;

import com.auth_service.auth_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

    @Query("SELECT u FROM User u WHERE u.username = :username")
    User getUserByUserName(@Param("username") String username);
}
