package webSeries;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/W")
public class WebMovie extends HttpServlet {
	
	public WebMovie() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Running init in server");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("Running doget in server");
		
		String name=req.getParameter("name");
		String language=req.getParameter("language");
		String episodes=req.getParameter("episodes");
		String ott=req.getParameter("ott");
		String budget=req.getParameter("budget");
		
		System.out.println(name);
		System.out.println(language);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);
		
		PrintWriter writer = resp.getWriter();
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("Web Series"+name+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:blue'>");
		writer.print("Web Series"+language+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("Web Series"+episodes+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:pink'>");
		writer.print("Web Series"+ott+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("Web Series"+budget+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		
				
	}

}
