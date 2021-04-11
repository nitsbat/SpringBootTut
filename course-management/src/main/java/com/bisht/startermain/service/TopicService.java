package com.bisht.startermain.service;

import com.bisht.startermain.model.Topic;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic(1, "Java", "Introduction to Java"),
            new Topic(2, "Java Spring", "Introduction to Spring Framework"),
            new Topic(3, "Hibernate", "Introduction to Hibernate")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }
}
