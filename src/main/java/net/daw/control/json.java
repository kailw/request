/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
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
            out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\n" +
"              crossorigin=\"anonymous\">");
            out.println("</head>");
            out.println("<style>");
            out.println("</style>");            
            out.println("<body>");
            out.println("<div class='container'>");    
            
            out.println("<table class=\"table table-bordered\">");   
            out.println("<h3><u>Tabla de parámetros</u></h3>");            
            Map parMap = request.getParameterMap();
            for (Object key : parMap.keySet()) {
                String clave =(String) key;
                String [] valor = (String[]) parMap.get(clave);
                out.println("<tr><td> Parámetro: " + (String) key +  "</td><td> valor: " + Arrays.toString(valor) + "</td></tr>");
            }
            
            out.println("</table>");      
            
            out.println("<h3><u>Request Parámetros</u></h3>");            
            out.println("<h4> getContextPath():</h4>" + request.getContextPath());            
            out.println("<h4> getCookies(): </h4>" + Arrays.toString(request.getCookies()));                                          
            out.println("<h4> getMethod(): </h4>" + request.getMethod() + "</h4>");
            out.println("<h4> getLocalName():</h4>" + request.getLocalName() + "</h4>");            
            out.println("<h4> getLocalPort():</h4>" + request.getLocalPort() + "</h4>"); 
            out.println("<h4> getLocale():</h4>" + request.getLocale() + "</h4>"); 
            out.println("<h4> getLocalAddr():</h4>" + request.getLocalAddr()+ "</h4>");  
            out.println("<h4> getScheme():</h4>" + request.getScheme() + "</h4>");   
            out.println("<h4> getServerName():</h4>" + request.getServerName() + "</h4>");
            out.println("<h4> getServletPath():</h4>" + request.getServletPath() + "</h4>");            
            out.println("<h4> getServletContext():</h4>" + request.getServletContext() + "</h4>");
            out.println("<h4> getServerPort():</h4>" + request.getServerPort() + "</h4>");
            out.println("<h4> getSession():</h4>" + request.getSession() + "</h4>");      
            out.println("<h4> getProtocol():</h4>" + request.getProtocol() + "</h4>");
            out.println("<h4> getRemotePort():</h4>" + request.getRemotePort() + "</h4>");
            out.println("<h4> getRequestURI():</h4>" + request.getRequestURI() + "</h4>");   
            out.println("<h4> getRemoteHost():</h4>" + request.getRemoteHost()+ "</h4>");  
            out.println("<h4> getRequestedSessionId(): </h4>" + request.getRequestedSessionId() + "</h4>");  
            out.println("<h4> getReader():</h4>" + request.getReader() + "</h4>"); 
            out.println("<h4> getClass():</h4>" + request.getClass() + "</h4>");             
            out.println("<h4> getContentLength():</h4>" + request.getContentLength()+ "</h4>");  
            out.println("<h4> getContextPath():</h4>" + request.getContextPath()+ "</h4>");                          
            
            
            out.println("<h4> getRemoteUser():</h4>" + request.getRemoteUser()+ "</h4>");            
            out.println("<h4> getPathTranslated():</h4>" + request.getPathTranslated()+ "</h4>");            
            out.println("<h4> getAuthType():</h4>" + request.getAuthType() + "</h4>");
            out.println("<h4> getQueryString():</h4>" + request.getQueryString() + "</h4>");            
            out.println("<h4> getPathInfo():</h4>" + request.getPathInfo() + "</h4>");
            out.println("<h4> authenticate():</h4>" + request.authenticate(response) + "</h4>");
            out.println("<h4> getUserPrincipal():</h4>" + request.getUserPrincipal() + "</h4>");
            out.println("<h4> request:</h4>" + request + "</h4>");  
            out.println("</div>");
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



