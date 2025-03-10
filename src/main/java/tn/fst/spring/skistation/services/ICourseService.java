package tn.fst.spring.skistation.services;

import tn.fst.spring.skistation.entities.Course;
import tn.fst.spring.skistation.entities.Piste;

import java.util.List;

public interface ICourseService {
    List<Course> retrieveAllCourses();
    Course addOrUpdateCourse(Course course);
    void removeCourse (Course course);
    Course retrieveCourse (Long numCourse);
}
