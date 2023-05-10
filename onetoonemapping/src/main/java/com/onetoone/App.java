package com.onetoone;
import com.onetoone.entity.*;

import java.util.ArrayList;
import java.util.List;

import com.onetoone.dao.*;
public class App 
{
    public static void main( String[] args )
    {
    	 Instructor instructor = new Instructor();
    	 instructor.setFirstName("Shiva");
    	 instructor.setLastName("Pillai");
    	 instructor.setEmail("shiva@gmail.com");
    	 
    	 InstructorDao instructorDao = new InstructorDao();
         
         
         InstructorDetail instructorDetail = new InstructorDetail();
         instructorDetail.setYoutubeChannel("shivarock.youtube");
         instructorDetail.setHobby("Playing Football");
         
         
         instructorDetail.setInstructor(instructor);
         
         
//         instructor.setInstructorDetail(instructorDetail);
         
         instructorDao.saveInstructor(instructor);
         List<Course> courses = new ArrayList<>();
   	  Course tempCourse1 = new Course();
   	  tempCourse1.setTitle("The Book");
   	  tempCourse1.setInstructor(instructor);
   	  courses.add(tempCourse1);
   	  
   	  CourseDao coursedao = new CourseDao();
         coursedao.saveCourse(tempCourse1);

         
         
    }
}
