package com.bisht.startermain.topic;

import com.bisht.startermain.model.Topic;
import com.bisht.startermain.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topic")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topic/{id}")
    public Topic getAllTopics(@PathVariable String id) {
        return topicService.getTopicById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topic")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }
}
