package com.xworkz.method;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Decoder.Text;





@WebServlet(loadOnStartup = 1,urlPatterns = "/N")
public class TypeMethods extends HttpServlet {
	
	

	public TypeMethods() {
		System.out.println("Server On");
		}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get form  TypeMethods");
		String data="get my car";
		 PrintWriter writer = resp.getWriter();
		 writer.print(data);
		resp.setContentType("text/plain");
				
		
	}
   @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("post from Type method");
    String data="post java";
    PrintWriter writer = resp.getWriter();
    writer.print(data);
    resp.setContentType("text/plain");
    }
   @Override
protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("put from Type method");
	String data="Put this method";
	PrintWriter writer=resp.getWriter();
	writer.print(data);
    resp.setContentType(data);
}
@Override
protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println(" Delete form  TypeMethods");
	String data="Delete name";
	 PrintWriter writer = resp.getWriter();
	 writer.print(data);
	resp.setContentType("text/plain");
}

@Override
protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Option form  TypeMethods");
	String data="Option my Life";
	 PrintWriter writer = resp.getWriter();
	 writer.print(data);
	resp.setContentType("text/plain");
}

     @Override
    protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 System.out.println("Trace form  TypeMethods");
         String data="Trace my Life";
    	 PrintWriter writer = resp.getWriter();
    	  writer.print(data);
    	  resp.setContentType("text/plain");
    }
     @Override
    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 System.out.println("head form  TypeMethods");
         String data=" head";
    	 PrintWriter writer = resp.getWriter();
    	  writer.print(data);
    	  resp.setContentType("text/plain");
    }
    
     
}
