/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kevin
 */
public class json extends HttpServlet {

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
            out.println("<title>Servlet json</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet json at " + request.getContextPath() + "</h1>");
            out.println("<h4>" + request.authenticate(response) + "</h4>");
            out.println("<h4>" + request.getCookies()+ "</h4>");
            out.println("<h4>" + request.getLocalPort() + "</h4>");
            out.println("<h4>" + request.getServerPort() + "</h4>");
            out.println("<h4>" + request.getSession() + "</h4>");
            out.println("<h4>" + request.getPathInfo() + "</h4>");
            out.println("<h4>" + request.getRequestURI() + "</h4>");
            out.println("<h4>" + request.getUserPrincipal() + "</h4>");
            out.println("<h4>" + request.getMethod() + "</h4>");
            out.println("<h4>" + request.getLocalName() + "</h4>");
            out.println("<h4>" + request.getServerName() + "</h4>");
            out.println("<h4>" + request.getServletPath() + "</h4>");
            out.println("<h4>" + request.getProtocol() + "</h4>");
            out.println("<h4>" + request.getScheme() + "</h4>");            
            out.println("<h4>" + request.getAuthType() + "</h4>"); 
            out.println("<h4>" + request + "</h4>");           
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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

