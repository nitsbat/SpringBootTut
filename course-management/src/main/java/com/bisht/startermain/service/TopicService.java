package com.bisht.startermain.service;

import com.bisht.startermain.repository.TopicRepository;
import com.bisht.startermain.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Topic getTopicById(String id) {
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic updatedTopic) {
        topicRepository.save(updatedTopic);
    }

    public void deleteTopic(String id) {
        topicRepository.delete(id);
    }

    public TopicRepository getTopicRepository() {
        return topicRepository;
    }

    public void setTopicRepository(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }
}
