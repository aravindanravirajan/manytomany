package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Studenttable;

public interface StudentRepository extends JpaRepository<Studenttable,Integer> {
	
}
