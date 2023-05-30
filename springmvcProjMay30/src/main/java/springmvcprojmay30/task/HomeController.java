package springmvcprojmay30.task;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
public String home() {
	return "welcome to wiley home";
}
}
