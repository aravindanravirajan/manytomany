package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.UserTable;
@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<UserTable, Integer> {

}
