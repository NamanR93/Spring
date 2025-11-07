package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.sp.model.User;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
	
	@ModelAttribute
	public void commonMethod(Model m) {
		m.addAttribute("Header","Learning Spring");
		m.addAttribute("desc","Registration");

	}

	@RequestMapping("/myForm")
	public String showForm(Model m) {

		return "Contact";
	}

	// 1. this one is old.

	// @RequestMapping(path="/submitForm",method=RequestMethod.POST) or
//	@PostMapping("/submitForm")
//	public String getForm(HttpServletRequest req) {
//		
//		String email = req.getParameter("email");
//		System.out.println("user email is "+email);
//		
//		return "profile";
//	}
	
	
	
	
	

	         // 2. Now we see requestparam annotation.

//	@PostMapping("/submitForm")
//	public String getForm(@RequestParam("email") String myemail,
//						  @RequestParam("username")String myname,
//						  @RequestParam("password") String myPass,
//						  Model model) {
//		
//		model.addAttribute("name", myname);
//		model.addAttribute("email", myemail);
//		model.addAttribute("password", myPass);
//
//		return "profile";
//	}
//	
	
	      //  3.Now we see @ModelAttribute
	
	
	@PostMapping("/submitForm")
	public String getForm(@ModelAttribute User user,Model model) {
		
		return"profile";
	}
	


}
