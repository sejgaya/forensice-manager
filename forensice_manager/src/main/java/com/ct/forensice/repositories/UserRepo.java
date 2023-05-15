package com.ct.forensice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ct.forensice.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
