package com.tanish;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	Controller
	Dao dao=new Dao(); 
	kgfhjhjhjhjfjghfkghk
	@RequestMapping("addStudent")
	public ModelAndView addStudent()
	{
		ModelAndView mv=new ModelAndView("studentform.jsp");
		return mv;
	}
	
	@RequestMapping("savestudent")
	public ModelAndView saveStudent(@ModelAttribute("stud") Student student)
	{
		dao.saveStudent(student);
		ModelAndView mv=new ModelAndView("saveconfirm.jsp");
		return mv;
	}
	
	@RequestMapping("searchStudent")
	public ModelAndView searchStudent()
	{
		ModelAndView mv=new ModelAndView("searchStudent.jsp");
		return mv;
	}
	
	@RequestMapping("searchStudentResult")
	public ModelAndView searchStudent(@RequestParam("id") int id)
	{
		Student student=dao.searchStudent(id);
		ModelAndView mv=new ModelAndView("searchResult.jsp");
		mv.addObject("student",student);
		return mv;
	}
	
	@RequestMapping("update")
	public ModelAndView updateForm()
	{
		ModelAndView mv=new ModelAndView("updateForm.jsp");
		return mv;
	}
	
	@RequestMapping("updateForm")
	public ModelAndView update(@RequestParam("id") int id)
	{
		Student student=dao.searchStudent(id);
		ModelAndView mv=new ModelAndView("updateFormFilled.jsp");
		mv.addObject("student",student);
		return mv;
	}
	
	@RequestMapping("updateStudent")
	public ModelAndView update(@ModelAttribute("student") Student student)
	{
		dao.update(student);
		ModelAndView mv=new ModelAndView("updateConfirm.jsp");
		return mv;
	}
	
	@RequestMapping("remove")
	public String remove()
	{
		return "removeForm.jsp";
	}
	
	@RequestMapping("removeConfirm")
	public ModelAndView remove(@RequestParam("id") int id)
	{
		Student student=dao.searchStudent(id);
		dao.removeStudent(id);
		ModelAndView mv=new ModelAndView("removeConfirm.jsp");
		mv.addObject("student",student);
		return mv;
	}
	
	
}


