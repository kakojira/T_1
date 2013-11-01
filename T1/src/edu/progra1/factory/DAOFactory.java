package edu.progra1.factory;

import edu.progra.bean.*;


public abstract class  DAOFactory {

public static final int MYSQL=1;
	
	public static DAOFactory getFactory(int opcion){
		switch (opcion) {
		case MYSQL:
			return new MySQLDAOFactory();
		default:
			break;
		}
		return null;
	}
	
	public abstract Entity<Informacion> getCursoDAO();
	public abstract Entity<Contenido> getTemasDAO();
	public abstract Entity<LoginLogout> getLoginDAO();
	public abstract Entity<Bibliografia> getBibliografiaDAO();
	
	
	
}
