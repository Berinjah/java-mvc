package view;

import java.sql.Connection;

import controller.AlunosJdbcDAO;
import controller.JdbUtil;
import model.Alunos;

public class AlunosExec {

	public static void main(String[] args) {
		Alunos alunos = new Alunos();
		try {
			alunos.setNome("Manu Cardoso");
			alunos.setEndereco("Av Águia de Haia, 2600");
			alunos.setBairro("Jd São Nicolau");
			alunos.setCep(3811111);
					
			Connection connection = JdbUtil.getConnection();
			AlunosJdbcDAO alunosJdbcDao = new AlunosJdbcDAO(connection);
			
			//alunosJdbcDao.salvar(alunos);
			//alunosJdbcDao.deletar(2);
			//alunosJdbcDao.alterar(alunos, 2);
			alunosJdbcDao.listar();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
