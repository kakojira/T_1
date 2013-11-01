package edu.progra.factory.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



import edu.progra.bean.Contenido;

import edu.progra1.factory.Entity;
import edu.progra.util.DBConection;

public class MySQLContenidoDAO implements Entity<Contenido> {
	
	
	@Override
	public Contenido mostrar() {
		Contenido contenidoInfo=new Contenido();
		Connection con=null;
		try{
			con=DBConection.
					getConnection();
			String sql="SELECT * FROM t_contenido";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			Contenido temas;
			while(rs.next()){
				temas = new Contenido();
				temas.setTema1(rs.getString("tema1"));
				temas.setTema2(rs.getString("tema2"));
				temas.setTema3(rs.getString("tema3"));
				temas.setTema4(rs.getString("tema4"));
				temas.setTema5(rs.getString("tema5"));
				temas.setTema6(rs.getString("tema6"));
				temas.setTema7(rs.getString("tema7"));
				temas.setTema8(rs.getString("tema8"));
				temas.setTema9(rs.getString("tema9"));
				temas.setTema10(rs.getString("tema10"));
				temas.setTema11(rs.getString("tema11"));
				temas.setTema12(rs.getString("tema12"));
				contenidoInfo=temas;
				
			}
		}catch(Exception ex){
			DBConection.closeConnection(con);
		}
		return contenidoInfo;
	}
	@Override
	public Contenido findByPk(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
