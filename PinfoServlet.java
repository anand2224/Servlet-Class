import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class PinfoServlet extends HttpServlet{
    public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        //req logic
        String name=request.getParameter("NAME");
        String gender=request.getParameter("GENDER");
        int age=Integer.parseInt(request.getParameter("Age"));
        String status="";

        if(gender.equalsIgnoreCase("MALE")){
            if(age>=21)
            status="major";
            else
            status="minor";
        }
        else if(gender.equalsIgnoreCase("FEMALE")){
            if(age>21)
            status="major";
            else
            status="minor";
        }
        //response code in html
        out.print("<body>");
        out.print("<h1>Pinfo system</h1>");
        out.print("<table align=center width=35%>");
        out.print("<tr><td>Name:</td>");
        out.print("<td>"+name+"</td></tr>");
        out.print("<tr><td>GENDER:</td>");
        out.print("<td>"+gender+"</td></tr>");
        out.print("<tr><td>Status:</td>");
        out.print("<td>"+status+"</td>");
        out.print("</table></body");
        out.close();
    }
    
}