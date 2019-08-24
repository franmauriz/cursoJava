/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author franmp
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

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
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String[] tecnologias = request.getParameterValues("tecnologia");
        String genero =request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String[] musicas= request.getParameterValues("musica");
        String comentario = request.getParameter("comentarios");
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Proceso Datos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos</h1>");
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<b>Usuario:</b>");
            out.println("</td>");
            out.println("<td>");
            out.println(usuario);
            out.println("</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>");
            out.println("<b>Password:</b>");
            out.println("</td>");            
            out.println("<td>");
            out.println(password);
            out.println("</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>");
            out.println("<b>Tecnologias:</b>");
            out.println("</td>");           
            out.println("<td>");
                out.println("<ul>");
                for(String tecno:tecnologias){
                    out.println("<li>" + tecno + "</li>" );
                }
                out.println("</ul>");
            out.println("</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>");
            out.println("<b>Genero:</b>");
            out.println("</td>");            
            out.println("<td>");
            out.println(genero);
            out.println("</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>");
            out.println("<b>Ocupación:</b>");
            out.println("</td>");            
            out.println("<td>");
            out.println(ocupacion);
            out.println("</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>");
            out.println("<b>Musica:</b>");
            out.println("</td>");            
            out.println("<td>");
                if(musicas != null){
                    out.println("<ul>");
                    for(String musi:musicas){
                        out.println("<li>" + musi + "</li>" );
                    }
                    out.println("</ul>");
                }
            out.println("</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>");
            out.println("<b>Comentario:</b>");
            out.println("</td>");            
            out.println("<td>");
            out.println(comentario);
            out.println("</td>");
            out.println("</tr>");
            
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
            out.close();
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Proceso Datos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El metodo <strong>GET</strong> no esta permitido</h1>");
            out.println("<a href='/ManejoFormulario'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
        }
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
