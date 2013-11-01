package edu.progra.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.progra.bean.LoginLogout;
import edu.progra1.factory.DAOFactory;
import edu.progra1.factory.Entity;

/**
 * Servlet implementation class LoginLogoutServlet
 */
@WebServlet("/LoginLogoutServlet")
public class LoginLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginLogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoginLogout objusuario = new LoginLogout();
		objusuario.setUsuario(request.getParameter("txt_cuenta"));
		objusuario.setContraseña(request.getParameter("txt_clave"));
		
		LoginLogout usuariobd = null;
		Entity<LoginLogout> usuarioDAO=
			DAOFactory.getFactory(DAOFactory.MYSQL).getLoginDAO();
		usuariobd=usuarioDAO.findByPk(objusuario.getUsuario());
		
		String pagina="/mensaje.jsp";
		String mensaje="";
		if(usuariobd!=null){
			if(usuariobd.getContraseña().equals(objusuario.getContraseña())){
				HttpSession session= request.getSession(true);
				session.setAttribute("usuario", usuariobd);
				pagina="/informacion.jsp";
			}else{
				mensaje ="Password incorrecto";
			}
		}else{
			mensaje ="No existe usuario";
		}
		request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher(pagina).
			forward(request, response);
	}

}
