package edu.progra.factory.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



import edu.progra.bean.Informacion;

import edu.progra1.factory.Entity;
import edu.progra.util.DBConection;

public class MySQLInformacionDAO implements Entity<Informacion> {
	


	@Override
	public Informacion mostrar() {
		Informacion cursoInfo=new Informacion();
		Connection con=null;
		try{
			con=DBConection.
					getConnection();
			String sql="SELECT * FROM t_informacion";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			Informacion curso;
			while(rs.next()){
				curso = new Informacion();
				curso.setCodigo(rs.getString("codigoCurso"));
				curso.setCreditos(rs.getInt("creditos"));
				curso.setRequisitos(rs.getString("requisitos"));
				curso.setCondicion(rs.getString("condicion"));
				cursoInfo=curso;
				
			}
		}catch(Exception ex){
			DBConection.closeConnection(con);
		}
		return cursoInfo;
	}
	
	@Override
	public Informacion findByPk(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
