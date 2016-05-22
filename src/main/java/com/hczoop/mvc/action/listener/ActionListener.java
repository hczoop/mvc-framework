package com.hczoop.mvc.action.listener;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.hczoop.mvc.entity.MvcBean;
import com.hczoop.mvc.util.XmlParse;

public class ActionListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		String xmlpath = context.getInitParameter("mvc-config");
		String tomcatpath =context.getRealPath("\\");
		System.out.println(tomcatpath+xmlpath);
		Map<String, MvcBean> map = XmlParse.xmlParse(tomcatpath+xmlpath);
		System.out.println(map);
		context.setAttribute("mvc", map);
		System.out.println("提示：加载完成!");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO ServletContex销毁

	}

}
