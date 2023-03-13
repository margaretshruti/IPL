// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class Student extends HttpServlet {
 
   // Method to handle GET method request.
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String title = "Student Data";
      String docType ="<!doctype html>\n";
      String value=request.getParameter("RegValue");
      String resultname="";
      Integer resultrank=0;
      //   String value = request.getParameter("register");
        
        Student1[] arr;
        // Allocating memory for 2 objects
        // of type student
        arr = new Student1[4];
        // Initializing the first element
        // of the array
        arr[0] = new Student1(5001, "A",2);
        arr[1] = new Student1(5002, "B",1);
        arr[2] = new Student1(5003, "C",4);
        arr[3] = new Student1(5004, "D",3);
        for(int i=0;i<arr.length;i++){
            if(arr[i].id==Integer.parseInt(value)){
                  resultname=arr[i].name;
                  resultrank=arr[i].rank;
                  break;
         }

        }


        
      out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n"+"<style>table, td, th { border: 1px solid black;} table {border-collapse: collapse;} </style>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<center><h1 align = \"center\">" + title + "</h1>\n" +
               "<table>"+   
               "<thead><th>Student Reg No</th><th>Student Name</th><th>Student Rank</th></thead>\n"+
               "<tbody><tr><td>"+value+"</td><td>"+resultname+" </td><td>"+resultrank+" </td> </tr></tbody>"+
            "</table>"+"</body>"+            
        "</html>"
      );
   }

   // Method to handle POST method request.
   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      doGet(request, response);
   }
   class Student1 {
 
      public int id;
      public String name;
      public int rank;
   
      // Student class constructor
      Student1(int id, String name,int rank)
      {
          this.id = id;
          this.name = name;
          this.rank=rank;
      }
   
}
}