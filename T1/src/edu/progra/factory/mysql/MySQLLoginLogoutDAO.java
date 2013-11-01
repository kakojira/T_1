package edu.progra.factory.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;





import edu.progra.bean.LoginLogout;

import edu.progra1.factory.Entity;
import edu.progra.util.DBConection;

public class MySQLLoginLogoutDAO implements Entity<LoginLogout> {
	


	@Override
	public LoginLogout  mostrar() {
		
		return null;
	}
	
	@Override
	public LoginLogout findByPk(String id) {
		// TODO Auto-generated method stub
		LoginLogout usuariobd = null;
		Connection con=null;
		try{
			con=DBConection.getConnection();
			String sql="SELECT * FROM t_usuario WHERE cuenta=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				usuariobd = new LoginLogout();
				usuariobd.setUsuario(rs.getString("cuenta"));
				usuariobd.setAlias(rs.getString("alias"));
				usuariobd.setContraseña(rs.getString("clave"));
			}
		}catch(Exception ex){
			ex.printStackTrace();
			DBConection.closeConnection(con);
		}
		return usuariobd;
		
	}

}
