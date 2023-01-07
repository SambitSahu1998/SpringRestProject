package com.springrest.springrest.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
//	List<Course> list;
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl()
	{
//		list=new ArrayList<>();
//		list.add(new Course(145,"Java Core Course","This Course contains basic of Java"));
//		list.add(new Course(4343,"Spring Boot Course","Creating Rest API using Spring Boot")); 	
	}
	
	
		
	
	@Override
	public List<Course> getCourse(){
//		return list;
		return courseDao.findAll();
	}


	@Override
	public Optional<Course> getCourse(long courseId) {
//		Course c=null;
//		for(Course course:list)
//		{
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
//		return c;
		
		return courseDao.findById(courseId);
	}


	@Override
	public Course addCourse(Course course) {
//		list.add(course);
//		return course;
		courseDao.save(course);
		return course;
	}
	
	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e->{
//			if(e.getId()==course.getId())
//			{
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
//		return course;
		courseDao.save(course);
		return course;
	}
	
	@Override
	public void deleteCourse(long parseLong)
	{
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		@SuppressWarnings("deprecation")
		Course entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
