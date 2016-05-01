package com.lihuanyu.controllers;

import com.lihuanyu.dto.MainCourseJson;
import com.lihuanyu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyADMIN on 16/5/1.
 */
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/maincourse")
    public MainCourseJson getMainCourse(){
        return courseService.getMainCourse();
    }

    @RequestMapping("/courselistpage")
    public void getAllCourse(int page){

    }

    @RequestMapping("/historycourse")
    public void getHistoryCourse(){
        return;
    }
}
