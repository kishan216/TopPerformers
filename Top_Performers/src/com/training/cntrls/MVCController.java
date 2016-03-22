package com.training.cntrls;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.daos.DepartmentDAO;
import com.training.daos.StudentDAO;
import com.training.entity.Department;
import com.training.entity.Student;

@Controller
public class MVCController {

	@Autowired
	private StudentDAO s;
	
	@Autowired
	private DepartmentDAO d;
	
	public StudentDAO getS() {
		return s;
	}

	public void setS(StudentDAO s) {
		this.s = s;
	}

	public DepartmentDAO getD() {
		return d;
	}

	public void setD(DepartmentDAO d) {
		this.d = d;
	}

	@Autowired
	private ModelAndView mdl;
	
	@Autowired
	private Student stud;
	
	
	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Autowired
	private Department dept;
	
	@RequestMapping("/")
	public String init(){
		return "index";
	}
	
	@ModelAttribute("deptList")
	public List<Department> deptValues(){
		List<Department> dlist=d.findAll();
		return dlist;		
	}
	
	@RequestMapping(value="/addStud",method = RequestMethod.GET)
	public ModelAndView addStud(){
		mdl.addObject("command",stud);
		mdl.setViewName("Add_Student");
		return mdl;
	}
	
	@RequestMapping(value="/addDept",method = RequestMethod.GET)
	public ModelAndView addDept(){
		mdl.addObject("command",dept);
		mdl.setViewName("Add_Department");
		return mdl;
	}
	
	@RequestMapping(value="/addDept",method=RequestMethod.POST)
	public ModelAndView addDeptValues(@ModelAttribute("dept") Department depart){
		d.add(depart);
		mdl.addObject("depart", depart);
		mdl.setViewName("View_Department");
		return mdl;
	}
	
	@RequestMapping(value="/addStud",method=RequestMethod.POST)
	public ModelAndView addStudValues( @ModelAttribute("stud") Student student){
		dept=d.find(student.getDept().getDeptId());
		student.setDept(dept);
		student.setGrade(student.calculate());
		s.add(student);	
		mdl.addObject("student",student);
		mdl.setViewName("View_Student");
		return mdl;
	}
	
	@RequestMapping("/showAll")
	public ModelAndView showAll(){
		List<Department> deptList=d.findAll();
		mdl.addObject("deptList",deptList);
		mdl.setViewName("Show");
		return mdl;
	}
	
	@RequestMapping("/top/{id}")
	public ModelAndView top(@PathVariable("id") int id1){
		List<Student> topList=s.findTop(id1);
		mdl.addObject("topper",topList);
		mdl.setViewName("topper");
		return mdl;
	}
}
