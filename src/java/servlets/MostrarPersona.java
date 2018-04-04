/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlet.JAXBException_Exception;
import servlet.ServiciosBasicos_Service;

/**
 *
 * @author janto
 */
public class MostrarPersona extends HttpServlet {

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
         servlet.ServiciosBasicos_Service service = new ServiciosBasicos_Service();
        String name = request.getParameter("name");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MostrarPersona</title>");            
            out.println("</head>");
            out.println("<body>");
            try {
                servlet.Persona p = service.getServiciosBasicosPort().mostarPersona(name);
                if(p!=null){
                out.println("<h1>Name: "+ p.getName() + "</h1>");
                out.println("<h1>Email: "+ p.getEmail()+ "</h1>");
                out.println("<h1>Telephone: "+ p.getTelephone() + "</h1>");
                }else{
                           out.println("<h1>El usuario: " + name + " " + "no se encuentra en la agenda"+ "</h1>");
                        }
                out.println("<form action='/ClienteWebJuanan/Main' method='POST'>");
               
                out.println("<input type='submit' value='Volver Página inicial'>");
            out.println("</form>");
            } catch (JAXBException_Exception ex) {
                Logger.getLogger(MostrarPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
////            try {
////                p = service.getServiciosBasicosPort().mostarPersona(name);
            out.println("<h1>Servlet MostrarPersona at " + request.getContextPath() + "</h1>");
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
