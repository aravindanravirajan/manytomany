
package com.example.demo.Contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Studenttable;
import com.example.demo.Model.UserTable;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/none")
public class Controller {
	@Autowired
	private UserService userservice;

	@GetMapping("/user")
	public List<Studenttable> manytomany() {
		return userservice.getmany();
	}

	@PostMapping("/insert/{id}")
	public void insert(@RequestBody List<UserTable> usertable ,@PathVariable Integer id) {
		userservice.inserts(usertable);
	}
}
