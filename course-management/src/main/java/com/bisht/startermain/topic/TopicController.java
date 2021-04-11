package com.bisht.startermain.topic;

import com.bisht.startermain.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topic")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic(1, "Java", "Introduction to Java"),
                new Topic(2, "Java Spring", "Introduction to Spring Framework"),
                new Topic(3, "Hibernate", "Introduction to Hibernate")
        );
    }

}
