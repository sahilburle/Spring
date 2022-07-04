package boot.spring1.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")		//only for get method
	public String sayHi() {
		return "Hi";
	}

}
