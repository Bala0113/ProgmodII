package com.pte.progmodii.repository;

import com.pte.progmodii.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

  //  @Query( value = "select p from User p where p.email like %:email%")
  //  Optional<User> findByEmail(String email);

}
