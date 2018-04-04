package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author janto
 */
public class Main extends HttpServlet {
//C:\Users\janto\AppData\Roaming\NetBeans\8.2\config\GF_4.1.1\domain1\config
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
            out.println("<title>Servlet Main</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action='/ClienteWebJuanan/GuardarPersona' method='POST'>");
                out.println("<h1>Introduce nombre</h1>"+"<input type='text' name='name'>");
                out.println("<br>");
                out.println("<h1>Introduce email</h1>"+"<input type='text' name='email'>");
                out.println("<br>");
                out.println("<h1>Introduce apellido</h1>"+"<input type='number' name='telephone'>");
                out.println("<br>");
                out.println("<input type='submit' value='Crear Persona'>");
            out.println("</form>");
            out.println("<hr>");
            out.println("<form action='/ClienteWebJuanan/DevolverAgenda' method='POST'>");
                out.println("<input type='text' name='name'>");
                out.println("<input type='submit' value='Ver Agenda'>");
            out.println("</form>");
             out.println("<form action='/ClienteWebJuanan/ValidarXSD' method='POST'>");
               
                out.println("<input type='submit' value='Validar XSD'>");
            out.println("</form>");
             out.println("<form action='/ClienteWebJuanan/ValidarDTD' method='POST'>");
               
                out.println("<input type='submit' value='Validar DTD'>");
            out.println("</form>");
            out.println("<form action='/ClienteWebJuanan/MostrarPersona' method='POST'>");
                out.println("<input type='text' name='name'>");
                out.println("<input type='submit' value='Ver persona'>");
            out.println("</form>");
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
