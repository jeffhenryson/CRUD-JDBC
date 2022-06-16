package com.example.espelhoJDBC.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.example.espelhoJDBC.Controller.testeController;

public class testeRepository {

//	Você vai ter que importar o Controller para o Repository, pois como ele vai fazer o crud sem puxar o banco de dados? e quem puxa o banco de dados é o Controller
	
	static testeController cinema = new testeController();
	static Connection connection = testeController.connectDataBase();
	
//	Classe main na qual vão ser chamados os metodos.
	
public static void main(String[] args) {
		
		createTeste(null);
		readTeste();
		updateTeste(0, null);
		deleteTeste(0);
		
	}


// São os meteodos do CRUD: Criar, Ler, Atualizar e deletar.

private static void createTeste(String x, int y) {

	try {
		PreparedStatement prep =  connection.prepareStatement("INSERT INTO *TABELA DO BANCO* (OS ATRIBUTOS DOS BANCOS) VALUES (null,?) *ONDE TEM (null,?) *VAI COLOCAR A QUANTIDADE DE ? NECESSARIAS *");
		prep.setString(1, "PRIMEIRO ATRIBUTO");
		prep.setInt(2, "SEGUNDO ATRIBUTO");
		prep.executeUpdate();
	} catch (SQLException e) {
		System.out.println("Error");
	}
	
}

private static void readTeste() {
	
	ResultSet *NOME DO BANCO DE DADOS*;
	
	try {
		*NOME DO BANCO DE DADOS* = connection.createStatement().executeQuery("SELECT * FROM *NOME DA TABELA* ");
		while(NOME DO BANCO DE DADOS.next()) {
			System.out.println(NOME DO BANCO DE DADOS.getInt("id") + " " + NOME DO BANCO DE DADOS.getString("nome"));
		}
	} catch (SQLException e) {
		System.out.println("Error");
	}
	
}

private static void updateTeste(int id, String X) {

	try {
		PreparedStatement prep =  connection.prepareStatement("INSERT INTO *TABELA DO BANCO* (OS ATRIBUTOS DOS BANCOS) VALUES (null,?) *ONDE TEM (null,?) *VAI COLOCAR A QUANTIDADE DE ? NECESSARIAS *");
		prep.setString(1, "PRIMEIRO ATRIBUTO");
		prep.setInt(2, "SEGUNDO ATRIBUTO");
		prep.executeUpdate();
	} catch (SQLException e) {
		System.out.println("Error");
	}
	
	
}

private static void deleteTeste(int i) {

	try {
		PreparedStatement prep = connection.prepareStatement("DELETE FROM *TABELA DO BANCO* WHERE id = ?;");
		prep.setInt(1, id);
		prep.executeUpdate();
	} catch (SQLException e) {
		System.out.println("Error!");
	}
	
}
	
}
