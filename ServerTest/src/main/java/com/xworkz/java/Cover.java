package com.xworkz.java;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/myName")
public class Cover extends HttpServlet{
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running doGet in tubeLight....");
	
}
protected void doGet1(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Yes I am Modi");
}

}
