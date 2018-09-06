package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Employee> list=new ArrayList<>();
	private ServletContext context;
	
@Override
public void init(ServletConfig config) throws ServletException {
	context= config.getServletContext();
	list.add(new Employee(12,"Malyka",10000,"java cloud"));
	list.add(new Employee(13,"Varuni",20000,"cloud"));
	list.add(new Employee(15,"Sandeep",99999,"java"));
	list.add(new Employee(16,"Poudel",40000,"javaEE"));
	list.add(new Employee(17,"Sameera",50000,"sap"));

}
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String employeeId=request.getParameter("employeeId");
		for (Employee employee : list) {
			if(employee.getEmployeeid()==Long.parseLong(employeeId))
			{
				out.println("<table border='1'>");
				out.println("<tr><th>"+employee.getEmployeeid()+"</th><th>"+employee.getEmployeename()+"</th><th>"+employee.getNameofdepartment()+"</th><th>"+employee.getSalary());
				out.println("</tr></table>");
			}
		}
		
	}

}
