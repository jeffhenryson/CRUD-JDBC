package com.example.espelhoJDBC.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// Você pode nomear esse arquivo como quiser, mas saiba que ele é para fazer a conexão com o banco de dados.

public class testeController {

	public static Connection connectDataBase() {
			
			Connection connect = null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connect = DriverManager.getConnection("jdbc:mysql://localhost/*NOME DO SEU BANCO DE DADOS*", "*NOME DE USUARIO*", "*SENHA DE USUARIO*");
			} catch (ClassNotFoundException e) {
				System.out.println("Error");
			} catch (SQLException e) {
				System.out.println("Error");
			}
			
			return connect;
		}
}
