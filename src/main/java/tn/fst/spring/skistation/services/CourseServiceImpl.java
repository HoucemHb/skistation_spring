package tn.fst.spring.skistation.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.fst.spring.skistation.entities.Course;
import tn.fst.spring.skistation.entities.Piste;
import tn.fst.spring.skistation.repositories.CourseRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseRepository courseRepository;
    @Override
    public List<Course> retrieveAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course addOrUpdateCourse(Course course) {
        log.info("piste"+ course.toString());
        log.debug("DS1..............");
        log.debug("DS2");
        return courseRepository.save(course);
    }




    @Override
    public void removeCourse(Course course) {
        courseRepository.delete(course);
    }

    @Override
    public Course retrieveCourse(Long numCourse) {
        Optional<Course> courseOptional = courseRepository.findById(numCourse);
        return courseOptional.orElse(null);
    }





}
