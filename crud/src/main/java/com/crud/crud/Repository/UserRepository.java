package com.crud.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.crud.Modal.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
