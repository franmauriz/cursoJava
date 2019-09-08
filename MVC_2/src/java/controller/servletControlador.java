package controller;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.Rectangulo;

@WebServlet(name = "servletControlador", urlPatterns = {"/servletControlador"})
public class servletControlador extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        
        Rectangulo recRequest = new Rectangulo(1,2);
        Rectangulo recSession = new Rectangulo(3,4);
        Rectangulo recApplication = new Rectangulo(5,4);
        
        if("agregarVariables".equals(accion)){
            
            request.setAttribute("rectanguloRequest", recRequest);
            
            HttpSession session = request.getSession();
            session.setAttribute("rectanguloSession", recSession);
            
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloApplication", recApplication);
            
            request.setAttribute("mensaje", "Variables agregadas");
            
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }else if("listarVariables".equals(accion)){
            
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
            
        }else{
            
            request.setAttribute("mensaje", "Accion no proporcionada");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }
    }
}
