package com.example.demo.entity.repository;

import com.example.demo.entity.Course;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseRepository {

    @Autowired
    EntityManager em;

    public Course findById(Long id) {
        return em.find(Course.class ,id);
    }

    public void deleteById(Long id) {
        Course course = findById(id);
        em.remove(course);
    }

    public Course save(Course course) {
        Course courseObj = course;
        if (courseObj.getId() == null) em.persist(courseObj);
        else em.merge(courseObj);
        return courseObj;
    }
}
