package view;

import java.sql.Connection;

import controller.AlunosJdbcDAO;
import controller.JdbUtil;
import model.Alunos;

public class AlunosExec {

	public static void main(String[] args) {
		Alunos alunos = new Alunos();
		try {
			//alunos.setNome("Carol Cardoso");
			//alunos.setEndereco("Av �guia de Haia, 2600");
			//alunos.setBairro("Jd S�o Nicolau");
			//alunos.setCep(3811111);
					
			Connection connection = JdbUtil.getConnection();
			AlunosJdbcDAO alunosJdbcDao = new AlunosJdbcDAO(connection);
			
			//alunosJdbcDao.salvar(alunos);
			alunosJdbcDao.deletar(1);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
