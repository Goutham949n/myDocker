package org.springframework.boot.gsspringbootdocker;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping(path = "/demo") 
public class MainController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
		User n = new User();
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	@RequestMapping(value = "/getStudents")
	public List<String> getStudents() {

		List<String> students = new ArrayList<String>();
		{
			students.add("Sajal");
			students.add("Lokesh");
			students.add("Kajal");
			students.add("Sukesh");
		}
		
		return students;
	}
}