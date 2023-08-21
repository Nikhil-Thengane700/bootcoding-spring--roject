package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{
    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(145,"Java Core Course", "This is Course contains basics of java ") );
        list.add(new Course(4343,"SpringBoot Course", "Creating spring boot project ") );
    }


    public List<Course> getCourses() {
        return list;
    }
    public Course getCourse(long courseId){
       Course c=null;
       for(Course course:list){
           if(course.getId()==courseId){
               c=course;
               break;
           }
       }
       return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
}
