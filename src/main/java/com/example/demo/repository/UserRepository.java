package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.user.model.MUser;

public interface UserRepository extends JpaRepository<MUser, String> {

}
