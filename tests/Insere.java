package tests;
import java.security.KeyStore.ProtectionParameter;
import java.sql.*;
import java.util.Calendar;

public class Insere {
 
 
	public Insere(Contato contato) throws SQLException{
		
		
		Connection con = Conexao.novaConexao();
		
		String sql = "insert into contatos" +
				" (id,nome,email,endereco,dataNascimento)" +
				" values (?,?,?,?,?)";
		
		PreparedStatement pstm = con.prepareStatement(sql);
		
		pstm.setString(1,contato.getId().toString());
		pstm.setString(2,contato.getName().toString());
		pstm.setString(3,contato.getEmail().toString());
		pstm.setString(4,contato.getEndereco().toString());
		pstm.setString(5,contato.getDataNascimento().toString());	
		
		pstm.execute();
		pstm.close();
		
		System.out.println("Gravei");
		
		con.close();
		
	}
}
