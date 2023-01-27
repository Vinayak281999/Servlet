package com.xworkz.countryCitizen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/C")
public class Country extends HttpServlet {
	
	public Country() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Running init in server");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String name=req.getParameter("name");
		String midName=req.getParameter("midName");
		String lastName=req.getParameter("lastName");
		String gender=req.getParameter("gender");
		String age=req.getParameter("age");
		
		String Qualification=req.getParameter("Qualification");
		String language=req.getParameter("language");
		String religion=req.getParameter("religion");
		String cast=req.getParameter("cast");
		String SubCast=req.getParameter("SubCast");
		
		
		String oldCountry=req.getParameter("oldCountry");
		String oldStateName=req.getParameter("oldStateName");
		String oldCityName=req.getParameter("oldCityName");
		String oldAddress=req.getParameter("oldAddress");
		String oldHouseNo=req.getParameter("oldHouseNo");
		
		
		String currentLocation=req.getParameter("currentLocation");
		String applyCountryName=req.getParameter("applyCountryName");
		String yearOfStaying=req.getParameter("yearOfStaying");
		String newAddress=req.getParameter("newAddress");
		String newCityName=req.getParameter("newCityName");
		
		
		System.out.println(name);
		System.out.println(midName);
		System.out.println(lastName);
		System.out.println(gender);
		System.out.println(age);
		
		System.out.println(Qualification);
		System.out.println(language);
		System.out.println(religion);
		System.out.println(cast);
		System.out.println( SubCast);
		
		System.out.println(oldCountry);
		System.out.println(oldStateName);
		System.out.println(oldCityName);
		System.out.println(oldAddress);
		System.out.println(oldHouseNo);
		
		System.out.println(currentLocation);
		System.out.println(applyCountryName);
		System.out.println(yearOfStaying);
		System.out.println(newAddress);
		System.out.println(newCityName);
		
PrintWriter writer = resp.getWriter();
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+name+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+midName+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+lastName+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+gender+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+age+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+Qualification+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+language+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+religion+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+cast+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+oldCountry+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+oldCountry+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+oldStateName+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+oldCityName+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+oldAddress+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+currentLocation+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+applyCountryName+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+yearOfStaying+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+newAddress+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Person"+newAddress+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
	}
}
