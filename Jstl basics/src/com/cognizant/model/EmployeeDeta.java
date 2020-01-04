package com.cognizant.model;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.model.Employee;

/**
 * Servlet implementation class EmployeeDeta
 */
@WebServlet("/EmployeeDeta")
public class EmployeeDeta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDeta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		Employee employee = new Employee();
        employee.setName("John");
        employee.setId("969143");
        employee.setGender("Male");
        employee.setDateOfBirth("17/09/1998");
        employee.setFullTime("tk");
        employee.setDepartment("Information Technology");
        employee.setSalary(120000);
        
        

        request.setAttribute("employee", employee);
        RequestDispatcher rd = request.getRequestDispatcher( "EmployeeDetails.jsp");
                                        rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
