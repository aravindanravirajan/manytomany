package com.example.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Studenttable;
import com.example.demo.Model.UserTable;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Repository.UserRepository;


@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	StudentRepository studentRepository;
	public List<Studenttable> getmany() {
	return	studentRepository.findAll();
		}
	public void inserts(List<UserTable> usertable){
		
		userRepository.saveAll(usertable);
		
	}

}
