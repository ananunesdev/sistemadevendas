package br.com.sistema.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoBanco {
	final private String url = "jdbc:mysql://localhost/sistemadevendas";
	final private String usuario = "root";
	final private String senha = "";
	
	public Connection pegarconexao(){
		try {
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Erro ao se conectar ao banco de dados! " + erro);
		}
		return null;
		
	}
}
