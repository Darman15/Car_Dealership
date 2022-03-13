package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.claim.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.email = ?1 AND u.userPassword = ?2")
    User findUserByemailAndpassword(String email, String password);
}
