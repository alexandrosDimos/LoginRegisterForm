/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.summit.registration;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author arc68
 */
@WebServlet(name = "LoginRegister", urlPatterns = {"/loginRegister"})
public class LoginRegister extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginRegister</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginRegister at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CustomerDAO cd = new CustomerDAOImpl();
        
        String userName = request.getParameter("Username");
        String email = request.getParameter("Email");
        String password = request.getParameter("Password");
        String submitType = request.getParameter("Submit");
        Customer c =new Customer();
        c = cd.getCustomer(userName,password);
        
        if( submitType.equals("Login") && c != null && c.getUsername()!=null){
            request.setAttribute("message", c.getUsername());
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        }else if(submitType.equals("Register")){
            c.setUsername(userName);
            c.setPassword(password);
            c.setEmail(email);
            cd.insertCustomer(c);
            request.setAttribute("successMessage","Registration done,pls login" );
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }else{
            request.setAttribute("message","Click on Register" );
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
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
