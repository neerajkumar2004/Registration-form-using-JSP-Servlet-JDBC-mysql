/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void dopost(HttpServletRequest request, HttpServletResponse response)
            throws  ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet register</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet register at neeraj's machine  </h1>");
            String name=request.getParameter("name");
            String password=request.getParameter("password");
            String email=request.getParameter("email");
            out.println("<h1> name:"+name+"</h1>");
             out.println("<h1> password:"+password+"</h1>");
             out.println("<h1> email:"+email+"</h1>");
            String url="jdbc:mysql://localhost:3306/youtube";
            String uname="root";
            String pass="2004";
             String query="insert into users(name,password,email) values(?,?,?);";
              try{
                 Class.forName("com.mysql.cj.jdbc.Driver"); 
                 
           }catch(ClassNotFoundException e){
          System.out.println(e.getMessage());
}    try{
    Connection con= DriverManager.getConnection(url, uname, pass);
                        
                
                 PreparedStatement p=con.prepareStatement(query);
                 p.setString(1,name);
                 p.setString(2,password);
                 p.setString(3,email);
                 
          
           p.executeUpdate();
            
         out.println("<h1> done......</h1>");
                
            }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("<h1> error occured</h1>");
        }
            out.println("</body>");
            out.println("</html>");
    
       
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        dopost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      dopost(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
