package net.slipp.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	
	@GetMapping("/helloworld")
	public String welcome(Model model) {
		//List<MyModel> repo = new ArrayList<MyModel>();
		List<MyModel> repo = Arrays.asList(new MyModel("dsmannk"), new MyModel("sams"));
		
		//System.out.println("repo = ", repo);
		
		model.addAttribute("repo", repo);
		return "welcome";
	}
	
	/*
	@GetMapping("/helloworld3")
	public String welcome(Model model) {
		
		model.addAttribute("name", "dsmannk");
		model.addAttribute("value", 10000);
		model.addAttribute("taxed_value", 30);
		model.addAttribute("in_ca", true);
		return "welcome";
	}
	*/
	
	
	@GetMapping("/helloworld2")
	public String welcome(String name, int age, Model model) {
		System.out.println("name : " + name);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "welcome";
	}
}
