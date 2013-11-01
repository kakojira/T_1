package edu.progra.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.progra.bean.Informacion;
import edu.progra1.factory.DAOFactory;

/**
 * Servlet implementation class InformacionServlet
 */
@WebServlet("/InformacionServlet")
public class InformacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InformacionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Informacion curso= new Informacion();
		DAOFactory.getFactory(DAOFactory.MYSQL).
		getCursoDAO().mostrar();
			request.setAttribute("curso", curso);
			request.getRequestDispatcher("/informacion.jsp").
						forward(request, response);
	}

	

}
