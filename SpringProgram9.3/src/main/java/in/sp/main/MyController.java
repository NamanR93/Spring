package in.sp.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@GetMapping("/aboutUs")
	public String openAboutUsPage() {

		return "About-us";
	}

	// first we will see Model

	@RequestMapping("/home")
	public String getHomePage(Model model) {

		model.addAttribute("name", "Naman");
		model.addAttribute("id", 23);
		List<String> friends = new ArrayList<String>();

		friends.add("harsh");
		friends.add("ashim");
		friends.add("sid");

		model.addAttribute("f", friends);

		return "home";
	}

	// now we fill see ModelAndView

	@RequestMapping("/help")
	public ModelAndView getHelp() {
		
		//creating the model view object
		ModelAndView mav1 = new ModelAndView("help");
		
		//setting the data
		mav1.addObject("name","naman");
		mav1.addObject("rollno",23);
		
		
//		
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(12);
//		list.add(23);
//		list.add(45);
//		
//		mav1.addObject("marks", list);
//		)
        //setting the view name
		//mav1.setView("help");
		return mav1;
	}

	

}
