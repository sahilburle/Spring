package boot.spring1.topic;

import java.util.Arrays;
import java.util.List;

import org.apache.catalina.core.FrameworkListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topiccontroller {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
//				Arrays.asList(
//				new Topic("spring", "Spring Framework", "Spring Framework Description"),
//				new Topic("Java", "Java Framework", "Java Framework Description"),
//				new Topic("JS", "JS Framework", "JS Framework Description")				
//				);
	}
	
//	public Topic getTopic(String id) {
//		
//	}
}
