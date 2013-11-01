package edu.progra.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.progra.bean.Bibliografia;
import edu.progra1.factory.DAOFactory;

/**
 * Servlet implementation class BibliografiaServlet
 */
@WebServlet("/BibliografiaServlet")
public class BibliografiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BibliografiaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer cod=Integer.parseInt(request.getParameter("cod"));
		
		if(cod==1){
		Bibliografia bibliografia= new Bibliografia();
		DAOFactory.getFactory(DAOFactory.MYSQL).
		getBibliografiaDAO().mostrar();
			request.setAttribute("bibliografia", bibliografia);
	
		request.getRequestDispatcher("/bibliografia.jsp").forward(request,response);
		}else if(cod==2){
			Bibliografia bibliografia= new Bibliografia();
			DAOFactory.getFactory(DAOFactory.MYSQL).
			getBibliografiaDAO().mostrar();
				request.setAttribute("bibliografia", bibliografia);
		
			request.getRequestDispatcher("/bibliografiaLibro2.jsp").forward(request,response);
			
		}else if (cod==3){
			Bibliografia bibliografia= new Bibliografia();
			DAOFactory.getFactory(DAOFactory.MYSQL).
			getBibliografiaDAO().mostrar();
				request.setAttribute("bibliografia", bibliografia);
		
			request.getRequestDispatcher("/bibliografiaLibro3.jsp").forward(request,response);
			
		}else{
			Bibliografia bibliografia= new Bibliografia();
			DAOFactory.getFactory(DAOFactory.MYSQL).
			getBibliografiaDAO().mostrar();
				request.setAttribute("bibliografia", bibliografia);
		
			request.getRequestDispatcher("/bibliografiaLibro4.jsp").forward(request,response);
		}
	}

	
}
