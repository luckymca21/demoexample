package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

class User {
	private int id;
	private String name;
	private Date dob;

	public int getId() {
		return id;
	}

	public User(int id, String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}

@RestController
public class SamController {

	@Autowired
	private ExampleDao dao;

	@GetMapping("/test")
	public User sample() {
		return new User(2, "sdfdsfs", new Date());
	}

	@PostMapping("/save")
	public Example Save(@RequestBody Example tutorial) {
		Example t = dao.save(tutorial);
		return t;
	}
}
