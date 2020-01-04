package com.cognizant.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeptEmployee
 */
@WebServlet("/DeptEmployee")
public class DeptEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
		EmployeeDept employee = new EmployeeDept();
		        employee.setName("John");
		        employee.setId("969143");
		        employee.setGender("Male");
		        
		        employee.setDateOfBirth("17/09/1998");
		        
		        employee.setFullTime("tk");
		        employee.setDepartment("Information Technology");
		       
		        

		        request.setAttribute("employee", employee);
		        RequestDispatcher rd = request.getRequestDispatcher( "EmpDept.jsp");
		                                        rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
