package com.store59.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/account")
public class UserController {
	@RequestMapping("/user")
	@ResponseBody
	public User view(int age) {
		User user = new User();
		user.setAge(age);
		user.setName("zhang");
		return user;
	}
}
