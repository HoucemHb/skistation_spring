package tn.fst.spring.skistation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.fst.spring.skistation.entities.Course;
import tn.fst.spring.skistation.entities.enums.TypeCourse;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByLevel(int level);
    
    List<Course> findByTypeCourse(TypeCourse typeCourse);
}
