package boot.spring1.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Java Framework", "Java Framework Description"),
			new Topic("js", "JS Framework", "JS Framework Description")				
			));
	
	public List<Topic>getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getIdString().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);	
	}
	
	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			
			if (t.getIdString().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}	

}
