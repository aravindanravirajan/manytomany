package Contoroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.UserTable;
import Service.UserService;

@RestController
@RequestMapping("/main")
public class Controller {
	
	 private UserService userservice;

	
	@GetMapping("/user")
	public List<UserTable> manytomany() {
		return userservice.getmany();
		
	
	}
}
