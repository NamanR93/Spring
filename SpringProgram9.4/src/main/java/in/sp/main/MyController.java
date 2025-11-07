package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.sp.Beans.User;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	// @RequestMapping(value = "/hellopage", method = RequestMethod.GET)

	@GetMapping("/hellopage")
	public ModelAndView openHelloPage() {

		System.out.println("openHelloPage() method executed");

		ModelAndView mav = new ModelAndView("hello");
		// mav.setViewName("hello");

		return mav;

	}

	@GetMapping("/aboutUs")
	public String openAboutUsPage() {

		return "About-us";
	}

	@GetMapping("/myForm")
	public String openMyFormPage() {

		return "My-form";
	}

//	@PostMapping("/submitForm")
//	public String handledMyForm(HttpServletRequest req) {
//		
//		String name = req.getParameter("name1");
//		String emailId = req.getParameter("emailId1");
//		
//		System.out.println("Name: " + name);
//		System.out.println("Age: " + emailId);
//		
//		return "profile";
//		
//		
//	}
	
//	@PostMapping("/submitForm")
//	public String handledMyForm(
//			
//			@RequestParam("name1") String myName,
//			@RequestParam("emailId1") String myEmailId,
//			Model model
//			
//			
//			)
//	{
//	model.addAttribute("model_name", myName);
//	model.addAttribute("model_id", myEmailId);
//
//	
//
//		return "profile";
//	}
	
//	@PostMapping("/submitForm")
//	public String handledMyForm(
//			
//			@RequestParam("name1") String myName,
//			@RequestParam("emailId1") String myEmailId,
//			Model model
//			
//			
//			)
//	{
//		
//		User user = new User();
//		user.setName(myName);
//		user.setEmailId(myEmailId);
//		model.addAttribute("user", user);
//	
//	
//
//		return "profile";
//	}
	
	@PostMapping("/submitForm")
	public String handledMyForm(@ModelAttribute("model_name") User user)
	{
		return "profile";
	}
	
	
}
