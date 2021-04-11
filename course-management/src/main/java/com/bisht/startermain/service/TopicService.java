package com.bisht.startermain.service;

import com.bisht.startermain.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Java", "Java", "Introduction to Java"),
            new Topic("spring", "Java Spring", "Introduction to Spring Framework"),
            new Topic("hibernate", "Hibernate", "Introduction to Hibernate")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopicById(String id) {
        return topics.stream().filter(a -> a.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
