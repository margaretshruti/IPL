// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class DropDown extends HttpServlet {
 
   // Method to handle GET method request.
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String title = "Orginated Place";
      String docType ="<!doctype html>\n";
      String result="Null";
        String value = request.getParameter("DropValue");
        String[] words=new String[]{"Africa","US","UK","Italy"};
        if(Integer.parseInt(value)<=words.length){
            result=words[Integer.parseInt(value)-1];
        }
      out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<center><h1 align = \"center\">" + title + "</h1>\n" +
                  "<h2><b>Best Player is  </b>: "
                  + result+ "</h2></center>\n" +
            "</body>"+
            
        "</html>"
      );
   }

   // Method to handle POST method request.
   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      doGet(request, response);
   }
}