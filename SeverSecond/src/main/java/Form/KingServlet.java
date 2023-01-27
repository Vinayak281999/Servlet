package Form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/F")
public class KingServlet extends HttpServlet {
	
	//public KingServlet() {
		//System.out.println("Create:"+this.getClass().getSimpleName());
		
	//}
	//@Override
	//public void init() throws ServletException {
	//	System.out.println("Running init in server");
	//}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget in server");
		
		String name=req.getParameter("name");
		String region=req.getParameter("region");
		String queens=req.getParameter("queens");
		String birth=req.getParameter("birth");
		String death=req.getParameter("death");
		
		System.out.println(name);
		System.out.println(region);
		System.out.println(queens);
		System.out.println(birth);
		System.out.println(death);
		
		PrintWriter writer = resp.getWriter();
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:skyblue'>");
		writer.print("king name"+name+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:red'>");
		writer.print("king region"+region+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:orange'>");
		writer.print("king queens"+queens+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:pink'>");
		writer.print("king birth"+birth+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:black'>");
		writer.print("king death"+death+"is sent succesfully");
		writer.print("</span>");
		writer.print("</html>");
		
	}
	

}
