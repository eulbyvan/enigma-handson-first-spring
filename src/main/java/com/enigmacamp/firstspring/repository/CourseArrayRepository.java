package com.enigmacamp.firstspring.repository;

import com.enigmacamp.firstspring.entity.Course;
import com.enigmacamp.firstspring.util.IRandomStringGenerator;
import com.thedeanda.lorem.Lorem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseArrayRepository implements ICourseRepository {

    private final IRandomStringGenerator randomStringGenerator;
    private final Lorem lorem;

    public CourseArrayRepository(@Qualifier("uuid") IRandomStringGenerator randomStringGenerator, Lorem lorem) {
        this.randomStringGenerator = randomStringGenerator;
        this.lorem = lorem;
    }

    private List<Course> courseList = new ArrayList<>();

    @Override
    public List<Course> getAll() {
        return courseList;
    }

    @Override
    public Course create(Course course) {
        course.setCourseId(randomStringGenerator.random());
        course.setDescription(lorem.getWords(50));
        courseList.add(course);
        return course;
    }

    @Override
    public Course findOne(String id) {
        Course course = null;
        for (Course c : courseList) {
            if (c.getCourseId().equals(id)) {
                course = c;
            }
        }
        return course;
    }
}
