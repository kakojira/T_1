package edu.progra.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.progra.bean.Contenido;
import edu.progra1.factory.DAOFactory;

/**
 * Servlet implementation class ContenidoServlet
 */
@WebServlet("/ContenidoServlet")
public class ContenidoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContenidoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer cod=Integer.parseInt(request.getParameter("cod"));
		
		if(cod==1){
			Contenido tema= new Contenido();
			DAOFactory.getFactory(DAOFactory.MYSQL).
			getCursoDAO().mostrar();
				request.setAttribute("tema", tema);
			request.getRequestDispatcher("/contenido.jsp").forward(request,response);
			
		}else if(cod==2){
			Contenido tema= new Contenido();
			DAOFactory.getFactory(DAOFactory.MYSQL).
			getCursoDAO().mostrar();
				request.setAttribute("tema", tema);
			request.getRequestDispatcher("/contenidoUnidad2.jsp").forward(request,response);
			
		}else if(cod==3){
			Contenido tema= new Contenido();
			DAOFactory.getFactory(DAOFactory.MYSQL).
			getCursoDAO().mostrar();
				request.setAttribute("tema", tema);
			request.getRequestDispatcher("/contenidoUnidad3.jsp").forward(request,response);
			
		}else{
			
			Contenido tema= new Contenido();
			DAOFactory.getFactory(DAOFactory.MYSQL).
			getCursoDAO().mostrar();
				request.setAttribute("tema", tema);
			request.getRequestDispatcher("/contenidoUnidad4.jsp").forward(request,response);
		}
	}


}
