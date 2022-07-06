package boot.spring1.topic;

import java.util.List;

import org.apache.catalina.core.FrameworkListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topiccontroller {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
//				return Arrays.asList(
//				new Topic("spring", "Spring Framework", "Spring Framework Description"),
//				new Topic("Java", "Java Framework", "Java Framework Description"),
//				new Topic("JS", "JS Framework", "JS Framework Description")				
//				);
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id); 
	}
	
	@PostMapping("/topics/post")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);		
	}
	
	@PutMapping("/topics/put/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	
	@DeleteMapping("/topics/del/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id); 
	}
	
}
