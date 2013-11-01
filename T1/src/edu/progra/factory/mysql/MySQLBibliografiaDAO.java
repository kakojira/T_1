package edu.progra.factory.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



import edu.progra.bean.Bibliografia;

import edu.progra1.factory.Entity;
import edu.progra.util.DBConection;

public class MySQLBibliografiaDAO implements Entity<Bibliografia> {
	
	
	@Override
	public Bibliografia mostrar() {
		Bibliografia bibliografiaInfo=new Bibliografia();
		Connection con=null;
		try{
			con=DBConection.
					getConnection();
			String sql="SELECT * FROM t_bibliografia";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			Bibliografia biblio;
			while(rs.next()){
				biblio = new Bibliografia();

				biblio.setLibro1(rs.getString("libro1"));
				biblio.setLibro2(rs.getString("libro2"));
				biblio.setLibro3(rs.getString("libro3"));
				biblio.setLibro4(rs.getString("libro4"));
				
				bibliografiaInfo=biblio;
				
			}
		}catch(Exception ex){
			DBConection.closeConnection(con);
		}
		return 	bibliografiaInfo;
	}
	@Override
	public Bibliografia findByPk(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
