package com.example.demo;

import com.example.demo.entity.Course;
import com.example.demo.entity.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


@SpringBootTest(classes=DemoApplication.class)
public class CourseRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CourseRepository courseRepository;

    @Test
    public void findbyId_basic() {
        Course course = courseRepository.findById(10001L);
        assertEquals("JPA in 50 steps", course.getName());
    }

    @Test
    @DirtiesContext
    public void deletebyId_basic() {
        courseRepository.deleteById(10002L);
        assertNull(courseRepository.findById(10002L));

    }
}
