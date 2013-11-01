package edu.progra1.factory;



public interface Entity<T>{
	
	
	T mostrar();
	T findByPk(String id);


}
