package Lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("Student")
public class Student {
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	HttpServletResponse response;
	
	@GetMapping("create")
	public String create() {
		return "createStudent";
	}
	@PostMapping("create")
	public String createPost() {
		String username=request.getParameter("username");
		String Password=request.getParameter("Password");
		

		StudentController student = new StudentController(username,Password);
		request.setAttribute("Student", student);
		return "detail";
	}
}

	