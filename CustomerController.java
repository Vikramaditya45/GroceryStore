package com.project_Main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project_Main.Model.Customer_Model;
import com.project_Main.Repository.customer_repo;

@Controller
public class CustomerController 
{
	@Autowired
	public customer_repo custrepo;
	
	@GetMapping("/")
	public String login()
	{
		return "HomePage.jsp";
	}
	
	@PostMapping("/Register")
	public String register(@ModelAttribute Customer_Model custmod)
	{
		System.out.println(custmod);
		custrepo.save(custmod);
		return "HomePage.jsp";
	}
	
	@GetMapping("/HomePage")
	public String login(@RequestParam String Username, @RequestParam String password)
	{
		System.out.println(Username + " " + password);
		
		Customer_Model ob = custrepo.findByEmail(Username);
		if(ob != null && ob.getUsername().equalsIgnoreCase(Username) && ob.getPassword().equals(password))
		{
			return "Dashboard.jsp";
		}
		
		else
		{
			return "redirect:/HomePage?error=true"; 
		}
	}
}