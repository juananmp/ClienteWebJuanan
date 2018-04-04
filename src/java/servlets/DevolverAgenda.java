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
import servlet.Persona;
import servlet.ServiciosBasicos_Service;

/**
 *
 * @author janto
 */
public class DevolverAgenda extends HttpServlet {

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
            response.setContentType("text/html;charset=UTF-8");
            servlet.ServiciosBasicos_Service service = new ServiciosBasicos_Service();
            String name = request.getParameter("name");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ValidarXSD</title>");            
            out.println("</head>");
            out.println("<body>");
           
               out.println("<form action='/ClienteWebJuanan/Main' method='POST'>");
               
            servlet.Persona p = new Persona();
            servlet.Agenda a = service.getServiciosBasicosPort().mostrarAgenda();
            out.println("<h1>Servlet ValidarXSD at " + a.getPersona().toString() + "</h1>");

////            for(servlet.Agenda){
////                
////            }
//            for(Persona pe : a.getPersona()){
//                if(pe.getName().equals(name)){
//                    p = pe;
//                    break;
//                }
//            }
  
                out.println("<input type='submit' value='Volver Página inicial'>");
            out.println("<h1>Servlet ValidarXSD at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");

          
        } catch (JAXBException_Exception ex) {
            Logger.getLogger(DevolverAgenda.class.getName()).log(Level.SEVERE, null, ex);
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
