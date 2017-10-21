package com.example.tutorial5.service;

import java.util.List;

import com.example.tutorial5.model.CourseModel;
import com.example.tutorial5.model.StudentModel;

public interface CourseService
{
    CourseModel selectCourse (String id_course  );
    List<CourseModel> selectAllCourses ();


}