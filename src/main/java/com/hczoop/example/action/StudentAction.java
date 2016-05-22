package com.hczoop.example.action;

import com.hczoop.example.entity.Student;
import com.hczoop.mvc.action.Action;
import com.hczoop.mvc.action.ActionForm;

public class StudentAction implements Action{

	public String execute(ActionForm form) {
		Student student = (Student)form;
		System.out.println(student);
		return "fail";
	}

}
