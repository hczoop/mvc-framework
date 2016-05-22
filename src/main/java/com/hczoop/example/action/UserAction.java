package com.hczoop.example.action;

import com.hczoop.example.entity.User;
import com.hczoop.mvc.action.Action;
import com.hczoop.mvc.action.ActionForm;

public class UserAction implements Action{

	public String execute(ActionForm form) {
		User user = (User)form;
		System.out.println(user.toString());
		if(null != user && user.getName().equals("hczoop")){
			return "success";
		}else{
			return "fail";
		}
	}

}
