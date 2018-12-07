package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{foo}")
	public Topic getTopic(@PathVariable("foo") String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
	
	
	@RequestMapping("/topics2")
	public List<Topics2> getAllTopics2(){
		return Arrays.asList(
				new Topics2(1,"1 hello"),
				new Topics2(2,"2 hello"),
				new Topics2(3,"3 hello"),
				new Topics2(4,"4 hello"),
				new Topics2(6,"6 hello"),
				new Topics2(5,"5 hello"),
				new Topics2(7,"7 hello"),
				new Topics2(2,"2 hello"),
				new Topics2(8,"8 hello")
				);
	}

	@RequestMapping("/stringtopics")
	public String getjustStringAllTopics() {
		return "ALL TOPICS";
	}
	
}
