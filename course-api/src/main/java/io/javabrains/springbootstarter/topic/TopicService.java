package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<Topic> topics = new ArrayList<> (Arrays.asList(
			new Topic("1spring", "1 java", "1 some"),
			new Topic("2spring", "2 java", "2 some"),
			new Topic("3spring", "3 java", "3 some"),
			new Topic("4spring", "4 java", "4 some"),
			new Topic("5spring", "5 java", "5 some"),
			new Topic("6spring", "6 java", "6 some")
			));

		public List<Topic> getAllTopics(){
			return topics;
		}
		
		public Topic getTopic(String id) {
			return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		}

		public void addTopic(Topic topic) {
			topics.add(topic);
		}

		public void updateTopic(String id, Topic topic) {
			int count = 0;
			for(Topic t : topics) {
				if(t.getId().equals(id)){
					topics.set(count, topic);
					return;
				}
				count++;
			}
			
		}

		public void deleteTopic(String id) {
			topics.removeIf(t -> t.getId().equals(id));
		}
//			int count = 0;
//			for(Topic t : topics) {
//				if(t.getId().equals(id)){
//					// topics.set(count, topic);
//					topics.remove(t);
//					return;
//				}
//				count++;
//			}
//		}
}

