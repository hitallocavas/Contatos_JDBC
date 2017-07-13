package tests;

import java.sql.*;

public class JDBCExample {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		
		Contato hitallo = new Contato("108.421.534-97","Hitallo Cavalcanti da Silva", "Rua Joaquim Aguiar, 88, Varzea", "hcs3@cin.ufpe.br", "18/04/1996");
		
		Insere insert = new Insere(hitallo);
		
		
	}

}
