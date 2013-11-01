package edu.progra1.factory;

import edu.progra.bean.*;
import edu.progra.factory.mysql.*;
import edu.progra.factory.mysql.MySQLLoginLogoutDAO;


public final class MySQLDAOFactory extends DAOFactory {
	@Override
	public Entity<Informacion> getCursoDAO() {
		// TODO Auto-generated method stub
		return new MySQLInformacionDAO();
	}
	
	public Entity<Contenido> getTemasDAO() {
		// TODO Auto-generated method stub
		return new MySQLContenidoDAO();
	}
	
	@Override
	public Entity<LoginLogout> getLoginDAO() {
		// TODO Auto-generated method stub
		return new MySQLLoginLogoutDAO();
	}
	
	public Entity<Bibliografia> getBibliografiaDAO() {
		// TODO Auto-generated method stub
		return new MySQLBibliografiaDAO();
	}

}
