package com.bisht.startermain.courses;

import com.bisht.startermain.service.TopicService;
import com.bisht.startermain.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topic/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId) {
        return courseService.getAllCourses(topicId);
    }

    @RequestMapping("/topic/{topicId}/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return courseService.getCourseById(courseId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topic/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        Topic topic = topicService.getTopicById(topicId);
        course.setTopic(topic);
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }
}
