package org.springframework.boot.gsspringbootdocker.repositories;

import org.springframework.boot.gsspringbootdocker.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}