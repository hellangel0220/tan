package Lab1;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class Bai2 {
		@GetMapping ("/index")
		public String index (Model model) {
			model.addAttribute("message", "Welcome to Spring MVC");
			System.out.println(model);
			return "index";
		}

	}
