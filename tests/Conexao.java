package tests;
import java.sql.*;

public class Conexao {

	public static Connection novaConexao(){
		try {
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1/jdbctest", "root", "hit@sport");
		} catch (SQLException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
}
